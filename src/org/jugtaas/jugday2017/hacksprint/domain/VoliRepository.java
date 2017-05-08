package org.jugtaas.jugday2017.hacksprint.domain;

import org.jugtaas.jugday2017.hacksprint.models.Volo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Mockup repository voli
 */
public class VoliRepository {
    private List<Volo> voli = new ArrayList<>();
    private final String voliNomeFile = "data/voli.txt";
    private final String fieldSeparator = "\\|";

    private static VoliRepository istanza = null;

    private VoliRepository() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(voliNomeFile)))) {
            String line = reader.readLine();
            while(line != null) {
                String[] record = line.trim().split(fieldSeparator);

                // AL0000|LAX|LOS ANGELES INTL|CTS|SAPPORO CHITOSE|12383|ALITALIA|2500.0
                Volo volo = new Volo();
                volo.setCodice(record[0]);
                volo.setOrigine(record[2]);
                volo.setDestinazione(record[4]);
                volo.setDistanza(Float.parseFloat(record[5]));
                volo.setCompagniaAerea(record[6]);
                volo.setPrezzo(Float.parseFloat(record[7]));

                voli.add(volo);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Volo> findAll(String da, String a) {
        if (da == null) {
            return voli.stream().filter(v -> a.equals(v.getDestinazione()))
                    .collect(Collectors.toList());
        }

        if (a == null) {
            return voli.stream().filter(v -> da.equals(v.getOrigine()))
                    .collect(Collectors.toList());
        }

        return voli.stream()
                .filter(v -> da.equals(v.getOrigine()) && a.equals(v.getDestinazione()))
                .collect(Collectors.toList());
    }

    public static VoliRepository factoryVoliRepository() {
        if (istanza == null) {
            istanza = new VoliRepository();
        }

        return istanza;
    }
}

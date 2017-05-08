package org.jugtaas.jugday2017.hacksprint.domain;

import org.jugtaas.jugday2017.hacksprint.models.Volo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Mockup repository areoporti
 */
public class AeroportiRepository {
    private List<String> aeroporti = new ArrayList<>();
    private final String aeroportiNomeFile = "data/aeroporti.txt";
    private final String fieldSeparator = "\\|";

    private static AeroportiRepository istanza = null;

    private AeroportiRepository() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(aeroportiNomeFile)))) {
            String line = reader.readLine();
            while(line != null) {
                String[] record = line.trim().split(fieldSeparator);
                aeroporti.add(record[1]);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(aeroporti);
    }

    /**
     * Restituise l'intera lista degli aeroporti disponibili.
     *
     * @return la lista degli aeroporti
     */
    public List<String> findAll() {
        return aeroporti;
    }

    public static AeroportiRepository factoryAeroportiRepository() {
        if (istanza == null) {
            istanza = new AeroportiRepository();
        }

        return istanza;
    }

    /**
     * Verifica se la stringa "aeroporto" fornita è presente nella lista degli aeroporti esistenti.
     *
     * @param aeroporto una stringa che rappresenta il nome di un aeroporto.
     *
     * @return true se l'aeroporto esiste, false altrimenti
     */
    public boolean exists(String aeroporto) {
        if ("".equals(aeroporto)) {
            return false;
        }
        if (aeroporto == null) {
            return false;
        }
        return aeroporti.contains(aeroporto);
    }
}

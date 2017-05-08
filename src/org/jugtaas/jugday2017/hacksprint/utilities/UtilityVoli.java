package org.jugtaas.jugday2017.hacksprint.utilities;

import org.jugtaas.jugday2017.hacksprint.domain.AeroportiRepository;
import org.jugtaas.jugday2017.hacksprint.domain.VoliRepository;
import org.jugtaas.jugday2017.hacksprint.models.Volo;

import java.util.List;

/**
 * Classe UtilityVoli
 *
 * Contiene un insieme di utility per accedere all'elenco dei voli disponibili.
 * La classe è un singleton e per ottenere l'istanza occorre utilizzare il
 * metodo factory:
 *
 *     UtilityVoli utilityVoli = UtilityVoli.utilityVoliFactory();
 *
 * Per ottenere l'elenco dei voli esistenti fra 2 areoporti utilizzare:
 *
 *     List<Volo> voli = elencoVoliDisponibili(da, a);
 *
 *  da: una stringa che rappresenta un aeroporto esistente e indica il punto
 *      di partenza del volo.
 *  a: una stringa che rappresenta un aeroporto esistente e indica il punto
 *     di arrivo del volo.
 *
 *  Per ottenere l'elenco degli aeroporti disponibili utilizzare:
 *
 *     List<String> aeroporti = elencoAeroporti();
 *
 */
public class UtilityVoli {

    private static AeroportiRepository aeroportiRepository;
    private static VoliRepository voliRepository;
    private static UtilityVoli instance;

    private UtilityVoli() {
    }

    private void init() {
        aeroportiRepository = AeroportiRepository.factoryAeroportiRepository();
        voliRepository = VoliRepository.factoryVoliRepository();
    }

    /**
     * Elenca la lista dei voli disponibili per un aeroporto di partenza "da" ed un aeroporto di destinazione "a".
     * Se non ci sono voli disponibili restituisce una lista vuota.
     *
     * @param da aeroporto di partenza fra quelli disponibili dall'elenco degli aeroporti
     * @param a aeroporto di destinazione fra quelli disponibili dall'elenco degli aeroporti
     * @return una lista di voli
     *
     * @throws AeroportoNonEsisteException se le stringe fornite non esistono come aeroporti.
     */
    public List<Volo> elencoVoliDisponibili(String da, String a) throws AeroportoNonEsisteException {
        if (!aeroportoEsistente(da)) {
            throw new AeroportoNonEsisteException(da);
        }
        if (!aeroportoEsistente(a)) {
            throw new AeroportoNonEsisteException(a);
        }

        return voliRepository.findAll(da, a);
    }

    private boolean aeroportoEsistente(String aeroporto) {
        return aeroportiRepository.exists(aeroporto);
    }

    public List<String> elencoAeroporti() {
       return aeroportiRepository.findAll();
    }

    /**
     * Metodo factory che va utilizzato per istanziare la classe.
     *
     * @return l'istanza di classe singleton
     */
    public static UtilityVoli utilityVoliFactory() {
        if (instance == null) {
            instance = new UtilityVoli();
            instance.init();
        }

        return instance;
    }
}

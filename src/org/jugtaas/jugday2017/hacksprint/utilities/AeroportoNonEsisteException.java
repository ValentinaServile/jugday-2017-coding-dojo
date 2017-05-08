package org.jugtaas.jugday2017.hacksprint.utilities;

/**
 * Errore che indica un aeroporto non presente nel repository
 */
public class AeroportoNonEsisteException extends Throwable {
    public AeroportoNonEsisteException(String errore) {
        super(String.format("L'aeroport \"%s\" non è presente nella lista degli aeroporti disponibili", errore));
    }
}

package org.jugtaas.jugday2017.hacksprint.models;

/**
 * Modello che rappresenta una tratta da aeroporto A a aeroporto B.
 */
public class Volo {
    // Codice volo;
    private String codice;

    // Origine del volo
    private String origine;

    // Destinazione del volo
    private String destinazione;

    // Nome della compagnia aerea
    private String compagniaAerea;

    // Distanza in Km
    private float distanza;

    // Prezzo
    private float prezzo;

    public Volo() {}

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea) {
        this.compagniaAerea = compagniaAerea;
    }

    public float getDistanza() {
        return distanza;
    }

    public void setDistanza(float distanza) {
        this.distanza = distanza;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
}

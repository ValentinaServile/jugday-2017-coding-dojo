package org.jugtaas.jugday2017.hacksprint.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Mockup repository compagnie aeree
 */
public class CompagnieAereeRepository {
    private List<String> compagnie = new ArrayList<>();

    public CompagnieAereeRepository() {
        compagnie.add("alitalia");
        compagnie.add("airfrance");
        compagnie.add("lufthansa");
        compagnie.add("easy jet");
        compagnie.add("ryanair");
    }

    public List<String> findAll() {
        return compagnie;
    }
}

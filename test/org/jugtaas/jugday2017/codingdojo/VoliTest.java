package org.jugtaas.jugday2017.codingdojo;

import org.jugtaas.jugday2017.hacksprint.domain.VoliRepository;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by mario on 08/05/2017.
 */
public class VoliTest {

    @Test
    public void elencoVoliTest() {
        VoliRepository repo = VoliRepository.factoryVoliRepository();

        assertNotNull(repo);
        assertThat("Voli sono #0", 0, is(repo.findAll("Pippo", "Pluto").size()));
    }

    @Test
    public void elencoVoliWashingtonHelsinkiTest() {
        VoliRepository repo = VoliRepository.factoryVoliRepository();

        assertNotNull(repo);
        assertThat("I voli da Washington Dulles a Helsinki sono #5", 5, is(repo.findAll("WASHINGTON DULLES", "HELSINKI VANTAA").size()));
    }
}

package org.jugtaas.jugday2017.codingdojo;

import org.jugtaas.jugday2017.hacksprint.domain.AeroportiRepository;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AeroportiTest {

    @Test
    public void instantiationRepoTest() {

        AeroportiRepository repo = AeroportiRepository.factoryAeroportiRepository();

        assertNotNull(repo);
        assertThat("Gli aeroporti sono #94", 94, is(repo.findAll().size()));
    }
}

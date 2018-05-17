package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class TeamTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Team Team = new Team();
        the(Team).shouldNotBe("valid");
    }

}
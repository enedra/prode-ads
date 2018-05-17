package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class StatsTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Stats Stats = new Stats();
        the(Stats).shouldNotBe("valid");
    }

}
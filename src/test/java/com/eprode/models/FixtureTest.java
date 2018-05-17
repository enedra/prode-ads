package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class FixtureTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Fixture Fixture = new Fixture();
        the(Fixture).shouldNotBe("valid");
    }

}
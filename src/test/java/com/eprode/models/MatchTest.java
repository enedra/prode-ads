package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class MatchTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Match Match = new Match();
        the(Match).shouldNotBe("valid");
    }

}
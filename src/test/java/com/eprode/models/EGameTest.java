package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class EGameTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        EGame EGame = new EGame();
        the(EGame).shouldNotBe("valid");
    }

}

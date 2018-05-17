package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class ResultTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Result Result = new Result();
        the(Result).shouldNotBe("valid");
    }

}
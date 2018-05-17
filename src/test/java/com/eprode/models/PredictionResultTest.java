package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class PredictionResultTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        PredictionResult PredictionResult = new PredictionResult();
        the(PredictionResult).shouldNotBe("valid");
    }

}
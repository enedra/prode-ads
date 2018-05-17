package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class PredictionTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Prediction Prediction = new Prediction();
        the(Prediction).shouldNotBe("valid");
    }

}
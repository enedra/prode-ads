package com.eprode.models;

import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

public class UsersTest extends DBSpec {

    @Test
    public void shouldValidateRequiredAttributes() {
        Users Users = new Users();
        the(Users).shouldNotBe("valid");
    }

}
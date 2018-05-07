package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("egames")
public class EGame extends Model {

    static {
        validatePresenceOf("name", "description");
    }

}

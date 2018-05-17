package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("fixture")
public class Fixture extends Model {

    static {
        validatePresenceOf("id_fixture", "id_user", "cod_game");
    }

}
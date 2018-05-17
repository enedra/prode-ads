package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("match")
public class Match extends Model {

    static {
        validatePresenceOf("id_match","id_fixture", "id_user", "id_team" , "modalidad", "dates");
    }

}
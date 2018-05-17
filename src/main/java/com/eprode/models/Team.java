package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("team")
public class Team extends Model {

    static {
        validatePresenceOf("id_team", "id_user", "name");
    }

}
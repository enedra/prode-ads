package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("result")
public class Result extends Model {

    static {
        validatePresenceOf("id_result", "id_match", "id_stats", "rTeam1", "rTeam2");
    }

}
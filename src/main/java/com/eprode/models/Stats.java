package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("stats")
public class Stats extends Model {

    static {
        validatePresenceOf("id_stats", "id_user");
    }

}
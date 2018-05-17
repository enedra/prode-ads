package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("users")
public class Users extends Model {

    static {
        validatePresenceOf("id_user", "admin");
    }

}
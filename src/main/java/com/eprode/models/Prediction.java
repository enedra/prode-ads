package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("prediction")
public class Prediction extends Model {

    static {
        validatePresenceOf("id_prediction", "id_user", "id_match");
    }

}
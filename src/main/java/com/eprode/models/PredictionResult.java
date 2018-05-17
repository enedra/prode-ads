package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;


@Table("predictionResult")
public class PredictionResult extends Model {

    static {
        validatePresenceOf("id_prediction", "id_result", "difPRT1", "difPRT2");
    }

}
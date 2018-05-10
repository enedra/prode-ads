package com.eprode.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("egames")
public class EGame extends Model {

    static {
        validatePresenceOf("name", "cod_game");
    }

}

@Table("users")
public class Users extends Model {

    static {
        validatePresenceOf("id_user", "admin");
    }

}

@Table("fixture")
public class Fixture extends Model {

    static {
        validatePresenceOf("id_fixture", "id_user", "cod_game");
    }

}

@Table("team")
public class Team extends Model {

    static {
        validatePresenceOf("id_team", "id_user", "name");
    }

}

@Table("match")
public class Match extends Model {

    static {
        validatePresenceOf("id_match","id_fixture", "id_user", "id_team" , "modalidad", "date");
    }

}

@Table("prediction")
public class Prediction extends Model {

    static {
        validatePresenceOf("id_prediction", "id_user", "id_match");
    }

}

@Table("result")
public class Result extends Model {

    static {
        validatePresenceOf("id_result", "id_match", "id_stats", "rTeam1", "rTeam2");
    }

}

@Table("predictionResult")
public class PredictionResult extends Model {

    static {
        validatePresenceOf("id_prediction", "id_result", "difPRT1", "difPRT2");
    }

}

@Table("stats")
public class Stats extends Model {

    static {
        validatePresenceOf("id_stats", "id_user");
    }

}
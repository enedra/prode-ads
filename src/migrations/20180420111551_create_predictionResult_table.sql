CREATE TABLE PredictionResult (
    id_prediction INT(11) auto_increment PRIMARY KEY,
    id_result INT(11) auto_increment PRIMARY KEY,
    difPRT1 INT(11) NOT NULL,
    difPRT2 INT(11) NOT NULL,
    constraint idOfPrediction foreign key (id_prediction) references Prediction,
    constraint idOfResult foreign key (id_result) references Result,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
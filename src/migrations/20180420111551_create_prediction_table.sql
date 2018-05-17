CREATE TABLE Prediction (
    id_prediction INT(11) auto_increment PRIMARY KEY,
    id_user INT(11) NOT NULL,
    id_match INT(11) NOT NULL,
    constraint idOfUsers foreign key (id_user) references Users,
    constraint idOfMatch foreign key (id_match) references Match,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
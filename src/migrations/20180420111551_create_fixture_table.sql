CREATE TABLE Fixture (
    id_fixture INT(11) auto_increment PRIMARY KEY,
    id_user INT(11) NOT NULL,
    cod_game INT(11) NOT NULL,
    constraint idOfUsers foreign key (id_user) references Users,
    constraint codOfGame foreign key (cod_game) references EGame,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
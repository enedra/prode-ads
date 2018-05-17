CREATE TABLE Match (
    id_match INT(11) auto_increment PRIMARY KEY,
    id_fixture INT(11) NOT NULL,
    id_user INT(11) NOT NULL,
    id_team INT(11) NOT NULL,
    dates INT(11) NOT NULL,
    constraint idOfFixture foreign key (id_fixture) references Fixture,
    constraint idOfUsers foreign key (id_user) references Users,
    constraint idOfTeam foreign key (id_team) references Team,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
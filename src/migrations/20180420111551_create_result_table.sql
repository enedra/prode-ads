CREATE TABLE Result (
    id_result INT(11) auto_increment PRIMARY KEY,
    id_match INT(11) NOT NULL,
    id_stats INT(11) NOT NULL,
    rTeam1 INT(11) NOT NULL,
    rTeam2 INT(11) NOT NULL,
    constraint idOfMatch foreign key (id_match) references Match,
    constraint idOfStats foreign key (id_stats) references Stats,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
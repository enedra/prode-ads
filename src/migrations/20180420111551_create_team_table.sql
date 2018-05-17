CREATE TABLE Team (
    id_team INT(11) auto_increment PRIMARY KEY,
    id_user INT(11) NOT NULL,
    name varchar(100) NOT NULL,
    constraint idOfUser foreign key (id_user) references Users,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
CREATE TABLE Users (
    id_user INT(11) auto_increment PRIMARY KEY,
    admin boolean NOT NULL,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
CREATE TABLE egames (
    cod_game INT(11) auto_increment PRIMARY KEY,
    name VARCHAR(100),
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
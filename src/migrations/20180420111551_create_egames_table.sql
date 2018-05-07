CREATE TABLE egames (
    id INT(11) auto_increment PRIMARY KEY,
    name VARCHAR(100),
    description LONGTEXT,
    created_at DATETIME,
    updated_at DATETIME
) ENGINE=InnoDB;
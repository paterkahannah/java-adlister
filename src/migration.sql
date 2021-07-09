USE adlister_db;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50),
    email VARCHAR(50),
    password VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(50),
    description VARCHAR(500),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO USERS (username, email, password) Values ('hannah', 'hannah', 'password');


-- DELETE FROM albums WHERE id = 40;

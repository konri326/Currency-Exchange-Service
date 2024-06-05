CREATE TABLE currency
(
    id       INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
    code     VARCHAR(3)  NOT NULL UNIQUE,
    name     VARCHAR(50) NOT NULL,
    purchase DECIMAL     NOT NULL,
    sale     DECIMAL     NOT NULL
);
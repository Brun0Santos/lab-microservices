CREATE TABLE tb_person(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    address VARCHAR(60) NOT NULL,
    gender VARCHAR(10) NOT NULL
);
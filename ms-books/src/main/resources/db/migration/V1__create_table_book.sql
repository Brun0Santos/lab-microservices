CREATE TABLE tb_book (
    id SERIAL NOT NULL,
    author VARCHAR(80) NOT NULL,
    LocalDate TIMESTAMP,
    price MONEY NOT NULL,
    title VARCHAR(120) NOT NULL
);
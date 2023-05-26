CREATE TABLE tb_book (
    id SERIAL NOT NULL,
    author VARCHAR(30) NOT NULL,
    LocalDate TIMESTAMP,
    price MONEY NOT NULL,
    title VARCHAR(80) NOT NULL
);
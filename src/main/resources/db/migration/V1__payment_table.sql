CREATE TABLE payment
(
    id              SERIAL PRIMARY KEY,
    price           NUMERIC(14, 2) NOT NULL,
    price_modifier  NUMERIC(14, 2) NOT NULL,
    resulting_price NUMERIC(14, 2) NOT NULL,
    payment_method  VARCHAR(64)    NOT NULL,
    date_time       TIMESTAMP      NOT NULL,
    points          INT            NOT NULL
);

CREATE INDEX ON payment (date_time);

CREATE TABLE IF NOT EXISTS products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);
INSERT INTO products (name, price)
VALUES ('Samsung Galaxy S21', 19.99),
    ('iPhone 12', 29.99),
    ('Google Pixel 5', 39.99),
    ('Google Pixel 6', 49.99),
    ('Google Pixel 8', 69.99),
    ('Google Pixel 11', 99.99),
    ('Motorola Edge', 79.99),
    ('Xiaomi Mi 11', 99.99),
    ('Honor 9', 59.99);
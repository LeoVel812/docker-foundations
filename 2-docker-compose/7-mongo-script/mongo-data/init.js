db = db.getSiblingDB("lv-products-service");
db.createCollection("products");
db.products.insertMany([
  {
    name: "Samsung Galaxy S21",
    price: 99.99,
  },
  {
    name: "Motorola Moto G Power",
    price: 49.99,
  },
  {
    name: "Xiaomi Redmi Note 10 Pro",
    price: 59.99,
  },
  {
    name: "IPhone 12 Pro",
    price: 119.99,
  },
]);

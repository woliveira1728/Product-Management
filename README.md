# Product Management System

This is a simple Java application for managing products. It allows users to add products with their details such as name, price, and stock, and then retrieve information about the registered products.

## Table of Contents

- [ProductModel Class](#productmodel-class)
- [ProductController Class](#productcontroller-class)
- [Main Class](#main-class)
- [Usage](#usage)
- [Dependencies](#dependencies)

## ProductModel Class

The `ProductModel` class represents a product with the following attributes:

- `barCode`: A unique identifier generated for each product.
- `name`: The name of the product.
- `priceInCents`: The price of the product in cents.
- `stock`: The quantity of the product in stock.

It provides methods to get and set these attributes and includes a method to generate a unique barcode for each product.

## ProductController Class

The `ProductController` class is responsible for handling operations related to products. It includes methods to:

- Create a new product: Validates the price of the product and adds it to the list of registered products.
- Retrieve all registered products.
- Retrieve the price of a product based on its barcode.

## Main Class

The `Main` class is the entry point of the application. It prompts the user to input details of a product (name, price, and stock) and uses the `ProductController` to register the product. After registering all products, it displays the list of registered products.

## Usage

To use this application, follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files using `javac Main.java`.
3. Run the compiled Java file using `java Main`.

Follow the prompts to register products and view the registered products.

## Dependencies

This project has no external dependencies.

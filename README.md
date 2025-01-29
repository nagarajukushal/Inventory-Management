# Inventory-Management
 Inventory Management using SpringBoot

**Project Description**
The Inventory Management System is a RESTful application developed with Spring Boot, designed to manage items in an inventory. The system supports CRUD operations (Create, Read, Update, Delete) for managing inventory items, including details such as item id, item name, description, price, and quantity. It uses MySQL as the database for storing data.

**Features**
Create: Add new items to the inventory.
Read: Retrieve all items or a specific item by its ID.
Update: Modify the details of an existing item by its ID.
Delete: Remove an item from the inventory by its ID.

**Setup Instructions**

I have selected Java 21 version .
Maven for building the project.
MySQL installed and running locally.
Git for version control
Add the required dependencies like  Spring Web, Spring Data JPA, lombok, and MySQL connector dependencies and verify them in the pom.xml file.
Update the application.properties file under resources folder with the following peoperties:
spring.datasource.url=jdbc:mysql://localhost:3306/inventory
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update


Step 1: Clone your repository.

Step 2: Create MVC model and establish connection with MySQL database by maintaing the required properties in application.properties.


Step 3: Use Postman tool to GET, POST, PUT, and DELETE the data fron /into the database.

Step 4: Please enter the URL in a browser to see view the data:  http://localhost:8080/items

**API Documentation**
URL -> http://localhost:8080/items

**Endpoints**
1. Get all items
Method: GET http://localhost:8080/items
Description: Retrieves a list of all items in the inventory.

Response: [
    {
        "id": 1,
        "itemName": "Book",
        "description": "100 Pages Note book",
        "price": 55.0,
        "quantity": 100
    },
    {
        "id": 2,
        "itemName": "Books",
        "description": "200 Pages notebook",
        "price": 70.0,
        "quantity": 20
    }
]

3. Add a new item
Method: POST http://localhost:8080/items
Description: Adds a new item into the inventory.

Request: {
    "itemName": "Calculator",
    "description":"Scientific Calculator",
    "price": 300.00,
    "quantity":10
}
Response:{
    "id": 7,
    "itemName": "Calculator",
    "description": "Scientific Calculator",
    "price": 300.0,
    "quantity": 10
}

4. Get item by ID
Method: GET http://localhost:8080/items/{id}
Parameters: id: The ID of the item to retrieve.
Description: Retrives an item from the inventory based on the Id.

Response: {
    "id": 2,
    "itemName": "Books",
    "description": "200 Pages notebook",
    "price": 70.0,
    "quantity": 20
}

6. Update an item by ID
Method: PUT http://localhost:8080/items/{id}
Parameters: id: The ID of the item to update.
Description: Updates an existing item in the inventory based on the Id.

Request: {
    "itemName": "Calculator",
    "description":"Scientific Calculator",
    "price": 300.00,
    "quantity":10
}

Response: {
    "id": 7,
    "itemName": "Calculator",
    "description": "Scientific Calculator",
    "price": 300.0,
    "quantity": 10
}


8. Delete an item by ID
Method: DELETE http://localhost:8080/items/{id}
Parameters: id: ID of the item to delete.
Description: Deletes an existing item from the inventory based on the Id.

Request: http://localhost:8080/items/{id}
Response: 200 OK

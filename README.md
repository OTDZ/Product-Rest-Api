# Spring-boot-rest-api
#### A simple REST API which performs the 4 CRUD operations on a Product entity

# Architecture
![Architecture](./images/Architecture.JPG)

# Product
```
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private double price;
    
}
```

#### The Product class has the **@Entity** and **@Id** annotations which allows JPA to recognise Product as an entity and create a table for it in the database.

# Create
#### Creating 2 products - Monitor & Keyboard

![Create1](./images/Create1.JPG)

![Create2](./images/Create2.JPG)

# Read
#### Reading list of all products which displays the 2 products we created earlier

![Read](./images/Read.JPG)

# Update
#### Updating the description and price of the Keyboard product
![Update1](./images/Update1.JPG)

![Update2](./images/Update2.JPG)

# Delete
#### Deleting the Keyboard product
![Delete1](./images/Delete1.JPG)

![Delete2](./images/Delete2.JPG)

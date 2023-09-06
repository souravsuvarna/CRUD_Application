# CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. It allows you to manage a collection of books.

## Prerequisites
Java Development Kit (JDK) 8 or higher.<br>
Spring Boot<br>
Maven or Gradle (for building and running the application)<br>
Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
## Installation

Clone this repository to your local machine:

```bash
git clone https://github.com/souravsuvarna/CRUDApplication.git
```
Open the project in your preferred IDE.

Build and run the application.



## Usage

### API Endpoints
The application provides the following RESTful API endpoints:
``` bash
GET /getAllBooks: Retrieve a list of all books. <br>
GET /getBookById/{id}: Retrieve a book by its ID.<br>
POST /addBook: Add a new book.<br>
POST /updateBookById/{id}: Update a book by its ID.<br>
DELETE /deleteBookById/{id}: Delete a book by its ID.<br>
```

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
git clone https://github.com/souravsuvarna/CRUD_Application.git
```
Open the project in your preferred IDE.

Build and run the application.



## Usage

### API Endpoints
The application provides the following RESTful API endpoints:
``` bash
GET /getAllBooks: Retrieve a list of all books. 
GET /getBookById/{id}: Retrieve a book by its ID.
POST /addBook: Add a new book.
POST /updateBookById/{id}: Update a book by its ID.
DELETE /deleteBookById/{id}: Delete a book by its ID.
```

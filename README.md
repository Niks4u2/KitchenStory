# KitchenStory (An e-commerce portal that lets people shop  basic food items) Web App in Angular using JAVA Spring Boot as Backend

## Table of contents
* [Using the application](#using-the-application)
* [Technologies Used](#technologies-used)
* [Demo](#demo)
* [Setup](#setup)

## Using the application
Homepage displays the application name (Kitchen Story) and four options - Login, Register, Admin, Cart.

<img width="720" alt="sportyshoes-screenshot-homepage" src="https://raw.githubusercontent.com/Niks4u2/SportyShoes/main/Screenshots/Homepage.PNG">

<b>Kitchen Story</b>  - <br>
A query is sent to the remote database that is hosted on MongoDB Atlas for MongoDB to fetch all the products and display to the user's homepage.
The user can add products displayed on homepage to their cart. 
Then user enters the billing details and proceeds, after that they are shown with a confirmation page along with the details of the purchase.
<br><br>
<b>Admin</b>  - <br>
Admin dashboard is accessed using Admin Login Credentials. <br>
Admin can see, add and delete all entries of products in database table.

## Technologies Used
<b>Frontend</b> - HTML, CSS, Typescript, Angular and Angular Material <br>
<b>Backend</b> - Spring Boot, Spring Security with JWT Authenticationa and Spring Data MongoDB <br>
<b>Database</b> - MongoDB - Hosted on a remote server at [MongoDB Atlas](https://www.mongodb.com/atlas/) <br>
<b>Application Server</b>  - Java 8 running on Heroku Cloud Application Platform <br>

## Demo
Application is hosted [here](http://kitchen-story-angular.herokuapp.com/) on Heroku.
## Setup
To run in your localhost - Clone the project into your local directory. Edit the credentials in `application.properties` for database connection and run the Spring Boot project. 
Then run the Angular project using `ng serve --open` command.

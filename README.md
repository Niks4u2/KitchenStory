# Kitchen Story (An e-commerce portal that lets people shop  basic food items) Web App in Angular using JAVA Spring Boot as Backend

## Table of contents
* [Using the application](#using-the-application)
* [Technologies Used](#technologies-used)
* [Demo](#demo)
* [Setup](#setup)

## Using the application
Homepage displays the application name (Kitchen Story) and four options - Login, Register, Admin, Cart.

<img width="720" alt="kitchenstory-screenshot-homepage" src="https://raw.githubusercontent.com/Niks4u2/KitchenStory/main/Screenshots/homepage.PNG">

<b>Kitchen Story</b>  - <br>
All the products are fetched from the MongoDB database using REST API endpoints and displayed to the user's homepage.
The user can add products displayed on homepage to their cart. 
Then user can enter the billing details and click on pay now, after that they are shown with a confirmation page along with the details of the purchase.
<br><br>
<b>Admin</b>  - <br>
Admin dashboard is accessed using Admin Login Credentials. <br>
Admin can see, add and delete all entries of products in database collection.

## Technologies Used
<b>Frontend</b> - HTML, CSS, Typescript, Angular and Angular Material <br>
<b>Backend</b> - Spring Boot, Spring Security with JWT Authenticationa and Spring Data MongoDB <br>
<b>Database</b> - MongoDB - Hosted on a remote server at [MongoDB Atlas](https://www.mongodb.com/atlas/) <br>
<b>Application Server</b>  - Angular running on Heroku Cloud Application Platform <br>
<b>REST API Server</b>  - Spring Boot running on Heroku Cloud Application Platform <br> 

## Demo
Application is hosted [here](http://kitchen-story-angular.herokuapp.com/) on Heroku.
## Setup
To run in your localhost - Clone the project into your local directory. Edit the credentials in `application.properties` for database connection open in IDE and run as the Spring Boot project. 
Then open the Angular project in VS Code and run using `ng serve --open` command from the terminal.

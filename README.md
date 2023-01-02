*<h1> Cinema service </h1>*
<p>A web service API based on Spring Framework, that simulates cinema business logic</p>

<h2> Functionality </h2> 
<h3> Security</h3>
<p>Basic, and formLogin authentication, with role-based authorization. 
Performs access to api endpoints through two roles - ADMIN and USER. Registration with POST 
/register endpoint by email and password, and repeat password confirmation</p>

<h2> Features for User</h2>

<li>Get all cinema halls: Users can view a list of all the cinema halls available on the 
platform.
<li>Get all movies: Users can view a list of all the movies available on the platform.
<li>Get all movie sessions: Users can view a list of all the movie sessions available on the platform.
<li>Get my orders: Users can view a list of all the orders they have placed on the platform.
<li>Complete my orders: Users can complete their orders by paying for the tickets.
<li>Add movie session to shopping cart: Users can add a movie session to their shopping cart for purchase.
<li>Get my shopping carts: Users can view their shopping cart and the items they have added to it.


<h2> Features for Admin</h2>
<li>Add cinema halls: Admins can add new cinema halls to the platform.</li>
<li>Add movies: Admins can add new movies to the platform.</li>
<li>Add, Update, Delete movie sessions: Admins can add, update, and delete movie sessions on the platform.</li>
<li>Get all users: Admins can view a list of all the users registered on the platform.</li>

<h2> Technology </h2>

|   Technology	    | Version |
|:----------------:|:-------:|
|       JDK	       |   17    |
|     Spring	      |  5.2.2  |
| Spring Security	 |  5.2.2  |
|   Hibernate 	    | 5.4.27  |
|     MySql 	      | 8.0.22  |
|     Tomcat	      | 9.0.50  |

<h2> How to start</h2>
<ol>
<li>Download the project repository</li>
<li>Create a schema using <a href="https://github.com/SoulARC/cinema-service/blob/main/src/main/resources/init-db.sql#L9">script</a></li>
<li>Update the database configuration in <a href="https://github.com/SoulARC/cinema-service/blob/main/src/main/resources/init-db.sql#L9">db.properties</a> with your own MySQL credentials.</li>
<li>Configure TomCat for this project</li>
<li>Run</li>
<li>P.S. There is a standard login <code>user@gmail.com</code> for logging into the system
  and password <code>user1234</code></li>
</ol>


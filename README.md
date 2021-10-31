# Backend Objective platform Assignment
This is a RESTful Web Service to manage a beers catalogue, as requested from the assignment. For this app I used Java 11, spring boot framework, hiberate and an in-memory db(h2).

##How the app works:
When the application is started, the "BEERS" table, which contains the main information of our beers (such as name, description etc ..), is created using the script `schema.sql` present into the 'resources' folder.
Subsequently, the data are insert into our table by: calling the following api: "https://api.punkapi.com/v2/beers" and correctly mapping the results in a class intended for serialization (`Response.class`), converted then into a 'Beer' class entity.

To manage the requests I structured my app into different package:

 - `controller`: is the entry point that manage the REST requests coming from the FE. In the controller I created the class `BeerController` to map and handle the requests for my beers catalogue.

 - `service`: is an application layer beetween the controller and the repository. I used it to manage the data that coming from FE destinated to the repository. Here is where I manipulate the data (when I need to do it) before store them into the DB. In the service is present the class `BeerService` that use the `BeerRepository` to save and fetch the data.
 
 - `repository`: is the layer that allow us to interact with the DB. I created an interface `BeerRepository` that extends CrudRepository interface and PagingAndSortingRepository interface. The first allows us to interact with the database using a set of already defined CRUD operations, the second gives us a simple solution to paging the results.
  
 - `model`: is the package where are present all the hibernate entities that we define to mapping the data from the db. Inside this package is possible find the entity `Beer` that map the data present into the BEERS table.

 - `utility`: is the utilities package. In this package are present three classes:
	- `Connection` : this class fetch the data from 'https://api.punkapi.com/v2/beers'.
	- `Response` : this class map the data that we fetch from the api.
	- `BeerConverter` : convert 'Response' in 'Beer' objects. After I insert the various object into the db to initialize it.
 

## Database
I decided to use an in-memory db: h2.
I realized immediately after seeing the structure of the Json that I would not be able to complete the whole structure of the db for Sunday. So I focused on the general functioning of the application, so as to be able to present a working web app that would satisfy your requests:

REQUIRED Use cases:
Use case 1: As a beer lover I want to browse through the available beers with 10 beers per screen.
Use case 2: As a beer lover I want to search beers based on name or description.

BONUS Use cases:
Use case 3: As a beer lover I want to mark beers as my favorite.
Use case 4: As a beer lover I want to view my favorite beers.

So I decided to start from a table containing the main information of the beers, so that I could create a catalog page.
All the request above, fetch data from BEERS table.


## How to start


### Simple Start
To run it with npm commands just type:

```
npm install
npm start
```

The server will be available at `http://localhost:8080` depending on the `PORT` environment variable (default is 8080).

### Docker
You can run it using `docker` running the command

```
docker-compose build
docker-compose up
```

The server will be available at `http://localhost:8080` depending on the port that you specified on the `docker-compose.yml` file (default is 8080).

## Improvements
Different improvements can be applied.
 - Error handling
 - Comment
 - DB
 - Test suite.
 

Please consider that I only had 2.5 days for the test (Friday afternoon to Sunday).
Having had more time I would have surely created all the db, and the entities needed for the mapping.

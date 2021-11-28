# movieProjectM

This is a springboot java back end application mainly used to retrieve tables of sakila database from MySQL.

GetMapping is used to retrieve the tables of actor, country and customer, post mapping is used to add to these tables and delete mapping is used to delete rows from the tables 

There are classes with constructors which are called in the main class, once the main class and springboot is running, a local host api, such as postman, or am ionternet browser can be used to retrieve
the tables using the correct url's.
  Similarly post and delete mapping can be used to add rows to or delete rows from the table  
Unit tests are included for the actor, customer and country classes, as well as an attempt at a cucumber test which will be adjusted in the future.

The jar file of this project can be packed using mvn package, and then added to an aws bucket and called using an aws ec2 instance. The public ivp4 address, along with get mapping of the tables can be entered into an internet browser or into postman to retive the tables, postman sorts the darta into JSON form which is more readable than the raw form that the interenet browser would return

Post and get mapping can also be used inthe ec2 instance to add to the table and delte from the table

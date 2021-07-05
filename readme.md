This is meant to be the most basic example on
- for a dummy spring-boot (Rest endpoints + Db Connection)
- how to build a docker image from Github Actions and publish that image to Github Package

it's meant to be used to validate the vps docker-compose set-up 


how to run locally : 
 - install postgresql with default login / password
 - run mvn spring-boot:run
 - browse http://localhost:8080/chuck-facts


## Upgrade Maven dependencies with:

mvn versions:use-latest-versions
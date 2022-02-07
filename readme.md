# project kick-off

 - master branch is now analysed on https://sonarcloud.io/dashboard?id=gjambet_chuck-facts


Now with a controller

application can be run locally with the following command :

cd dev-station
docker-compose up
cd ..
mvn spring-boot:run

(please do make sure you can run maven on command line)

 - actuator endpoints available on http://localhost:8080/actuator/health
 - first controller available here http://localhost:8080/api/chuck-facts


## Upgrade dependencies version : 
check latest pom parent version
mvn versions::use-latest-versions
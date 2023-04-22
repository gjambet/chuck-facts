FROM eclipse-temurin:17-jre-alpine

COPY ./target/chuck-facts-1.0-SNAPSHOT.jar .

EXPOSE 8080

CMD ["sh","-c","java -XX:InitialRAMPercentage=50 -XX:MaxRAMPercentage=70  -XshowSettings $JAVA_OPTS -jar chuck-facts-1.0-SNAPSHOT.jar"]

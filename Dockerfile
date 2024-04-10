FROM openjdk:11
EXPOSE 8010
ADD target/userdata.jar userdata.jar
ENTRYPOINT ["java","-jar","userdata.jar"]

FROM openjdk:11
EXPOSE 8020
ADD target/userdata.jar userdata.jar
ENTRYPOINT ["java","-jar","userdata.jar"]

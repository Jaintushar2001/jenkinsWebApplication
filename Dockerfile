FROM openjdk:11
EXPOSE 8030
ADD target/userdata.jar userdata.jar
ENTRYPOINT ["java","-jar","userdata.jar"]

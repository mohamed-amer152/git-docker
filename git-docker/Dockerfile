FROM openjdk:8
EXPOSE 8080
ADD target/git-docker.jar git-docker.jar
ENTRYPOINT ["java","-jar","git-docker.jar"]
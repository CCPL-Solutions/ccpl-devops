FROM openjdk:11	
VOLUME [ "/tmp" ]
WORKDIR /app	
EXPOSE 8080	
ARG JAR_FILE=target/*.jar	
COPY ${JAR_FILE} app.jar	
ENTRYPOINT [ "java", "-jar", "app.jar" ]
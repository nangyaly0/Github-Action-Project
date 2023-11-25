From openjdk:11 AS BUILD_IMAGE
RUN apt update && apt install maven -y
WORKDIR /app
COPY /home/runner/work/Github-Action-Project/Github-Action-Project/ /app
RUN mvn clean install

From tomcat:9-jre11

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=BUILD_IMAGE ./target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
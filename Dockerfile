FROM tomcat:latest
MAINTAINER "Satya Prakash <satyaprakash.yadav@impetus.co.in>"
RUN apt-get update && apt-get install -y maven
RUN mkdir /app
COPY * /app/
RUN mvn -f /app/RESTFUL/ package
COPY /app/target/RESTFUL-1.0.war /usr/local/tomcat/webapps/
RUN rm /app
CMD ["catalina.sh", "run"]

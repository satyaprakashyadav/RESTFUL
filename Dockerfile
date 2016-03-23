FROM tomcat:latest
MAINTAINER "Satya Prakash <satyaprakash.yadav@impetus.co.in>"
RUN apt-get update && apt-get install -y maven
RUN mkdir temp
COPY * temp
RUN mvn package
COPY temp/target/RESTFUL-1.0.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]

FROM tomcat:latest
MAINTAINER "Satya Prakash <satyaprakash.yadav@impetus.co.in>"
mvn package
COPY target/RESTFUL-1.0.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]

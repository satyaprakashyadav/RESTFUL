FROM tomcat:latest
MAINTAINER "Satya Prakash <satyaprakash.yadav@impetus.co.in>"
RUN apt-get update && apt-get install -y maven
RUN apt-get install -y openjdk-7-jdk
RUN mkdir /app
COPY . /app/
RUN mvn -f /app/pom.xml package
RUN cp /app/target/RESTFUL.war /usr/local/tomcat/webapps/
RUN rm -rf /app
CMD ["catalina.sh", "run"]

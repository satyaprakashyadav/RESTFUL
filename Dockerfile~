FROM tomcat:latest
MAINTAINER "Satya Prakash <satyaprakash.yadav@impetus.co.in>"
#RUN apt-get install -y maven
RUN add-apt-repository "deb http://ppa.launchpad.net/natecarlson/maven3/ubuntu precise main"
RUN apt-get install maven3
mvn package
COPY target/RESTFUL-1.0.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]

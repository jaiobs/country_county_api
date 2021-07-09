FROM tomcat:9-jre8-alpine
  
MAINTAINER pradeep.k@optisolbusiness.com

WORKDIR /usr/local/tomcat

COPY target/generalservice.war /usr/local/tomcat/webapps/

# Start the tomcat (and leave it hanging)

EXPOSE 6000

CMD ["catalina.sh", "run"]
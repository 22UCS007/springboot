FROM tomcat:10.1-jdk21-temurin
#removing the default Tomcat webapps to avoid conflicts with our application
RUN rm -rf /usr/local/tomcat/webapps/ROOT
# Copy WAR into Tomcat's webapps folder
COPY target/springJDBCEx-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]

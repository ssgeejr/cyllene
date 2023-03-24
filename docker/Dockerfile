FROM tomcat:8.5.69-jdk8-openjdk

LABEL author="_NAME_" \
      company="_COMPANY_" \
      maintainer="Maintainer Name <maintainer@example.com>"

ADD https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.26/mysql-connector-java-8.0.26.jar /usr/local/tomcat/lib/
ADD ROOT.war /usr/local/tomcat/webapps/
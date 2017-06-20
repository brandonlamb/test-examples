FROM openjdk:8-jre

LABEL maintainer "ryan@rationaldevelopers.com"
LABEL version "1.0.0"

ENV APP_HOME /app/tomee
ENV PATH ${APP_HOME}/bin:$PATH

RUN mkdir -p /app

ADD tomee.tgz /app

WORKDIR /app
RUN set -x tar -zxf tomee.tgz

WORKDIR ${APP_HOME}
RUN set -x rm bin/*.bat
RUN set -x rm conf/context.xml

# Replace the existing context file
ADD context.xml /app/tomee/conf/context.xml
ADD tomcat-users.xml /app/tomee/conf/

# Create the application User
RUN groupadd -f app
RUN useradd --home /app/tomee -g app app

# Change the owner of the application folder
RUN chown -R app:app /app/tomee

# Switch to the new user
USER app
ENV PATH ${APP_HOME}/bin:$PATH

# Export the default Tomcat Port
ENV JAVA_OPTS -Dcom.sun.management.jmxremote.port=8089 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false

EXPOSE 8089
EXPOSE 8080
CMD ["/app/tomee/bin/catalina.sh","run"]
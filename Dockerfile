FROM openjdk:8-jdk

ENV PROFILE=${PROFILE}
ENV APP_PORT=${APP_PORT}
ENV TZ=America/Sao_Paulo

USER root

RUN apt-get install -y bash tzdata

RUN mkdir -p /user/src/app/
COPY weenvoyerbot-service-app/build/libs/*.jar /user/src/app
WORKDIR /user/src/app

RUN export JAVA_OPTS="-server -Xmx512m -Xms512m";

ENTRYPOINT java -jar /user/src/app/*.jar --spring.profiles.active=$PROFILE --server.port=$APP_PORT

EXPOSE $APP_PORT

FROM openjdk:8-jdk

ENV PROFILE=${PROFILE}
ENV APP_PORT=${APP_PORT}
ENV TZ=America/Sao_Paulo

USER root

RUN apk add --no-cache bash tzdata

COPY . /user/src/app
WORKDIR /user/src/app

RUN tar -xvf /user/src/app/weenvoyerbot-service-app/build/distributions/*.tar

RUN export JAVA_OPTS="-server -Xmx512m -Xms512m";

ENTRYPOINT /user/src/app/weenvoyerbot-service-app/bin/weenvoyerbot-service-app --spring.profiles.active=$PROFILE --server.port=$APP_PORT

EXPOSE $APP_PORT
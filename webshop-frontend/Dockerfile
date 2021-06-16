FROM node:12.18.3-alpine

### Build ###
LABEL maintainer="michalskidaniel2@gmail.com"
WORKDIR /usr/app/src
ADD . .
RUN npm install

### Run ###
RUN npm install -g @angular/cli@10.0.5
EXPOSE 4200
CMD ng serve --host 0.0.0.0 --proxy-config proxy-docker-conf.json

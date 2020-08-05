#!/bin/bash

# This script can be used to rebuild the project and refresh/restart the docker container in one go.
# This script should preserve your database.

docker-compose rm -f -s -v cyclos-fe-app
docker-compose up -d --build

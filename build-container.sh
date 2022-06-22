#!/bin/bash

export tag=$1

if [ -z "${tag}" ]
then
  echo "Please set tag variable prior to running script as argument 1 , eg: v1"
  exit;
fi

docker build --tag=snyk-boot-web:$tag .
docker tag snyk-boot-web:$tag pasapples/snyk-boot-web:$tag
docker push pasapples/snyk-boot-web:$tag
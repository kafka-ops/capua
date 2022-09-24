#!/usr/bin/env bash

curl --header "Content-Type: application/json" \
  --request POST \
  --data '{ "topics": [{ "name": "foo", "partitions": 3, "replicationFactor": 1, "config": {} },{ "name": "bar", "partitions": 3, "replicationFactor": 1, "config": {} }]}' \
  http://localhost:8080/policy/validate
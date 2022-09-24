# Capua

A Kafka Policy engine that will help you validate your resources and artefact creations with style.

**Important**: This project is as of now in a very early stage of development, as of now, you can think about it more as of a proof of concept for an early idea. 

Please if you have feedback and/or are willing to contribute this project to move further don't hesitate to open issues and/or contact me directly.

<img src="https://raw.githubusercontent.com/kafka-ops/capua/main/img/capua.jpeg" alt="capua" width="640" height="480"/>

### Introduction

Have you ever had the problem to make sure the artefacts created in your Kafka deployment are all created according to the defined policies? 
Many have had and will have.

There exist a few possibilities and methods out there, however all have their pros and cons.
With Capua, we intend to create a Policy engine (on the shoulders of known solutions) specialized for Kafka deployments.

As a user of Capua it will be possible for you to:

* Define, in an easy, proven and known JSON like language, the policies your deployed "things" have to follow. 
  The policy language is based on [Rego](https://www.openpolicyagent.org/docs/latest/policy-language/), the Open Policy Agent language.
* Verify the resource creation requests in multiple ways such as using a CLI, a Rest API, Container(s), etc.


#### Existing projects

Right now the project is divided like this:

* core: The core engine definitions and language parser.
* cli: The client interface
* web: The rest api.

#### Example

```bash
$ curl -s --header "Content-Type: application/json" \                                                                    2.7.0
  --request POST \
  --data '{ "topics": [{ "name": "foo", "partitions": 3, "replicationFactor": 1, "config": {} },{ "name": "bar", "partitions": 3, "replicationFactor": 1, "config": {} }]}' \
  http://localhost:8080/policy/validate | jq .
{
  "topics": {
    "bar": {
      "allow": false,
      "deny": true
    },
    "foo": {
      "allow": true,
      "deny": false
    }
  }
}
```

## Disclaimer

This project is currently in active development, contributions, ideas, etc are very much welcome, but please *don't* use it in production for now. 
package kafka

allow {
    topic.partitions == 3
    topic.replicationFactor == 1
    startswith(topic.name, "foo")
}

deny {
    startswith(topic.name, "zet")
}
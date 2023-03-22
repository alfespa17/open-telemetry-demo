#!/bin/bash

mvn clean install -Dmaven.test.skip=true

wget https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar

java -javaagent:opentelemetry-javaagent.jar -Dotel.service.name=demo-telemetry -Dotel.traces.exporter=jaeger -Dotel.exporter.jaeger.endpoint=http://localhost:14250 -jar target/demo-0.0.1.jar


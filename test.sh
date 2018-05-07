#!/bin/bash

mvn clean
mvn compile
mvn activejdbc-instrumentation:instrument
mvn test

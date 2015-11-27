#!/bin/bash

for team in q*
do
    cd $team
    mvn org.jacoco:jacoco-maven-plugin:prepare-agent clean install
    cd ..
done 


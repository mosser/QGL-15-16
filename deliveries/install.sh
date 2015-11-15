#!/bin/bash

for team in q*
do
    cd $team
    mvn -DskipTests=true clean install
    cd ..
done 


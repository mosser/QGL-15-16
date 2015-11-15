#!/bin/bash

for team in isl*
do
    cd $team
    mvn -DskipTests=true clean install
    cd ..
done 


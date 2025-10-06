#!/bin/bash

git config --global user.name GusTav-Dev22
git config --global user.email gustavo.r05@aluno.ifsc.edu.br
echo "git config"
git init
echo "git init"

printf "1\n" | gradle init --overwrite --type java-application --dsl groovy --test-framework junit --java-version 21 --project-name Sorteio --package ads.poo
echo "gradle init"
echo "org.gradle.console=plain" >> gradle.properties
echo "org.gradle.logging.level=quiet" >> gradle.properties
echo "gradle properties"

echo "# Sorteio de Batalhas Pokemon>> Readme.md

git add .

git commit -m "Primeiro commit,configurando gradle e adcionando Readme.md"



#!/bin/bash

git config --global user.name GusTav-Dev22
git config --global user.email gustavo.r05@aluno.ifsc.edu.br
echo "git config"
git init
echo "git init"

printf "1\n" | gradle init --overwrite --type java-application --dsl groovy --test-framework junit --java-version 21 --project-name RecuperacaoP2 --package ads.poo
echo "gradle init"
echo "org.gradle.console=plain" >> gradle.properties
echo "org.gradle.logging.level=quiet" >> gradle.properties
echo "gradle properties"

echo "# Repositório da REC P2 ## Introdução a POO - Discente: Gustavo Ribeiro - Docente: Sergio Prolo ## Ferramentas ## Projeto" >> Readme.md

git add .

git commit -m "Primeiro commit,configurando gradle e adcionando Readme.md"

echo "pronto"

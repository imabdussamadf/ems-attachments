#!/bin/sh
mvn clean package && docker build -t com.kudasa/ems-attachments .
docker rm -f ems-attachments || true && docker run -d -p 8080:8080 -p 4848:4848 --name ems-attachments com.kudasa/ems-attachments 

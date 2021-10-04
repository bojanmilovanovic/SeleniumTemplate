# Selenium template

Selenium tests with POM on dockers

## Installation

Useful links:
```
Docker setup:
https://github.com/SeleniumHQ/docker-selenium/blob/trunk/README.md
```
## To Do
- Create a custom docker file ⛔
- Add support for running tests locally 👍
- Add reporting feature ⛔

## Running tests with docker
Type in command line following:
```
docker run -d -p 4444:4444 selenium/standalone-chrome
docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome
```


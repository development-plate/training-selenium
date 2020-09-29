# Docker with Selenium and Chrome

## commands
With this command the images are downloaded.

docker pull selenium/standalone-chrome:85.0

and started here.

docker run -d -p 4444:4444 --name selenium-chrome-standalone selenium/standalone-chrome:85.0
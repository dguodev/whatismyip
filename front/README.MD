docker build -t dguodev/whatismyip:0.0.6 .
docker run -p 8080:8080 dguodev/whatismyip:0.0.2
docker image push dguodev/whatismyip:0.0.6

docker run -p 8080:8080 dguodev/whatismyip:0.0.6

use database to save history IP.
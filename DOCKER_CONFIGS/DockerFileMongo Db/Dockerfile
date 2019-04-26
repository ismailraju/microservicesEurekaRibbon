docker pull mongo
docker run --name MONGOCONTAINER --restart=always -d -p 27017:27017 mongo mongod --auth
sudo docker exec -i -t MONGOCONTAINER bash
mongo
use admin
db.createUser({user:"user", pwd:"password", roles:[{role:"root", db:"admin"}]})
exit 
exit

##mongo -u "user" -p "password" HOSTIP --authenticationDatabase "admin"




docker run --name MONGOCONTAINER -d -p 27017-27019:27017-27017   mongo:latest
docker exec -i -t MONGOCONTAINER bash
mongo
use admin
db.createUser({user:"admin", pwd:"admin", roles:[{role:"root", db:"admin"}]})
exit 
exit

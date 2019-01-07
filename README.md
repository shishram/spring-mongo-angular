# spring-mongo-angular
# Generate Spring Boot Application using https://start.spring.io
Important commands

sudo npm install -g @angular/cli
./gradlew bootRun

# Adding mongo to application.properties
spring.data.mongodb.database=springangular
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017

install mongodb on system

$ sudo mkdir -p /data/db
$ whoami
shishram
$ sudo chown shishram /data/db

export MONGO_PATH=/usr/local/mongodb
export PATH=$PATH:$MONGO_PATH/bin


# Auto Start MongoDB
sudo vim /Library/LaunchDaemons/mongodb.plist

{
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN"
  "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
  <key>Label</key>
  <string>mongodb</string>
  <key>ProgramArguments</key>
  <array>
    <string>/usr/local/mongodb/bin/mongod</string>
  </array>
  <key>RunAtLoad</key>
  <true/>
  <key>KeepAlive</key>
  <true/>
  <key>WorkingDirectory</key>
  <string>/usr/local/mongodb</string>
  <key>StandardErrorPath</key>
  <string>/var/log/mongodb/error.log</string>
  <key>StandardOutPath</key>
  <string>/var/log/mongodb/output.log</string>
</dict>
</plist>

}


sudo launchctl load /Library/LaunchDaemons/mongodb.plist
ps -ef | grep mongo

ng new frontend
npm install
ng build
ng serve
ng g component -----


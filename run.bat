@ECHO OFF
echo "starting jetty server"
java -jar -Dorg.apache.jasper.compiler.disablejsr199=true jetty-runner-8.1.9.v20130131.jar deploy

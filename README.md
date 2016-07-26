# Build
Execute: mvn clean install

# Install
Copy ${basedir}/target/ejb-jaxws-sample.war to ${JBOSS_HOME}/standalone/deployments

# Interface
You can lookup the WSDL file at http://localhost:8080/ejb-jaxws-sample/EBookStoreImpl?wsdl
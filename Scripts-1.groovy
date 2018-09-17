artifactory('artifactory-myh'){
   localRepository("docker-local") {
     packageType "docker"
     description "My local Docker registry"
   }
}
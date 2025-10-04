def call(String ImageTag, String DockerHubUser, String ProjectName){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag}"
}

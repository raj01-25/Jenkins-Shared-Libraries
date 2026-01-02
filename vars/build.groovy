def call(Map config) {
    sh """
       docker build -t ${config.DockerHubUser}/${config.ProjectName}:${config.ImageTag} .
    """
}

def call(Map config) {
    sh """build -t ${config.DockerHubUser}/${config.ProjectName}:${config.ImageTag} ."""
}

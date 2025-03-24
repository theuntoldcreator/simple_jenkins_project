pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/theuntoldcreator/simple_jenkins_project.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building project...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying project...'
            }
        }
    }
}

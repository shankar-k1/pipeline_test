pipeline {
    agent { docker { image 'maven-3.9.7'} } 

    stages {
        stage('First build in pipeline mode') {
            steps {
                // Clean and build the Maven project
                sh 'mvn --version'
                sh 'java --version'
                sh 'mvn clean install'
            }
        }

    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}

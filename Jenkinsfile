pipeline{
    agent{
        docker{
            image 'node:alpine'
            args '-p 3002:3000'
        }
    }
    environment{
        CI = 'true'
    }
    stages{
        stage('Build'){
            steps{
                sh 'npm install'
            }
        }
        stage('Create docker image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/react']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanademayur/Jenkins_PracticeProject']]])
                    sh 'docker build -t mayurkanade/springboot-1 .'
                }
            }
        }   
    }
}
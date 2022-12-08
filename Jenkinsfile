pipeline {
     agent any
     stages{
        stage('Build Docker Image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/springboot2']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanademayur/Jenkins_PracticeProject']]])
                    sh 'docker build -t mayurkanade/springboot-2 .'
                }
            }
        }
        stage('Push Selenium Docker Image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'user', variable: 'username'), string(credentialsId: 'pass', variable: 'pass')]) {
                    sh 'docker login -u ${username} -p ${pass}'
                    sh 'docker push ${username}/springboot-2'
                    }
                }
            }
        }
    }
 }
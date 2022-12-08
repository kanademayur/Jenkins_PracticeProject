pipeline {
     agent any
     stages{
        stage('Build Docker Image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/springboot1']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanademayur/Jenkins_PracticeProject']]])
                    sh 'docker build -t mayurkanade/springboot-1 .'
 }
            }
        }
        stage('Push Selenium Docker Image'){
            steps{
                script{
//                     withCredentials([string(credentialsId: 'username', variable: 'userId'), string(credentialsId: 'pwd', variable: 'passwd')]){
                    sh 'docker login -u mayurkanade -p Password@1'
                    sh 'docker push mayurkanade/springboot-1'
// }
                }
            }
        }
    }
 }
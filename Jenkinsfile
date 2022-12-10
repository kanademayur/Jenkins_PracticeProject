pipeline {
    agent any
    stages{
       
        stage('build docker image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/react1']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanademayur/Jenkins_PracticeProject.git']]])
                    withCredentials([string(credentialsId: 'user', variable: 'dockerUser')]){
                    sh 'docker build -f Dockerfile -t ${dockerUser}/reactapp1 .'
                    }
                }
            }
        }
        stage('push docker image to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'user', variable: 'username'), string(credentialsId: 'pass', variable: 'pass')]) {
                    sh 'docker login -u ${username} -p ${pass}'
                    sh 'docker push ${username}/reactapp1'
                  }
                }
            }
        }
    }
}
                

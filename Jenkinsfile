pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/saurabh4123/SPE_mini_calc.git'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build to images') {
            steps {
                script{
                    imageName = docker.build "saurabh412/calculator-using-devops:latest"
                }
            }
        }
        stage('Login to dockerhub and push image') {
            steps {
                script{
                    docker.withRegistry('', 'dockerhub'){
                        imageName.push()
                    }
                }
                sh "docker rmi saurabh412/calculator-using-devops:latest"
            }
        }
        stage('Ansible pull docker image') {
            steps {
                ansiblePlaybook colorized: true, credentialsId: 'localmachine', disableHostKeyChecking: true, installation: 'ansible', inventory: 'inventory', playbook: 'deploy-playbook.yml'
                  }
        }
    }
}

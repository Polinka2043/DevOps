pipeline {
    agent any

    stages {
        stage('Подготовка окружения') {
            steps {
                script {
                    // Пример выполнения Ansible playbook для настройки окружения
                    ansiblePlaybook playbook: 'prepare-environment.yml'
                }
            }
        }
        stage('Запуск приложений') {
            steps {
                script {
                    // Пример выполнения Ansible playbook для запуска приложений
                    ansiblePlaybook playbook: 'start_application.yml'
                }
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Подготовка окружения') {
            steps {
                script {
                    // Пример выполнения Ansible playbook для настройки окружения
                    ansiblePlaybook playbook: 'path/to/your/playbook.yml'
                }
            }
        }
        stage('Запуск приложений') {
            steps {
                script {
                    // Пример выполнения Ansible playbook для запуска приложений
                    ansiblePlaybook playbook: 'path/to/your/start_app.yml'
                }
            }
        }
    }
}

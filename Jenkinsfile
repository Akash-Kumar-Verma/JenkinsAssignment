pipeline {
    agent any
    
	 stages {
		        stage('Checkout') {
		            steps {
		                // Checkout code from the Git repository
				 git branch: 'main', url:'https://github.com/Akash-Kumar-Verma/JenkinsAssignment.git'

		                echo 'checkout'
		              }
		           }
		        
		        stage('Build') {
		            steps {
		                // Build Selenium project using Maven
				    dir('.'){
				        echo 'build'
				        bat 'mvn clean'
				    }
		             }
		          }
        
		        stage('Test') {
		            steps {
		                // Run Tests using Maven
				        echo 'test'
				        bat 'mvn test'
		            }
		         }
        
		        stage('Publish Reports') {
		            steps {
		                // Publish repots using HTML Publisher plugin
		               echo 'You are in publish reports section'
			    }
		        }
        
          }
    
    post {
	        always {
			// Cleaning  up tmp
			
	            echo 'This is for post section'
	        }
        
	        success {
	            // Actions when pipeline succeeds
	            echo 'Pipeline is Successful!'
	        }
        
	        failure {
	            // Actions when pipeline fails
	            echo 'Pipeline is Failed!'
	        }
          }
	
}

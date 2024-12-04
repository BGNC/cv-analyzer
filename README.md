

# CV Analyzer

CV Analyzer is a Spring Boot-based application designed to simplify the recruitment process by automating CV analysis, tailored exam generation, and candidate evaluation. It uses the ChatGPT API for natural language processing to evaluate CVs and generate questions and feedback based on job descriptions.

---

## Features
- **CV Analysis**: Upload CVs in PDF or DOCX format for automated evaluation.
- **Job Description Matching**: Analyze CVs against specific job descriptions to determine suitability.
- **Custom Exam Generation**: Create tailored exam questions based on CV and job description analysis.
- **Candidate Response Evaluation**: Record candidate responses and automatically assess them using ChatGPT.
- **Scoring and Feedback**: Provide a detailed score and feedback report for each candidate.

---

## Technology Stack
- **Backend**: Spring Boot (3.4.0)
- **Database**: PostgreSQL
- **Security**: JWT-based authentication
- **API Integration**: ChatGPT API
- **Validation**: Spring Validation Framework
- **Testing**: JUnit, Mockito

---

## Installation

### Prerequisites
- Java 17 or later
- Maven 3.8+
- PostgreSQL 14+
- ChatGPT API Key

### Clone the Repository

git clone https://github.com/<your-username>/cv-analyzer.git
cd cv-analyzer

Configure the Application

	1.	Create a src/main/resources/application.yml file and configure the following:

server:
  port: 8080

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/cv_analyzer
    username: <your-db-username>
    password: <your-db-password>
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

jwt:
  secret: <your-jwt-secret>

openai:
  api-key: <your-chatgpt-api-key>

	2.	Replace <your-db-username>, <your-db-password>, <your-jwt-secret>, and <your-chatgpt-api-key> with your credentials.

Build and Run

mvn clean install
mvn spring-boot:run

The application will run at http://localhost:8080.

Endpoints

Authentication

Method	Endpoint	Description
POST	/api/v1/auth	User login and JWT token generation

CV Management

Method	Endpoint	Description
POST	/api/v1/cv/upload	Upload a CV for analysis
GET	/api/v1/cv/{id}	Get analyzed CV details

Exam Management

Method	Endpoint	Description
GET	/api/v1/exam/{id}	Get generated exam questions
POST	/api/v1/exam/{id}/submit	Submit exam answers
GET	/api/v1/exam/{id}/result	Get exam results and feedback

Project Structure

com.example.cv-analyzer
├── config
├── controller
├── dto
├── exception
├── model
├── repository
├── service
├── CvAnalyzerApplication.java

Future Improvements

	•	Add frontend interface for better user interaction.
	•	Support additional file formats (e.g., TXT).
	•	Implement advanced analytics for scoring patterns.

License

This project is licensed under the MIT License. See the LICENSE file for more details.

Contribution

Contributions are welcome! Feel free to fork this repository, make changes, and create a pull request.

Contact

For further information or issues, contact:
	•	Name: Buğra Onur Genç
	•	Email: bugra34055@hotmail.com
	•	GitHub: BGNC


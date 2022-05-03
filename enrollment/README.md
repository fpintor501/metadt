# To Setup the enrollment project please follow these instructions:

1. Create a new directory and download the project code from GITHUB like this

	$ git clone https://github.com/fpintor501/metadt.git

2. To review code using eclipse IDE, import the "enrollment" project using maven's pom.xml.

3. Set the java compiler to version 11 in eclipse for this project.

4. In a local MYSQL database, create the metadata schema, and in this schema create the COURSES, STUDENTS and ENROLLMENT tables using the sql/CREA_ENROLLMENT.sql script.
 
5. Run the sql/insert_courses.sql, sql/insert_students.sql and sql/insert_enrollment.sql scripts in that order to create test records.

6. Create a user metadata with password metadata that has access to the schema metadata in MYSQL.

7. Change the datasource configuration in the "src/main/resources/application.properties" to point to the local database and the correct schema

8. Build the project with maven using "mvn install".

To Run project as an executable jar: 

9.  Open a window in the root directory of the enrollment project

10. Run the project directly using the jar target/enrollment-0.0.1-SNAPSHOT.jar generated in target with Java v11 from the command line:

	>java -jar target/enrollment-0.0.1-SNAPSHOT.jar

11. The Spring Boot console appears and the system eventually boots up. A message appears to print the splash reports:

"Print Splash Reports(Y)? "

12. Enter Y and all the test records for Students, Courses and Enrollment will appear depending on the records that are in the DB.

To Run project as a docker container:

 9. Open a window in the root directory of the enrollment project  

10. Create a new docker container that includes the enrollment executable jar using a azul/zulu OpenJDK over the Alpine LINUX distribution from the command line:

	>docker build -t metadt/enrollment:1.0-SNAPSHOT .

11. Run the docker container just created from the command line using:\

	>docker run -p 8088:8088 metadt/enrollment:1.0-SNAPSHOT .

12. The Spring Boot console appears and the system eventually boots up. 

To test the functionality of the enrollment application:

13. Please use a tool that is enabled to send and process HTTP based requests and responses, like Postman or Imsomnia.

14. Use the API specifications chart in file API_SPECS.xlsx to test the requested functionality. This chart includes all endpoints, payload and parameter specs.

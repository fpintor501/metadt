# To Setup this project.

1. In a local MYSQL database, create the metadata schema, and in this schema create the COURSES, STUDENTS and ENROLLMENT tables using the sql/CREA_ENROLLMENT.sql script.
 
2. Run the sql/insert_courses.sql, sql/insert_students.sql and sql/insert_enrollment.sql scripts in that order to create test records.

3. Create a user metadata with password metadata that has access to the schema metadata in MYSQL.

4. Create a new directory and download the project code from GITHUB like this

	>git clone https://github.com/fpintor501/metadt.git

5. To review code using eclipse IDE, import the "enrollment" project using maven's pom.xml.

6. Set the java compiler to version 11 in eclipse for this project.

7. If you use another user or schema that is the same in MYSQL, change the datasource attributes in "src/main/resources/application.properties"

8. Build the project with maven using "mvn install".


To Run project as an executable jar: 

9.  Open a window in the root directory of the enrollment project

10. Run the project directly using the jar target/enrollment-0.0.1-SNAPSHOT.jar generated in target with Java v11 from the command line:

	>java -jar enrollment-0.0.1-SNAPSHOT.jar

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

14. Use the following API chart to test the requested functionality







CRUD REST API for the TRANSACTIONS table can also be a
ccessed using a browser or Postman

ejemplos

http://localhost:8088/transaccions //Aparecen todos los registros que estan en la BD en formato JSON

http://localhost:8088/transaccions/10003  ??Aparece el registro correspondiente al id_orden = 10003

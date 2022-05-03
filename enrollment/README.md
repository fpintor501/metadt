# To Setup this project.

1. In a local MYSQL database, create the metadata schema, and in this schema create the COURSES, STUDENTS and ENROLLMENT tables using the sql/CREA_ENROLLMENT.sql script.
 
2. Run the sql/insert_courses.sql, sql/insert_students.sql and sql/insert_enrollment.sql scripts in that order to create test records.

3. Create a user metadata with password metadata that has access to the schema metadata in MYSQL.

4. Download the code from 

4. To review code using eclipse IDE, import the "enrollment" project using maven's pom.xml.

5. Set the java compiler to version 11 in eclipse for this project.

6. If you use another user or schema that is the same in MYSQL, change the datasource attributes in "src/main/resources/application.properties"

7. Build the project with maven using "mvn install".


To Run project as an executable jar: 


8. Run the project directly using the jar target/enrollment-0.0.1-SNAPSHOT.jar generated in target with Java v11 from the command line:

	>java -jar enrollment-0.0.1-SNAPSHOT.jar

9. The Spring Boot console appears and the system eventually boots up. A message appears to print the splash reports:

"Print Splash Reports(Y)? "

10. Enter Y and all the test records for Students, Courses and Enrollment will appear depending on the records that are in the DB.

To Run project as a docker container:

8. From the  


8. Run the project directly using the jar target/enrollment-0.0.1-SNAPSHOT.jar generated in target with Java v11 from the command line:

	>java -jar enrollment-0.0.1-SNAPSHOT.jar

9. The Spring Boot console appears and the system eventually boots up. A message appears to print the splash reports:

"Print Splash Reports(Y)? "

10. Enter Y and all the test records for Students, Courses and Enrollment will appear depending on the records that are in the DB.

A CRUD REST API for the TRANSACTIONS table can also be accessed using a browser or Postman

ejemplos

http://localhost:8088/transaccions //Aparecen todos los registros que estan en la BD en formato JSON

http://localhost:8088/transaccions/10003  ??Aparece el registro correspondiente al id_orden = 10003

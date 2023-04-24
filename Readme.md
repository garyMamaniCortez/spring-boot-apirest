# Spring Boot Api rest
this is a proyect to practice my squills with spring boot
## Tecnologies
- Spring Boot
- Java
- MySQL
## About how to run it
In CMD put:
~~~
./mvnw spring-boot:run
~~~
this is for a maven spring boot proyect
### Posible errors at executing
Sometimes, I don't know why MySQL driver requires public key retrival so you must put this:
~~~
spring.datasource.url=jdbc:mysql://localhost/db_springboot_backend?allowPublicKeyRetrieval=true&useSSL=false
~~~
at src\main\resources\application.properties

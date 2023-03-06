# student-api-with-native-query
## Spring Project that is a Stident management system
### Steps to complete the projects
1. Create a project using Spring Initializer with required dependencies(link:- https://start.spring.io/ )
2. Create a Student  model 
3. Implement all endpoints provided above
4. You have to add mysql database

### The user will have the following attribute :
1. studentId
2. firstName
3. lastName
4. age
5. admissionDate

### Endpoints to provided :
1. add Student 
 ```
http://localhost:8080/add-student
```
3. delete student
 ```
http://localhost:8080/delete-by-id/{studentId}
```
4. get all student
 ```
http://localhost:8080/get-all
```
5. get all active user by lastName
 ```
http://localhost:8080/find-by-lastname-and-active/{lastName}
```
6. Get all by first name
 ```
http://localhost:8080/find-by-first-name/{firstName}


```
7. Get all between min and max age
 ```
http://localhost:8080/find-by-age-between/{age}/{age2}
```
7. Get all student who took admission after ceratin date
 ```
http://localhost:8080/find-by-addmission-date-after/{date}
```
[![Screenshot (92)](https://user-images.githubusercontent.com/41718548/222973050-45c844c5-18fc-4423-befd-00e3f050497b.png)](https://youtu.be/l7DtSjOEep8)



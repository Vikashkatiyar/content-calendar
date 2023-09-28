# Steps to host api on railway.app 


1.Select PostGreSQl DataBase on railway.app

2.Set a external variable --> spring_profiles_active=production

3.Select the Github Repository

4.Deployed automatically  Run Anywhere✌️✌️😉

# How to run this project on local machine

1.Just clone this project

2.make changes in application.properties file username and password ,port(if need)

3.Run the Application 

4 just put this url in browser "localhost:8080/api/content"  to get all data.

# Used TeckStack
Spring Boot 3
============
> spring-boot-starter-web

> spring-boot-starter-validation

> spring-boot-starter-data-jdbc

> spring-boot-starter-actuator

> postgresql database

> Postman tool

# Note:-
If you need any help feel free to reach out Vikashktr018@gmail.com
 
# Image from railway.app

![image](https://github.com/Vikashkatiyar/content-calendar/assets/89769715/d8d79ce0-8d57-443b-a57f-c4c7a6965895)

# Image from Postman

![image](https://github.com/Vikashkatiyar/content-calendar/assets/89769715/a386f392-b32c-4a6f-8bde-ce3396cb801d)


# Content Calender Spring RESP API

_This project showcases the power of Java and Spring Boot, 
combined with a Postgres database, to create a versatile 
and efficient API for managing various types of content.
This project is used for learning and experimentation._

Built With:

- Java
- Spring Boot
- Postgres Database

Key Features:

- Use Spring Data JDBC
- REST API
- CRUD + Filtering functionalities

### Endpoints

### Get Details (Home)
```http request
GET /
```

### Get All contents
```http request
GET /api/content/
```

### Get a specific content
```http request
GET /api/content/{{id}}
```

### Add a new content

- _enum status  "IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"_
- _enum contentType "ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"_
```http request
POST /api/content/
Content-Type: application/json
{
  "id": null,
  "title": "",
  "desc": "",
  "url": "",
  "status": "",
  "contentType": "",
  "dateCreated": "",
  "dateUpdated": null
}
```

### Update existing content

- _enum status  "IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"_
- _enum contentType "ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"_
```http request
PUT /api/content/{{id}}
Content-Type: application/json
{
  "id": null,
  "title": "",
  "desc": "",
  "url": "",
  "status": "",
  "contentType": "",
  "dateCreated": "",
  "dateUpdated": null
}
```

### Delete existing content
```http request
DELETE /api/content/{{id}}
```

### Filter by keyword
```http request
GET /api/content/filter/{{keyword}}
```

### Filter by status
```http request
GET /api/content/filter/status/{{status}}
```

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

## Show your support

Give a ⭐️ if you like this project!




# rest-api
Rest API practice

## Notes

### 1. Related application stuff

To access to UI:
- http://localhost:8080/h2-console

---

Sample request:

- To create event: `POST` http://localhost:8080/event

Request: 
```
{
    "title": "title 1",
    "place": "place 1",
    "speaker":"speaker 1",
    "eventType":"TECH_TALK",
    "dateTime": "2022-01-01T15:53:16"
}
```

- To find by ID: http://localhost:8080/event/10
- To find all: http://localhost:8080/events
- To check open api: http://localhost:8080/v3/api-docs/
- To go to swagger UI: http://localhost:8080/swagger-ui/index.html

---

### 2. Related technical stuff

Work with h2: 

- https://www.baeldung.com/spring-boot-h2-database

---

h2 setup problem: 

- https://stackoverflow.com/questions/45302132/h2-not-creating-updating-table-in-my-spring-boot-app-somethings-wrong-with-my

In my case, applying this solved my problem

> Just go to the H2 console for example at: http://localhost:9090/h2-console/ and In the JDBC URL field, type `jdbc:h2:mem:testdb` to configure the connection to the testdb database in RAM.

---

Convert java `LocalDatetime`

- https://stackoverflow.com/questions/61202937/json-parse-error-cannot-deserialize-value-of-type-java-time-localdatetime-fro

---

Problem when use Springboot and Springfox:

- https://stackoverflow.com/questions/70178343/springfox-3-0-0-is-not-working-with-spring-boot-2-6-0

In my case, adding `@EnableWebMvc` solved the problem

---

Springboot version above 2.6 and Swagger problem:

- https://stackoverflow.com/questions/46151540/added-springfox-swagger-ui-and-its-not-working-what-am-i-missing

==> Decided to change to open api

---

Setup open api:

- https://springdoc.org
- https://www.baeldung.com/spring-rest-openapi-documentation


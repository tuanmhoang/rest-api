# rest-api
Rest API practice

## Notes

### Related application stuff

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

### Related technical stuff

Work with h2: 
- https://www.baeldung.com/spring-boot-h2-database

---

h2 setup problem: 

- https://stackoverflow.com/questions/45302132/h2-not-creating-updating-table-in-my-spring-boot-app-somethings-wrong-with-my

---

Convert java `LocalDatetime`

- https://stackoverflow.com/questions/61202937/json-parse-error-cannot-deserialize-value-of-type-java-time-localdatetime-fro
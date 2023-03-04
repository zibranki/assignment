# Assignment
Assignment details can be found in the assignment.pdf file

## How to run

Be sure to have docker/docker desktop installed. 
Gradle is bundled with the application, but if not running from an IDE - Java 17 (LTS) must be installed too.

1. Start database container with
```
    cd docker/
    docker compose up
 ```

2. Start spring application

Linux:
```bash
    ./gradlew bootRun
```
Windows:
```shell
    .\gradlew.bat bootRun
```

## How to invoke

gRPC calls can be made with postman version 9.7.1 and above.

There is two methods:
* **processPayment** will accept payment, store it in the database and return calculated answer
* **getSalesStats** will return aggregated sales stats

Protobuf have limited set of data types, most message fields are received as string and then parsed. 
Errors in fields format and with business logic are returned as INVALID_ARGUMENT status with the description.

## Requirements
- Java 8
- Spring Boot
- Mysql Database


## Database configuration in application.properties file
// example URI jdbc:mysql://localhost:3306/general

**Note: It automatically Inserts Static Data to database from data.sql file**
```
spring.datasource.driver-class-name=<driver_classname>
spring.datasource.url=jdbc:<uri> 
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.sql.init.platform=<Database_server_type>
spring.sql.init.data-locations=<static_data_file_location>
```
## Run the application
```
mvnw clean spring-boot:run
```
## After run Check the API doc here
```
http://<Host_IP>:<port>/swagger-ui.html
```

## Rest Api Details
1. 
Endpoint : /allcountry
Example Rest_Url : http://localhost:6000/generalservice/allcountry

Response_Type : Json
Sample Response : {
    "status": {
        "status": 200,
        "msg": "success"
    },
    "entity": [
        {
            "id": 1,
            "countryName": "Afghanistan",
            "countryCode": "AF",
            "countryDialCode": "+93",
            "currencyNumeric": "971",
            "iso": "4",
            "countryCodeThreeLetter": "AFG",
            "nationality": "Afghani",
            "totalNumber": 9,
            "phoneFormat": "2:3:4",
            "multipleFormat": false,
            "active": false
        }
    ]
}
# Birth Year Calculator
Spring Boot application to calculate the Year of Birth by taking Age as input

**NOTE**:
1. This application is available as a Docker image in [Docker Hub](https://hub.docker.com/r/mintellect310/my_first_repo).

2. To pull this image, execute `docker pull mintellect310/my_first_repo` in your terminal

3. To run this image, execute `docker run -p 9900:8080 mintellect310/my_first_repo` in your terminal

4. To check whether the application is working, import and run the following cURL in Postman: <br>
    `curl --location --request GET 'http://localhost:9900/?age=24'`

5. The output will be `1998`. For other inputs, you can change the **age** parameter in the cURL or in Postman.

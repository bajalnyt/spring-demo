## Demo project to show JPA capabilities and Google Jib to containerize

The project shows how to use JPA with Oracle to run queries and display it on a screen.

#### JPA
Use of @Entity to represent an oracle table and execute queries on it.


#### Containerization
Add Google Jib to gradle plugins. See example[here](https://github.com/GoogleContainerTools/jib/blob/master/examples/spring-boot/build.gradle).

`id 'com.google.cloud.tools.jib' version '1.4.0'`

Create the image, and push to dockerhub registry:

`./gradlew jib --image=bajal/spring-demo`


Deploy to a kubernetes instance, for eg. Minikube

`kubectl run spring-demo --image=bajal/spring-demo --port=8080 --image-pull-policy=IfNotPresent`
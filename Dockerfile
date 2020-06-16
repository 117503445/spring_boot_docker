FROM maven:3.6.3-openjdk-14 AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package -Dmaven.test.skip=true
FROM openjdk:14-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/spring_boot_docker.jar /app/
ENV var1="" var2=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar", "spring_boot_docker.jar","--env.var1=${var1}","--env.var2=${var2}"]
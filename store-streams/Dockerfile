FROM adoptopenjdk/openjdk11 as builder
RUN mkdir -p /app/source
COPY . /app/source
WORKDIR /app/source
RUN ./mvnw clean package

FROM adoptopenjdk/openjdk11:alpine-jre as runtime
COPY --from=builder /app/source/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
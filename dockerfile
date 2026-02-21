FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY forloop.java .

RUN javac forloop.java

CMD ["java", "forloop"]
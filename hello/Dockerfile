FROM java:8
ADD target/hello:1.0.jar app.jar
RUN bash -c 'touch /app.jar'
RUN echo 'Asia/Shanghai' >/etc/timezone
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
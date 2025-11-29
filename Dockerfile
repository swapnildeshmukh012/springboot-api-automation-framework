FROM gradle:8.5-jdk21

WORKDIR /app
COPY . /app

RUN gradle clean test --no-daemon

CMD ["gradle", "test"]

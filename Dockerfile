FROM gradle:8.7-jdk17-alpine AS build

WORKDIR /app
COPY . /app

CMD ["gradle", "test"]

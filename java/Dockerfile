FROM openjdk:11
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN javac GuessingGame.java
EXPOSE 5000
CMD ["java", "GuessingGame", "--dev-addr=0.0.0.0:5000"]

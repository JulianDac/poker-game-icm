# Poker Hand  

* Prerequisite:\
Maven

* To compile project, run the following command

```
mvn clean package
```

* Copy into resources the test cases of the poker hands and run the following command

```
cat src/main/resources/poker-hands.txt | java -jar target/PokerGame.jar
```
* Results:\
Of the 500 games played, player 1 won 262 hands and player 2 won 238 hands.

Credits\
Algorithm to assign values to poker hands by Emory University Computer Science Department
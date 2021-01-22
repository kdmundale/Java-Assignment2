Java Programming
Assignment #2

Exercise 1:
Write a Java application that simulates a test. The test contains at least five questions about firstthree lectures of this course. Each question should be a multiple-choice question with 4 options. 

Design a Test class. Use programmer-defined methods to implement your solution. 

For example:-create a method to simulate the questions – simulateQuestion
-create a method to check the answer – checkAnswer
-create a method to display a random message for the user – generateMessage
-create a method to interact with the user - inputAnswer

Use a loop to show all the questions.
For each question:
    -If   the   user   finds   the   right   answer,   display   a   random   congratulatory   message(“Excellent!”,”Good!”,”Keep up the good work!”, or “Nice work!”).
    -If the user responds incorrectly, display an appropriate message and the correct answer(“No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying..”).
    -Use random-number generation to choose a number from 1 to 4 that will be used to selectan appropriate response to each answer. 
    -Use a switch statement to issue the responses, as in the following code:
    switch ( randomObject.nextInt( 4 ) ){
        case 0:return( "Very good!" );......}
        
At the end of the test display the number of correct and incorrect answers, and the percentage ofthe correct answers.Your main class will simply create a Test object and start the test by calling  inputAnswermethod.

Exercise 2:

Design a Lotto class with one array instance variable to hold three random integer values (from 1to 9). Include a constructor that randomly populates the array for a lotto object. Also, include amethod in the class to return the array.Use this class to simulate a simple lotto game in which the user chooses a number between 3 and27. The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated. If the number chosen by the user matches the sum, the user wins and the game ends. If the numberdoes not match the sum within five rolls, the computer wins.

Exercise 3:
Write a Java class that implements a set of three overloaded static methods. The methods shouldhave different set of parameters and perform similar functionalities. Call the methods withinmain method and display the results.
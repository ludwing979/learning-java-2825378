import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the color of the sun?";
        final String choiceOne = "black";
        final String choiceTwo = "yellow";
        final String choiceThree = "white";

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        // Have the user input an answer
        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        switch (answer) {
            case choiceOne:
            case choiceThree:
            default:
                System.out.println("You choice the wrong answer, the answer was yellow");
                break;
            case choiceTwo:
                System.out.println("Congratulations, you are right");
                break;
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}

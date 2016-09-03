package nyc.c4q.josegonzalez;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean playersChoice = true;
        while (playersChoice == true){
            char path = ' ';
            int slices = 0;
            String pathAChoice ="";

            String desicionOne = beginningOfStory();
            if (desicionOne.equals("yes")){
                pathAChoice = pathA();
                path = 'a';
            } else if (desicionOne.equals("no")){
                slices = pathB();
                path = 'b';
            } else{
                promptUser("You failed to answer correctly. You awake to find yourself in a puddle");
                promptUser("Game Over");
            }
            if ('a' == path){
                if (pathAChoice.equals("yes")){
                    finalChoice();
                }else if(pathAChoice.equals("no")){
                    loopChoice();
                }else{
                    promptUser("Try Again");
                }

            }else {
                pathBTwo(slices);
            }

            boolean isValidInput;
            do {
                promptUser("Do you want to play again?");
                String userAnswer = readString();
                userAnswer = userAnswer.toLowerCase();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    isValidInput = true;
                    playersChoice = true;

                } else if (userAnswer.equals("no") || userAnswer.equals("n")) {
                    isValidInput = true;
                    playersChoice = false;

                } else {
                    System.out.println("That is not a valid answer. Please try again.");
                    isValidInput = false;
                }
            }while (isValidInput == false);
        }
    }
    public static void promptUser(String prompt){
        System.out.println(prompt);
    }
    public static String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String beginningOfStory() {
        promptUser("It's time for bed. You go to sleep and slowly all reality seems to melt away");
        promptUser("You find yourself in a dream and you realize you're at the front door of your childhood home.");
        promptUser("Do you go inside? Yes or No");
        String firstDesicion = readString();
        firstDesicion = firstDesicion.toLowerCase();
        return(firstDesicion);
        }

    public static String pathA(){
        promptUser("You walk into the home and see that nothing has changed. But as you look closer");
        promptUser("You realize that all items pertaining to your exsistence are gone");
        promptUser("As you slowly come to grips with your nonexsistence you hear a noise.");
        promptUser("Do you investigate? yes or no");
        String desicion = readString();
        desicion =desicion.toLowerCase();
        return(desicion);
    }
    public static int pathB(){
        promptUser("You decide not to enter your childhood home and instead decide to walk around");
        promptUser("your dream. After walking through a concert hall and an airport lounge you find");
        promptUser("yourself in a Mall food court. All this walking around has made you hungry");
        promptUser("You see 10 unattended slices of Sbarros pizza. How many slices do you eat 0 - 10");
        Scanner scanner = new Scanner(System.in);
        int pizzaSlices = scanner.nextInt();
        return(pizzaSlices);

    }
    public static void pathBTwo(int pizza){
        switch(pizza){
            case 0:
                promptUser("You wake up with a mouth full of feathers and your pillow is missing");
                promptUser("Game Over");
                break;
            case 1:case 2:case 3:
            case 4:case 5:case 6:
                promptUser("You feel great. You are ready to continue your journey");
                promptUser("Except, your starting to feel tired. You decide to take a nap");
                promptUser("You've been incepted GAME OVER");
                break;
            case 7:case 8:case 9:
            case 10:
                promptUser("You are too full to move. Out of the corner of your eye you see the");
                promptUser("Noid, with a pizza cuuter. You try to move but you cant");
                for (int i = 0; i < pizza; i++){
                    promptUser("The Noid slices you with the pizza cutter");
                }
                promptUser("You are dead! GAME OVER!");
                break;
            default:
                promptUser("Do you not know how to listen to instructions?");
                promptUser("Ya Dead!");
        }

    }
    public static void finalChoice(){
        promptUser("You walk into the next room and see your old pet dog");
        promptUser("He looks at you but does not recognize you");
        promptUser("Do you: a. run to him and pet him ");
        promptUser("b. call his name");
        promptUser("or c. stand still and reach into your pocket.");
        String multipleChoice = readString();
        int length = multipleChoice.length();
        multipleChoice = multipleChoice.toLowerCase();
        if (multipleChoice.charAt(0) == 'a' && length < 2){
            promptUser("You try and pet your dog but as your hand reaches his head he turns and");
            promptUser("snaps at you. You wake up startled and with a slight pain in your hand");
            promptUser("GAME OVER!");
        }else if(multipleChoice.charAt(0) == 'b' && length < 2){
            promptUser("You call out your dogs name, Puppy. He turns and looks at you. He runs");
            promptUser("away. You are sad. You begin to cry. The room fills with your tears and");
            promptUser("you are washed away. You wake up feeling sad.");
            promptUser("Game Over");
        }else if (multipleChoice.charAt(0) == 'c' && length < 2){
            promptUser("You reach into your pocket and pull out a slim jim. Your dog runs to you");
            promptUser("And slowly morphs into Randy Macho Man Savage. He looks into your eyes and");
            promptUser("says OHHHH YEEEEAH! thanks for the slim jim. And thanks for being a good owner");
            promptUser("Woof! I mean peace. And with that he flew away and you realized you were in a dream");
            promptUser("So you flew away too. You woke up feeling refreshed.");
            promptUser("Game Over?");
        }else{
            promptUser("Wow you really hate rules. Oh well it's just a game and this one is over");
        }
    }
    public static void loopChoice(){
        promptUser("You decide not to investigate the noise. Instead you decide to leave the");
        promptUser("home. You walk out the front door and step back into the living room.");
        promptUser("What should you do? ");
        String noChoice = readString();
        promptUser("You hear a voice yell " + noChoice + " will not work. You are trapped");
        promptUser("What do you do?");
        String secondChoice = readString();
        promptUser(secondChoice + " worked. The house starts to fall apart. You walk out");
        promptUser("and jump on your Harley Davidson and fly away.");
        promptUser("Game Over");

    }

}



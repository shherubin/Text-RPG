import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String right; //TODO: delete because it is unused
        String left; //TODO: delete because it is unused

        System.out.println("ALchemy wrought the base elements of humanity into thriving civilizations, like lead into gold. But in time man's dreams gave birth to untold strife. \n" +
        "Dreams of endless riches, of eternal life, of dominion over all that lived... Dreams of conquest and war.");
        System.out.println("These dreams would have torn the world apart if not for a few wise and brave men who sealed away the power of alchemy deep in Dragon's Peak Hall");
        System.out.println("What is your name adventurer?");
        System.out.print(">");
        Scanner stdin = new Scanner(System.in);
        //This variable IN THIS CASE is reusable (refer to subexample 1)
        String word = stdin.nextLine(); //value: their name
        System.out.println("Welcome " + word + " let us begin our adventure");
        System.out.println("We have entered a scary mansion and must clear without encountering monsters as you are unarmed");
        System.out.println("Do you want to turn left or right?");
        /**
          word will get overwritten with a new value which happens to be their first choice
          subexample 1:
          String word = "" | word's value is empty (blank means " ")
          word = "awesome" | word's value is "awesome"
          System.out.println(word) -> This will print "awesome"
          word = "cool"
          System.out.prinln("word") -> This will print "cool"
        */
        word = stdin.nextLine(); //value: first choice
        System.out.print(">");
        if (choice1.equalsIgnoreCase("left")) {
            System.out.println("You have met bandits and been killed");
        } else if (choice1.equalsIgnoreCase("right")){
            System.out.println("You walk thru the first room to a grand hall with stairs leading up and down");
            System.out.println("Will you journey upstairs or downstairs?");
            System.out.print(">");
            Scanner stdin2 = new Scanner(System.in);
            String choice2 = stdin2.nextLine();
            if (choice2.equalsIgnoreCase("upstairs")){
                    System.out.println("You meet a druid in a black rope at the top of the steps, he casts magic and kills you");
            } else if (choice2.equalsIgnoreCase("downstairs")) {
                    System.out.println("The bottom of the stairs is dark with minimal light, reaching the bottom you see two cellar paths, left and right.");
                    System.out.println("Will you travel left or right?");
                    System.out.print(">");
            }
            Scanner stdin3 = new Scanner(System.in);
            String choice3 = stdin3.nextLine();
            if (choice3.equalsIgnoreCase("right")){
                System.out.println("You walk the rocky path, as you take another step the floor gives way to a trap, You are killed instantly");
            }
            else if(choice3.equalsIgnoreCase("left")){
                System.out.println("The cellar path is small but you work thru it slowly, light begins to echo thru the tunnel");
                System.out.println("As you reach it a large room expands and a single desk with a running computer is there");
                System.out.println("The computer asks for an input of 2 words with 10 letters that introduces you to our planet.");
                System.out.print(">");
                Scanner stdin4 = new Scanner(System.in);
                String choice4 = stdin4.nextLine();
                if (choice4.equalsIgnoreCase("Hello World"))
                    System.out.println("YOU HAVE UNLOCKED UNLIMITED HENTAI!!!!!!!!!");
                else
                        System.out.println("YOU DIED");
            }
        }
    }
}

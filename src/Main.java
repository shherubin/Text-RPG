import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input = "";

        System.out.println("ALchemy wrought the base elements of humanity into thriving civilizations, like lead into gold. But in time man's dreams gave birth to untold strife. \n" +
        "Dreams of endless riches, of eternal life, of dominion over all that lived... Dreams of conquest and war. \n" +
        "These dreams would have torn the world apart if not for a few wise and brave men who sealed away the power of alchemy deep in Dragon's Peak Hall. \n" +
        "What is your name adventurer?");
        System.out.print(">");
        Scanner stdin = new Scanner(System.in);
        input = stdin.nextLine();
        //This variable IN THIS CASE is reusable (refer to subexample 1)
        System.out.println("Welcome " + input + " let us begin our adventure. \n" +
        "We have entered a scary mansion and must clear without encountering monsters as you are unarmed. \n" +
        "Do you want to turn left or right?");
        input = stdin.nextLine(); //value: first choice
        System.out.print(">");
        if(input.equalsIgnoreCase("left")) {
            System.out.println("You have met bandits and been killed");
        }else if (input.equalsIgnoreCase("right")){
            System.out.println("You walk thru the first room to a grand hall with stairs leading up and down \n" +
            "Will you journey upstairs or downstairs?");
            System.out.print(">");
        if(input.equalsIgnoreCase("upstairs")){
            System.out.println("You meet a druid in a black rope at the top of the steps, he casts magic and kills you");
        }else if (input.equalsIgnoreCase("downstairs")) {
            System.out.println("The bottom of the stairs is dark with minimal light. \n" +
                    "reaching the bottom you see two cellar paths, left and right. \n" +
                    "Will you travel left or right?");
            System.out.print(">");
        }
        if(input.equalsIgnoreCase("right")){
            System.out.println("You walk the rocky path, as you take another step the floor gives way to a trap, You are killed instantly");
        }else if(input.equalsIgnoreCase("left")){
            System.out.println("The cellar path is small but you work thru it slowly, light begins to echo thru the tunnel. \n" +
                "As you reach it a large room expands and a single desk with a running computer is there. \n" +
                "The computer asks for an input of 2 words with 10 letters that introduces you to our planet.");
            System.out.print(">");
        if (input.equalsIgnoreCase("Hello World"))
            System.out.println("YOU HAVE UNLOCKED UNLIMITED HENTAI!!!!!!!!!");
        else
            System.out.println("YOU DIED");
            }
        }
    }
}
/**
 word will get overwritten with a new value which happens to be their first choice
 subexample 1:
 String word = "" | word's value is empty (blank means " ")
 word = "awesome" | word's value is "awesome"
 System.out.println(word) -> This will print "awesome"
 word = "cool"
 System.out.prinln("word") -> This will print "cool"
 */
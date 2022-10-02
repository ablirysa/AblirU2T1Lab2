import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChatBot debbie = new ChatBot("Debbie", 17);

        System.out.print("What's your name? ");
        String name = scan.nextLine();
        System.out.println();

        debbie.greeting(name);
        String day = scan.nextLine();
        System.out.println();

        System.out.println("Well, I, " + name + ", would like to know about the weather...");
        System.out.println();

        debbie.weather();

        System.out.print("So, what's your favorite integer? ");
        int favNum = scan.nextInt();
        System.out.println();

        debbie.favoriteNumber(favNum);

        System.out.print("And did you know, if your number was in feet, it would equal " + debbie.convertFeetToMeters(favNum));
        System.out.println(" meters! ");
        String reaction = scan.nextLine();
        System.out.println();

        System.out.print("Also, if I were to add a random number, your number, and my second favorite number...");
        System.out.println("We would get " + debbie.addNumbers(17, favNum, 30));
        System.out.println("But, if we subtract those numbers... You'd get " + debbie.subtractNumbers(17, favNum, 30));

        System.out.print("But anyways, I have to go!");
        debbie.goodbye();
        System.out.println("...");
        debbie.forgot();
    }
}
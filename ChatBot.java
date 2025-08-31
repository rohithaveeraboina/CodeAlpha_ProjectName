import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AI ChatBot: Hello! I'm your chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            } else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("ChatBot: Hello! How can I help you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("ChatBot: I'm just code, but I'm doing great! How about you?");
            } else if (userInput.contains("name")) {
                System.out.println("ChatBot: I'm a simple AI ChatBot built in Java!");
            } else if (userInput.contains("time")) {
                System.out.println("ChatBot: Sorry, I don't have a clock yet.");
            } else {
                System.out.println("ChatBot: Hmm... I don't understand that. Can you rephrase?");
            }
        }
        scanner.close();
    }
}

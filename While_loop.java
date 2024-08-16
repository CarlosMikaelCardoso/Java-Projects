import java.util.Scanner;

public class While_loop{
    public static void main(String[] args) {
        
        // While loop = execute a block of code as long as a it's condition is true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter Your Name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);
        scanner.close();
    }
}
import java.util.Scanner;

public class CorporateEmailValidator {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String dominio =  "@company.com";
        System.out.println("Enter your email address: \"@company.com ");
        String email = scanner.nextLine().trim();

        if(email.endsWith(dominio)){
            System.out.println("Valid email address:");
        } else {
            System.out.println("Invalid email address");
        }
        scanner.close();
    }
}






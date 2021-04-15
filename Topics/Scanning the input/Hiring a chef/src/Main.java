//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String stateOfEducation = scanner.next();
        String yearsExperience = scanner.next();
        String cuisinePref = scanner.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that " +
                "cooks " + cuisinePref + " dishes.");
    }
}
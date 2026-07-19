import java.util.Scanner;
class main {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        double balance = 500.00; 
        boolean running = true;

        System.out.println("=== Welcome to your VS Code ATM ===");

        while (running) {
            
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();

           
            if (choice == 1) {
                System.out.println("Current Balance: $" + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double depAmount = sc.nextDouble();
                
                if (depAmount > 0) {
                    balance += depAmount; 
                    System.out.println("Successfully deposited: $" + depAmount);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double witAmount = sc.nextDouble();
                
                
                if (witAmount > 0 && witAmount <= balance) {
                    balance -= witAmount;
                    System.out.println("Successfully withdrew: $" + witAmount);
                } else if (witAmount > balance) {
                    System.out.println("Error: Insufficient funds!");
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
            } 
            else if (choice == 4) {
                running = false; 
                System.out.println("Thank you for using the ATM. Goodbye!");
            } 
            else {
                System.out.println("Invalid choice. Please choose 1-4.");
            }
        }
        
        sc.close(); 
    }
}
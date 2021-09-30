import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    System.out.println("how many employees do you want to calculate the wage of?");
    int employeeNumber = sc.nextInt();
    for(int i = 0; i< employeeNumber;i++){
        double finalWage = 0;
        System.out.println("what is the employee's name?");
        String employeeName = sc.nextLine();
        System.out.println("how many hours have they worked this week?");
        int hoursWorked = sc.nextInt();
        System.out.println("what is their hourly wage?");
        double hourlyWage = sc.nextDouble();
        if(hoursWorked > 45){
            double wage1 = (45*hourlyWage);
            double wage2 = ((hoursWorked-45)*1.5);
            finalWage = (wage1+wage2);
        }
        else{
            finalWage = (hoursWorked*hourlyWage);
        }
        double taxedWage = (finalWage*0.8);
    }
    }
}

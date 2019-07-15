/* In this code, we want to know how much a salesman have to sell in order to achieve a salary of $30,000 a year.
 We will be using methods & loops to calculate everything.
*/

//scanner to get input from user
import java.util.Scanner;

// main class
public class Commission_Calculator {

	// method declared
public static double computeCommission(double sales) {

	// if loops to calculate the commission
if (sales <= 5000) {

return sales * 0.08;
}

// else if loops to calculate the commission
else if(sales <= 10000) {
return 5000 * 0.08 + (sales - 5000)*0.1;
}

//  else loops to calculate the commission
 else {
return 5000 * 0.08 + 5000 * 0.1 + (sales - 10000)*0.12;
}
}

//method declared to print the sales & commission in the format the professor wants.
//the method contains parameters begginingSalesAmount, salesIncrement, endingSalesAmount. 

public static void printCommission (double beginningSalesAmount, double salesIncrement, double endingSalesAmount) {

	// the \t is TAB so it adds the space to get the desired format.
System.out.println("Sales Amount\tCommission Rate");

// for loop that implements the computeComission method created earlier that calculates the commission for the amount of sales.
for (double amount = beginningSalesAmount; amount <= endingSalesAmount; amount += salesIncrement) {

	// the .0f makes the program output 0 decimal points while the .1 makes the program output 1 decimal point
System.out.printf("%.0f\t\t %.1f\n",amount, computeCommission(amount));

}

}

// method that calculates the amount of sales needed to reach a certain salary. Has parameter desiredSalary
public static double targetSales(double desiredSalary) {

// The desired salary must subtract 5000 because its base salary. we want to know the commission earnings.

double remainingSalary = desiredSalary - 5000;

double salesAmount = 0.01;

while(computeCommission(salesAmount) < remainingSalary) {

salesAmount += 0.01;

}

return salesAmount;

}


// add user input using scanner that allows user to input their desired salary,
public static void main(String[] args) {

printCommission(10000, 5000, 100000);

Scanner keyboard = new Scanner(System.in);

System.out.println("\nEnter your desired salary: $");

double desired = keyboard.nextDouble();

System.out.printf("You need to generate sales amount: $%.2f", targetSales(desired));

keyboard.close();

}

}
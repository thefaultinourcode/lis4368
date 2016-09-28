import java.util.Scanner;
import java.math.*;


import java.text.NumberFormat;

public class Test{
	public static void main(String[] args){
//Scanner sc = new Scanner(System.in);
     /*
      String choice = "y";
      while (choice.equals("y"))
      {
         System.out.print("Enter subtotal:   ");
         double subtotal = sc.nextDouble();
         double salesTax = subtotal * .0875;
         double invoiceTotal = subtotal + salesTax;
         String message = "Subtotal = " + subtotal + "\n"
                        + "   Sales tax = " + salesTax + "\n"
                        + "Invoice total = " + invoiceTotal + "\n\n";
         System.out.println(message);
         System.out.print("Continue? Enter y or n: ");
         choice = sc.next();
      }

     
      
 int i = 1;
 int months = 5;
while (i < months) 
{
   //futureValue = futureValue * (1 + monthlyInterestRate);
   i = i+1;
   System.out.println(i);
}



BigDecimal totalOne = new BigDecimal(6.728);
BigDecimal totalTwo = new BigDecimal(116);

totalOne = totalOne.setScale(2, RoundingMode.HALF_UP);
BigDecimal totalFinal = totalTwo.add(totalOne);
System.out.println(totalFinal);

int x = 100;
float y = 1.587F;
double z = 4.8;

System.out.println(x + Math.round(y) +(int)z);
*/

double x =2.5;
double y = 4.0;
int z = (int)x +(int)y;
System.out.println(z);

int input = 755;
NumberFormat n = NumberFormat.getNumberInstance();
n.setMinimumFractionDigits(3);
String r = n.format(input);
System.out.println(r);
double percent = 0.0755;
String p = NumberFormat.getPercentInstance().format(percent);
System.out.println(p);
}
}
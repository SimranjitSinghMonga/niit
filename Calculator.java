import java.util.Scanner;
class Calculator
{
  int no1,no2,res,option;
 Scanner sc=new Scanner(System.in);
  public void Calc()
  {
System.out.print("Enter First No : ");
no1=sc.nextInt();
System.out.print("Enter Second No : ");
no2=sc.nextInt();
System.out.println("****************************************************");
System.out.println();
System.out.println(" 1. Addition  ");
System.out.println(" 2. Subtraction ");
System.out.println(" 3. Division  ");
System.out.println(" 4. Multipication ");
System.out.println(" 5. Exit  ");
System.out.println();
System.out.println("****************************************************");
System.out.print("Enter your option : ");
option=sc.nextInt();
switch(option)
{
   case 1:
          res=no1+no2;
          
   case 2:
          res=no1-no2;
          break;
case 3:
          res=no1/no2;
          break;
case 4:
          res=no1*no2;
          break;
case 5:
          System.exit(0);
default:
         System.out.println("Invalid option ");
         break;
}
System.out.println("Result is : "+res);

  }
public static void main(String[] args)
  {
  Calculator cal=new Calculator();
  cal.Calc();
  }
}
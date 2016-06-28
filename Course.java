class Demo
{
   public int years;

    public void Greet()
    {
   System.out.println("Greeting from NIIT");
   years=25;
   System.out.println("We have completed "+years+ " years");
    }
}
class Course
{
   public void Info()
    {
     System.out.println("Hi");  
    }

}
public class MainApp
{
 public static void main(String[] args)
  {
   Course c=new Course();
   c.Info();
   c.Greet();
  }  
}

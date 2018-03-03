import java.util.*;

public class Tut1_11 {

	public static void main(String[] args) {
		
 Scanner input= new Scanner(System.in);
  System.out.println("insert your first number");
 	Double number_1 =input.nextDouble();
 
 	System.out.println("insert your second number");
 	Double number_2 =input.nextDouble();
 	
 	System.out.println("insert your third number");
 	Double number_3 =input.nextDouble();
 	
 	System.out.println("insert your forth number");
 	Double number_4 =input.nextDouble();
 	
 	System.out.println("insert your fifth number");
 	Double number_5 =input.nextDouble();
	
 	double total=SUM_UP(number_1, number_2,number_3, number_4, number_5);
 	 System.out.println("total="+ total);	
	}
	
  public static double SUM_UP(double  num1, double  num2, double  num3, double  num4, double  num5) {
	  double  sumUp= num1+ num2+num3+num4+num5;
    return sumUp;
 	 	}
  
	
	
}

# Integeroverflow
import java.util.*;
public class Integeroverflow {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int divi=sc.nextInt();
     int divisor=sc.nextInt();
     int count=0;
     while(divi>=0)
     {
    	 divi=divi-divisor;
    	 count++;
     }
     System.out.println(count-1);
	}

}

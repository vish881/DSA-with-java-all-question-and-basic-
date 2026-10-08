
import java.util.Scanner;
public class q4 {
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your four digit number");
        int n = sc.nextInt();
        int ans=0;
        for(int i=0;i<4;i++){
          
            ans=n%10;
            
       
        n--;
        
           
        }

         System.out.print(ans);
 }   
}

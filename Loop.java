
package loop;

import java.util.Scanner;
public class Loop {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double n1=10,n2=20,n3=30,large_no;
       if(n1>=n2)
       {
           if(n1>=n3)
           {
               large_no=n1;
           }
           else{
               large_no=n3;
           }
               
       }
       else{
           if(n2>=n3){
               large_no=n2;
           }
           else{
               large_no=n3;
           }
       }
       System.out.println("largest number is"+large_no);
    }
    
}

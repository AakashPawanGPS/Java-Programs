

import java.util.Scanner;

public class All_Divisors {

    public static void main(String[] args) {
        // write your code here
        //Print Divisors
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for( ; i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
}

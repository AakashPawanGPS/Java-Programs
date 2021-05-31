import java.util.Scanner;

public class ComputingPower {

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int temp=power(x,n/2);                       //O(log n)->space
        temp=temp*temp;                                 //T[n/2]  ->time
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
}

import java.util.Arrays;
import java.util.Scanner;

//Default_Implementation
//public class SieveOfEratosthenes {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        boolean[] array = new boolean[n+1];
//        Arrays.fill(array, true);
//        for(int i=2;i*i<=n;i++){
//            if(array[i]){
//                for(int j=i*i;j<=n;j+=i){
//                    array[j]=false;
//                }
//            }
//        }
//        for(int i=2;i<=n;i++){
//            if(array[i]){
//                System.out.println(i);
//            }
//        }
//    }
//}
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] array = new boolean[n+1];
        Arrays.fill(array, true);
        for(int i=2;i<=n;i++){
            if(array[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j+=i){
                    array[j]=false;
                }
            }
        }
    }
}
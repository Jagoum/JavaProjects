import java.util.*;
public class Fibonacci {
    public static int FinbonacciSeries(int n){
        if(n>=0){
        if(n == 0){
            return 0;
        }else if(n == 1)
        {
            return 1;
        }else{
           return FinbonacciSeries(n-1) + FinbonacciSeries(n-2);
        }
    }else{
        return -1;
    }
    }
    public static void main(String[] args) {
        int f0 = 0, f1 = 1,fn;
Scanner input = new Scanner(System.in);
System.out.print("Please enter an interger : ");
int n = input.nextInt(); 

if(FinbonacciSeries(n) == -1){
    System.out.println("Number cannot be negative");
}
else{
    System.out.print(FinbonacciSeries(n)+" ");
}
// if(n == 0){
// System.out.print(n);
// }
// else if(n==1){
//     System.out.print(f0 + " "+ f1 + " ");

// }
// else if(n<0){
//     System.out.println("Sorry but you cannot enter a negative interger ");
// }
// else{
// System.out.print(f0 + " "+ f1 + " ");
// for(int i = 2;i<=n;i++)
// {
//     fn = f0 + f1;
//     f0=f1;
//     f1=fn;
//     System.out.print(fn + " ");
// }
// }
    }
}

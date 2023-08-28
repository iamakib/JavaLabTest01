package Problem01;

import java.util.Scanner;

public class Numeric {
    public static double intPower(double x, int n){
        double ans;
        if(n<0){
            ans = 1/Math.pow(x,-n);
        }
        else if(n >=0 && n%2 == 0){
            ans = Math.pow(Math.pow(x,n/2),2);
        }
        else{
            ans = Math.pow(x,n-1)*x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and n : ");
        double x = scanner.nextFloat();
        int n = scanner.nextInt();

        double ans = Numeric.intPower(x,n);
        System.out.println("The required answer is : " + ans);
    }
}

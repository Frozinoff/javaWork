/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static int cub(int a){
        return a*a*a;
    }
    
	public static void main(String[] args) {
          
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int c;
        System.out.println("3 задание");
        if (num1 + num2 > 100) {
            System.out.println(cub(num1));
        }
        
        in.close();
    }
}

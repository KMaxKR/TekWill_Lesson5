import java.util.ArrayList;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        int countNegative = 0;
        int countPositive = 0;
        double sum = 0;
        double array[] = new double[100];

        Scanner input = new Scanner(System.in);
        System.out.println("Write your numbers");

        for (int i = 0; i <= 100; i++){
            double num = input.nextDouble();
            if( num != 0){
                array[i] = num;
                sum += array[i];
            }else{
            i = 100;
            }
        }

        System.out.println("Input was done ...");
        System.out.println("Next step ...");

        for (int j = 0; j < array.length; j++){
            if (array[j] > 0){
                countPositive++;
            }else if (array[j] < 0){
                countNegative++;
            }
        }

        System.out.println("In total are: " + countPositive + " positive numbers and " + countNegative + " negative numbers");
        System.out.println("Total sum is " + sum);
        System.out.println("Program end ...");

    }
}

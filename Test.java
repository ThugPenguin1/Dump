
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args){
        /*Lab1 file1 = new Lab1();
        file1.lab1(); // this is just bullshit ngl

        double[] nums = new double[3];
        for (int i = 0; i <= nums.length-1; i++){
            nums[i] = i*4.23;
        } // just to fulfill the lab 

        double[] templist = new double [] {123, 124.34, 5, 324, 1}; // personally test the lab2
        
        Lab2 file2 = new Lab2(nums);
        System.out.println("The sum is equals of num list = " + file2.sum());
        System.out.println("The avg is equals of num list = " + file2.avg());
        System.out.println("The maximum of num list = " + file2.max());
        System.out.println("The minimum of num list = " + file2.min());
        // using all the methods made in lab2
        */
        Lab3 file3 = new Lab3();
        /*file3.ask();
        file3.tell();*/

        // using joptionpane to ask for 3 numbers and say it back with the methods from lab2
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me the total number u wanna randomly generate: ");
        int totalnum = scanner.nextInt();
        System.out.println("\nNow tell me the minimum range: ");
        int minimum = scanner.nextInt();
        System.out.println("Finally, tell me the maximum range: ");
        int maximum = scanner.nextInt();
        System.out.println("");
        file3.randNum(totalnum, minimum, maximum);
        scanner.close();
        // lab 3 also got mark 6 replica



    }
}

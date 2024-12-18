import javax.swing.JOptionPane;
import java.util.*;
public class Lab3 {

    double[] arrayofnum;

    public Lab3(){
        
    }
    
    public double[] ask(){
        String nums = JOptionPane.showInputDialog(null, "enter 3 numbers seperated with ,: ");
        String[] stringArray = nums.split(",");
        double[] doubleArray = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringArray[i].trim()); // Convert to double
        }
        arrayofnum = doubleArray;
        return doubleArray;

    }

    public void tell(){
        Lab2 methoduse = new Lab2(arrayofnum);



        // showmessage = (null to make it centred, any message, title of window, message type)
        JOptionPane.showMessageDialog(null, "The average of the numbers you gave is: " + methoduse.avg(), "Average Number", 1);
        JOptionPane.showMessageDialog(null, "The max of the numbers you gave is: " + methoduse.max(), "Maximum Number", 2);
        JOptionPane.showMessageDialog(null, "The min of the numbers you gave is: " + methoduse.min(), "Minimum Number", 3);
        JOptionPane.showMessageDialog(null, "The sum of the numbers you gave is: " + methoduse.sum(), "Sum of Numbers", 0);


    }

    public int[] randNum(int totalNumbers, float minimum, float maximum){
        int[] num = new int[totalNumbers];
        for (int i = 0; i <= totalNumbers-1; i++){
            num[i] = (int) (minimum + Math.random()*(maximum-minimum+1));
        }
        JOptionPane.showMessageDialog(null, "The random numbers are: " + Arrays.toString(num),"random numbers", 0);



       
        return num;
    }


}

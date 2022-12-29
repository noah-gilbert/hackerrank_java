import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        // read in input
        Scanner in = new Scanner(System.in);
        int arrLen = in.nextInt();
        
        int[] intArr = new int[arrLen];
        int index = 0;
        while (in.hasNext()) {
            intArr[index] = in.nextInt();
            index++;
        }
        
        int countNegSubArrs = 0;
        int subArrSize = 1;
        while (subArrSize <= intArr.length) {
            for (int i = 0; i < intArr.length + 1 - subArrSize; i++) {
                int subArrSum = 0;
                for (int j = 0; j < subArrSize; j++) {
                    subArrSum += intArr[i + j];
                }
                
                if (subArrSum < 0) {
                    countNegSubArrs++;
                }
            }
            subArrSize++;
        } 
        System.out.println(String.valueOf(countNegSubArrs));
        
    }
}

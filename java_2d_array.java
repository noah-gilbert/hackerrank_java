import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static int SumHourglass(int x, int y, List<List<Integer>> arr) {
        int sum = 0;
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                // if its the middle row, only add the middle value
                if (i == x+1) {
                    sum += arr.get(x+1).get(y+1);
                    break;
                } else {
                    sum += arr.get(i).get(j);
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int maxHourglass = SumHourglass(0,0, arr);
        
        
        // loop through all possible starting top left most
        // values for each hourglass and check if its the max sum
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentHourglass = SumHourglass(i, j, arr);
                if(currentHourglass > maxHourglass) {
                    maxHourglass = currentHourglass;
                }
            }
        }
        System.out.println(maxHourglass);
    }
}

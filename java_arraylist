import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numLines = in.nextInt();
        in.nextLine();
        int currentLine = 0;

        List<List<Integer>> linesOfInts = new ArrayList<List<Integer>>();

        
        while (currentLine < numLines) {
            int arrSize = in.nextInt();
            List<Integer> lineIntArr = new ArrayList<Integer>();
            for (int i = 0; i < arrSize; i++) {
                lineIntArr.add(in.nextInt());
            }
            linesOfInts.add(lineIntArr);
            currentLine++;
            in.nextLine();
        }
        
        int numQueries = in.nextInt();
        in.nextLine();
        int queryCount = 0;
        
        while (queryCount < numQueries) {
            int line = in.nextInt() - 1;
            // subtract 1 since position given as index 1
            int arrPos = in.nextInt() - 1;
            
            // DEBUGGING OUTPUT
            // System.out.println("Array: " + line + ", Pos: " + arrPos);
            // System.out.println("ArrSize: " + linesOfInts.get(line).size());
            // System.out.println("Array at pos: " + linesOfInts.get(line).get(arrPos));
            // System.out.println();
            
            if (arrPos < linesOfInts.get(line).size()) {
                System.out.println(linesOfInts.get(line).get(arrPos));
            } else {
                System.out.println("ERROR!");
            }
            
            queryCount++;
            in.nextLine();
        }
    }
}

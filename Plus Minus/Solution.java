import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.text.DecimalFormat;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int negatives =0;
        int zeros = 0;
        int positives = 0;
        int n = arr.size();
        for (int i =0; i<n; i++)
        {
            if (arr.get(i) < 0)
            {
                negatives++;
            }
            else if (arr.get(i) == 0)
            {
                zeros++;
            }
            else
            {
                positives++;
            }
        }
        float positive_ratio= (float)positives/n;
        float negative_ratio = (float)negatives/n;
        float zero_ratio = (float)zeros/n;
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(positive_ratio));
        System.out.println(df.format(negative_ratio));
        System.out.println(df.format(zero_ratio));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

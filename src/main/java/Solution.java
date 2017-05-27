/**
 * @Author John Antonio Collins
 * Created on 5/26/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //MY CODE START
        /*MY PLAN: I'm going to use a 1d array and do math in my code instead of a 2d array for efficiency.
        The constraints are fine for using a 2d array but I want to make something extensible for very large
        matricies. (I'm basing this efficiency gain on something I read, if I'm wrong let me know!)
        */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] matrix = new int[n*n];
        for (int i = 0; i < n*n; i++)
        {
            matrix[i] = scan.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 += matrix[(n*i)+i];
            sum2 += matrix[(n*i)+(n-i-1)];
        }
        int result = Math.abs(sum1-sum2);
        System.out.println(result);
        //MY CODE END

    }
}
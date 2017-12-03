import java.util.Stack;

/**
 * Created by Viral on 12/3/2017.
 * Leetcode: 739. Daily Temperatures
 */
public class dailyTemperature {
    public static void main(String args[]) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        for(int x : findDailyTemperature(temperatures)) {
            System.out.println(x);
        }
    }

    private static int[] findDailyTemperature(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[temperatures.length];
        int a[] = temperatures;
        for(int index = a.length-1; index >= 0; index--) {
            while(!stack.isEmpty() && a[stack.peek()] <= a[index]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                res[index] = stack.peek() - index;
            } else {
                res[index] = 0;
            }
            stack.push(index);
        }
        return res;
    }
}

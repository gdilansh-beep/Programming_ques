
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int curr : asteroids) {
            if (curr > 0) {
                st.push(curr);
            } else {
                while (!st.isEmpty() && st.peek() > 0
                        && st.peek() < Math.abs(curr)) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() > 0
                        && st.peek() == Math.abs(curr)) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(curr);
                }
            }
        }

        int[] res = new int[st.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = st.get(i);
        }

        return res;
    }
}

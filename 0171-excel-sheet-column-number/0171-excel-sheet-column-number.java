class Solution {
    public int titleToNumber(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int x = 0;

            switch (s.charAt(i)) {
                case 'A':
                    x = 1;
                    break;
                case 'B':
                    x = 2;
                    break;
                case 'C':
                    x = 3;
                    break;
                case 'D':
                    x = 4;
                    break;
                case 'E':
                    x = 5;
                    break;
                case 'F':
                    x = 6;
                    break;
                case 'G':
                    x = 7;
                    break;
                case 'H':
                    x = 8;
                    break;
                case 'I':
                    x = 9;
                    break;
                case 'J':
                    x = 10;
                    break;
                case 'K':
                    x = 11;
                    break;
                case 'L':
                    x = 12;
                    break;
                case 'M':
                    x = 13;
                    break;
                case 'N':
                    x = 14;
                    break;
                case 'O':
                    x = 15;
                    break;
                case 'P':
                    x = 16;
                    break;
                case 'Q':
                    x = 17;
                    break;
                case 'R':
                    x = 18;
                    break;
                case 'S':
                    x = 19;
                    break;
                case 'T':
                    x = 20;
                    break;
                case 'U':
                    x = 21;
                    break;
                case 'V':
                    x = 22;
                    break;
                case 'W':
                    x = 23;
                    break;
                case 'X':
                    x = 24;
                    break;
                case 'Y':
                    x = 25;
                    break;
                case 'Z':
                    x = 26;
                    break;
            }

            ans = ans * 26 + x;
        }

        return ans;
    }
}
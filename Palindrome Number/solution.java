1class Solution {
2    public static boolean checkpalindrome(String num){
3        int left = 0;
4        int right = num.length()-1;
5        while(left < right){
6            if(num.charAt(left) != num.charAt(right)){
7                return false;
8            }
9            left++;
10            right--;
11        }
12        return true;
13    }
14    public boolean isPalindrome(int x) {
15        if(x < 0){
16            return false;
17        }
18        String num = x + "";
19        return checkpalindrome(num);
20        
21    }
22}
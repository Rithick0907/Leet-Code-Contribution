class Solution {
    public boolean isPalindrome(int number) {
        if(number < 0)  return false;
        int temp = number;
        int reversedNumber = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }
        return (number - reversedNumber) == 0 ? true : false;
    }
}
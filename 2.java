// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	final static int digit = 5;

	public int solution(int N) {
		// write your code in Java SE 8
		if(N < 0) {
			// Put 5 infront, but only after integers smaller than it
			N = insertDigit(N, false);
		} else {
			// Put 5 infront, but only after integers larger than it
			N = insertDigit(N, true);
		}

		return N;
	}

	public static int insertDigit(int N, boolean isPositive) {
		String num = Integer.toString(N);
		String newNum = "";
		boolean inserted = false;

		// Iterate all integer 1 by 1
		for (char singleInt : num.toCharArray()) {
			// If char is - or
			// If digit 5 already inserted or
			// If N is positive and current char is larger than digit 5 or
			// If N is negative and current char is smaller than digit 5
			// THEN insert character to new string and skip inserting digit 5 to the new string
			if (singleInt == '-' || inserted ||
					(isPositive && Integer.parseInt(String.valueOf(singleInt)) > digit) ||
					(!isPositive && Integer.parseInt(String.valueOf(singleInt)) < digit)) {

				newNum += singleInt;
				continue;
			}

			// Add the digit 5 and the current iterated number to the new string
			newNum += Integer.toString(digit);
			newNum += singleInt;
			inserted = true;
		}

		if (!inserted) {
			newNum += Integer.toString(digit);
		}

		return Integer.parseInt(newNum);
	}
}

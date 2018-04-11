/*--------------------------------------------------------------------------------------*/
/*  GCD.java  -  GCD 101                                                                */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:  Kshitij Shah                                                               */
/*  Date:    March 8 2017                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:   two ints                                                                   */
/*  Output:  what GCD of 2 ints is                                                      */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class GCD {

    static int findGCD (int a, int b, int c) {
	if (c == 1) {
	    return 1;
	} else if (a == 0) {
	    return b;
	} else if (b == 0) {
	    return a;
	} else if ((a % c == 0) && (b % c == 0)) {
	    return c;
	} else {
	    int d;
	    return d = findGCD (a,b, c - 1);
	}
    }

    public static void main (String str[]) throws IOException {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	
	System.out.println("GCD FINDER!\n");
	System.out.print("What is the first number?:  ");
	int a = Integer.parseInt (stdin.readLine ());
	System.out.print("What is the second number?:  ");
	int b = Integer.parseInt (stdin.readLine ());
	int c;
	if (a > b) {
	    c = b;
	} else {
	    c = a;
	}
	int gcd = findGCD(a, b, c);
	System.out.println("The GCD is " + gcd);
    }
}


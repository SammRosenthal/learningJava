package com.samrosenthal;

public class Main {

//    Create a for statement using any range of numbers
//    Determine if the number is a prime number using the isPrime method
//    if it is a prime number, print it out AND increment a count of the
//    number of prime numbers found
//    if that count is 3 exit the for loop
//    hint: use the break; statement to exit

    public static void main(String[] args) {
        int primeNumbersFound = 0;
	    for (int i = 0; i < 10; i++) {
	        if (isPrime(i)) {
                System.out.println(i);
                primeNumbersFound++;
            }

	        if (primeNumbersFound == 3) {
	            break;
            }
        }
    }

    public static boolean isPrime(int n) {
         if (n == 1) {
             return false;
         }

         for (int i=2; i <= n/2; i++) {
             if(n % i == 0){
                 return false;
             }
         }

         return true;
    }

}

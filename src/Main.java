import java.util.Scanner;



            public static void main(String[] args) {

                Scanner scnr = new Scanner(System.in);
                System.out.println("Enter n: ");
                int n = scnr.nextInt();
                scnr.close();

                //Create instance of the SinglyLinkedList class to store prime numbers with three digits
                SinglyLinkedList primeList = new SinglyLinkedList();
                SinglyLinkedList digitThreeList = new SinglyLinkedList();

                //Create loop for numbers 0 to n
                for (int i =0; i <= n; i++) {
                    if (PrimeNumbers.isPrime(i)) {  //check if number is prime
                        primeList.addprime(i);      //add to the primeList
                        if (PrimeNumbers.threeDigits(i)) {  //check if numbers has three digits
                            digitThreeList.addprime(i);
                        }
                    }
                }

                int sum = digitThreeList.sumOfPrimes();  //Create sum

                System.out.println(sum);     //print

            }







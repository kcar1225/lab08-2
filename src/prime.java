public class prime {  //Create class to store prime numbers

    int num;
    prime next;

    prime(int num) {  //constructor initialize prime number
        this.num = num;
        this.next = null;   //set valur to null
    }
}

class  SinglyLinkedList {
    prime head;

    SinglyLinkedList() {
        this.head = null;     //Starts the singlylist empty
    }

    void addprime(int num) {   //method created to add prime number to the list
        prime newPrime = new prime(num);
        if (head == null) {
            head = newPrime;   //set the head as new node if list is empty
        } else {
            prime temp = head;
            while (temp.next != null) {  //create new node if the list is not empty
                temp = temp.next; // move to the next node
            }
            temp.next = newPrime;
        }
    }

    int sumOfPrimes() {   //method to calculate the sum of all primes in the list
        int sum = 0;
        prime current = head;
        while (current != null) {  //iterates each node and add it numbers to the sum
            sum += current.num;
            current = current.next; //move to next node
        }
        return sum; //return sum of primes numbers
    }
}


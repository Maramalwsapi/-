import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        //1:
        System.out.println("Hello World");
        //2:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //3:
        //	int numbers[]={1 ,2 ,3 ,4 ,5};
        //      for(int i=0 ;i<numbers.length ; i++){
        //          System.out.println(numbers[i]);
        //
        //      }
        //4:
        int numbers [] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        //5:
        int num[] = {1, 2, 3, 4, 5};
        print(num);
        input(num);
        print(num);
    }

    public static void print(int arr[]) {}
    public static void input(int arr[]) {
        Scanner input =new  Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();

        }
        //6:
        int num[] = {1, 2, 3, 4, 5 , 6};
        print(num);
        input(num);
        print(num);
    }

    public static void print(int arr[]) {}
    public static void input(int arr[]) {
        Scanner input =new  Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();

        }
        //Student:
        private String name;
        private int age;

    public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        //  @Override
        public String tostring() {
            return "Student{" + "name=" + name + '\'' + '}';
        }

        public static void main(String[] args) {
            Student [] students = new Student[3];
            students [0] = new Student("Maram" , 19);
            students [1] = new Student("Maryam" , 19);
            students [2] = new Student("Aya" , 19);

            for (int i = 0; i < students.length; i++) {
                System.out.println("name student:" + students[i].getName());
                System.out.println("age student:" + students[i].getAge());

                System.out.println();
            }
        //1.1:
            Scanner scanner = new Scanner(System.in);

            // Input for different base types
            System.out.print("Enter an integer: ");
            int intValue = scanner.nextInt();
            System.out.println("Integer value: " + intValue);

            System.out.print("Enter a double: ");
            double doubleValue = scanner.nextDouble();
            System.out.println("Double value: " + doubleValue);

            System.out.print("Enter a float: ");
            float floatValue = scanner.nextFloat();
            System.out.println("Float value: " + floatValue);

            System.out.print("Enter a long: ");
            long longValue = scanner.nextLong();
            System.out.println("Long value: " + longValue);

            System.out.print("Enter a short: ");
            short shortValue = scanner.nextShort();
            System.out.println("Short value: " + shortValue);

            System.out.print("Enter a byte: ");
            byte byteValue = scanner.nextByte();
            System.out.println("Byte value: " + byteValue);

            System.out.print("Enter a character: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("Char value: " + charValue);

            // Close the scanner to prevent resource leaks
            scanner.close();
        }

        public static void main(String[] args) {
            inputAllBaseTypes();
        }

        //1.2:
        int score;

    public 1.2(int score) {
            this.score = score;
        }

        public static void main(String[] args) {
            // Creating an array A of GameEntry objects
            GameEntry[] A = new GameEntry[10];

            // Initializing the array A with GameEntry objects
            for (int i = 0; i < A.length; i++) {
                A[i] = new GameEntry(i * 100);  // Initialize scores as multiples of 100 for simplicity
            }

            // Creating an array B and immediately setting it to reference array A
            GameEntry[] B = A;

            // Changing the score value of A[4]
            A[4].score = 550;

            // Now, both A[4] and B[4] reference the same GameEntry object in memory
            System.out.println("Score of A[4]: " + A[4].score);
            System.out.println("Score of B[4]: " + B[4].score);
        }
    }

    //1.3:
    public static boolean isMultiple(long n, long m) {
        // Check if n is a multiple of m
        return n % m == 0;
    }

    public static void main(String[] args) {
        // Example usage
        long n = 40;
        long m = 10;

        if (isMultiple(n, m)) {
            System.out.println(n + " is a multiple of " + m);
        } else {
            System.out.println(n + " is not a multiple of " + m);
        }

        //1.4:
        int number = 6;
        System.out.println(number + " is even: " + isEven(number));

        int anotherNumber = 7;
        System.out.println(anotherNumber + " is even: " + isEven(anotherNumber));
    }

    // Method to check if a number is even without using multiplication, modulus, or division
    private static boolean isEven(int i) {
        // Using bitwise AND operation to check the least significant bit
        // An even number has the least significant bit as 0 in binary representation
        // If i & 1 equals 0, then i is even
        return (i & 1) == 0;
    }

        //1.5
        int n = 5;
            System.out.println("Sum of positive integers less than or equal to " + n + ": " + sumOfPositiveIntegers(n));

    int anotherN = 10;
            System.out.println("Sum of positive integers less than or equal to " + anotherN + ": " + sumOfPositiveIntegers(anotherN));
}

    // Method to calculate the sum of positive integers less than or equal to n
    private static int sumOfPositiveIntegers(int n) {
        // Ensure n is non-negative
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // Initialize the sum
        int sum = 0;

        // Iterate from 1 to n and add each number to the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }


        //1.6:
        int n = 5;
        System.out.println("Sum of positive odd integers less than or equal to " + n + ": " + sumOfOddIntegers(n));

                int anotherN = 10;
                System.out.println("Sum of positive odd integers less than or equal to " + anotherN + ": " + sumOfOddIntegers(anotherN));
                }

// Method to calculate the sum of positive odd integers less than or equal to n
private static int sumOfOddIntegers(int n) {
        // Ensure n is non-negative
        if (n < 0) {
        throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // Initialize the sum
        int sum = 0;

        // Iterate from 1 to n and add each odd number to the sum
        for (int i = 1; i <= n; i += 2) {
        sum += i;
        }

        return sum;
        }


        //1.7:
        int n = 5;
        System.out.println("Sum of the sequence of positive integers up to " + n + ": " + sumOfSequence(n));

        int anotherN = 10;
        System.out.println("Sum of the sequence of positive integers up to " + anotherN + ": " + sumOfSequence(anotherN));
        }

// Method to calculate the sum of the sequence of positive integers up to n
private static int sumOfSequence(int n) {
        // Ensure n is non-negative
        if (n < 0) {
        throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // Calculate the sum using the formula for the sum of the first n natural numbers
        return (n * (n + 1)) / 2;
        }

        //1.8:

public static void main(String[] args) {
        String inputString = "Hello, World!";
        System.out.println("Number of vowels in the string: " + countVowels(inputString));
        }

// Method to count the number of vowels in a given string
private static int countVowels(String str) {
        // Ensure the input string is not null
        if (str == null) {
        throw new IllegalArgumentException("Input string cannot be null");
        }

        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Initialize the count of vowels
        int vowelCount = 0;

        // Iterate through each character in the string and check if it is a vowel
        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
        }
        }

        return vowelCount;
        }


        //1.9:
        String inputString = "Let's try, Mike!";
        String result = removePunctuation(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String without punctuation: " + result);
        }

// Method to remove punctuation from a given string using StringBuilder
private static String removePunctuation(String str) {
        // Ensure the input string is not null
        if (str == null) {
        throw new IllegalArgumentException("Input string cannot be null");
        }

        // Create a StringBuilder instance to build the modified string
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        // Check if the character is an alphabetic character or a space
        if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
        // Append alphabetic characters and spaces to the StringBuilder
        resultBuilder.append(ch);
        }
        }

        // Convert the StringBuilder to a String and return the result
        return resultBuilder.toString();
        }



        //1.10:
        String name;
        int pettle;
        float priece;

public q9(String name, int pettle, float priece) {
        this.name = name;
        this.pettle = pettle;
        this.priece = priece;
        }

public String getName() {
        return this.name;
        }

public void setName(String name) {
        this.name = name;
        }

public int getPettle() {
        return this.pettle;
        }

public void setPettle(int pettle) {
        this.pettle = pettle;
        }

public float getPriece() {
        return this.priece;
        }

public void setPriece(float priece) {
        this.priece = priece;
        }

public String toString() {
        return "Flower{name='" + this.name + "', pettle=" + this.pettle + ", priece=" + this.priece + "}";
        }
        }

        //1.11:
private String cardNumber;
private String cardHolder;
private double balance;
private double creditLimit;

// Constructor
public CreditCard(String cardNumber, String cardHolder, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.balance = 0.0;  // Initial balance is zero
        this.creditLimit = creditLimit;
        }

// Method to make a purchase
public void makePurchase(double amount) {
        if (amount < 0) {
        throw new IllegalArgumentException("Amount must be a positive value");
        }

        if (balance + amount > creditLimit) {
        throw new IllegalStateException("Exceeded credit limit");
        }

        balance += amount;
        }

// Method to make a payment
public void makePayment(double amount) {
        if (amount < 0) {
        throw new IllegalArgumentException("Payment amount must be a positive value");
        }

        balance -= amount;
        }

// Method to get the current balance
public double getBalance() {
        return balance;
        }

// Method to update the credit limit
public void updateCreditLimit(double newCreditLimit) {
        if (newCreditLimit < 0) {
        throw new IllegalArgumentException("Credit limit must be a non-negative value");
        }

        creditLimit = newCreditLimit;
        }

// Other getter methods for card information
public String getCardNumber() {
        return cardNumber;
        }

public String getCardHolder() {
        return cardHolder;
        }

public double getCreditLimit() {
        return creditLimit;
        }
}


        //1.13:
        Public static void public static void main(String[]args){
       Random rand = new Random();
       int randomInt = rand.nextInt(3) + 1;

        System.out.println("Credit card number" + rendamInt + "will attempt to go over its credit limit");
        }
}


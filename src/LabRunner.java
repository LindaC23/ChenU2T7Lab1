import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        String firstHalf = "";
        String secondHalf = "";
        if ((str1.length() % 2) == 0){
            firstHalf = str1.substring(0,(str1.length()/2));
            secondHalf = str1.substring(str1.length()/2);
        } else {
            firstHalf = str1.substring(0,str1.length()/2);
            secondHalf = str1.substring(str1.length()/2);
        }

        System.out.println("String length: " + str1.length());
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() != str2.length()){
            if (str1.length() > str2.length()){
                System.out.println(str1 + " is longer");
            } else {
                System.out.println(str2 + " is longer");
            }
        } else {
            System.out.println("Both strings have the same length");
        }

        if (str1.equals(str2)){
            System.out.println("Both strings have the exact same characters");
        } else {
            if (str1.compareTo(str2) < 0){
                System.out.println(str2 + " is first alphabetically");
            } else {
                System.out.println(str1 + " is first alphabetically");
            }
        }


        if (str1.indexOf(str2) != -1){
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is NOT found in " + str1);
        }
    }
}

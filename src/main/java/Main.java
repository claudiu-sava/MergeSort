import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please add some numbers separated by a space: ");
        Scanner cmdScanner = new Scanner(System.in);

        String userAnswer = cmdScanner.nextLine();
        if (userAnswer.matches(".*[a-z].*") || userAnswer.matches(".*[A-Z].*")){
            System.out.println("NUMBERS. It isn't that hard. Try again and write NUMBERS. ");
            return;
        }

        String[] numbersToSortAsString = userAnswer.split("\\s+");
        int numberOfNumbers = numbersToSortAsString.length;
        int[] numbersToSortArray = new int[numberOfNumbers];

        for (int x = 0; x < numberOfNumbers; x ++){
            numbersToSortArray[x] = Integer.parseInt(numbersToSortAsString[x]);
        }

        System.out.println("Your chosen numbers are:");
        for (int num : numbersToSortArray){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        Mergesort.mergeSort(numbersToSortArray);

        System.out.println("Your sorted list: ");
        for (int num : numbersToSortArray) {
            System.out.print(num + " ");
        }
    }

}

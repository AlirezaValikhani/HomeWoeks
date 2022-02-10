package exerciseThree;

import java.util.*;

public class SuitableOrderedPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.print("How many numbers do you enter : ");
        Integer input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Enter your numbers : ");
            Integer inputNumbers = scanner.nextInt();
            Collections.addAll(numbersList, inputNumbers);
        }


        System.out.println("Your number list is : " + numbersList);
        yeChizi(numbersList);
        /*if (numbersList.size() % 2 == 0) {
            orderedPaidForEvenNumber(numbersList);
        } else {
            orderedPaidForOddNumber(numbersList);
        }*/
    }

    /*public static void orderedPaidForEvenNumber(ArrayList<Integer> numbersList){
            for (int i = 0; i < numbersList.size() - 2; i = i + 2) {
                if (numbersList.get(i) > numbersList.get(i + 1)) {
                    numbersList.remove(i);
                    numbersList.remove(i + 1);
                } else if (numbersList.get(i) < numbersList.get(i + 1) ||
                        numbersList.get(i).equals(numbersList.get(i + 1))) {
                    System.out.print(numbersList.get(i) + " ,");
                    System.out.print(numbersList.get(i + 1) + " ,");
                }
            }
        }

    public static void orderedPaidForOddNumber(ArrayList<Integer> numbersList){
        orderedPaidForEvenNumber(numbersList);
        numbersList.remove(numbersList.size() - 1);
    }*/

    public static void yeChizi(ArrayList<Integer> numbers) {
        ArrayList<Integer> temp = new ArrayList<>();
        Iterator<Integer> t = numbers.iterator();
        while (t.hasNext()) {
            try {
                Integer fNumber = t.next();
                Integer sNumber = t.next();
                if (fNumber < sNumber) {
                    temp.add(fNumber);
                    temp.add(sNumber);
                }
            }
            catch (NoSuchElementException e ){
                System.out.print("");
            }
        }
        System.out.println(temp);
    }
}


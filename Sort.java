import java.util.*;

public class Sort {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<>(100);

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randNum = rand.nextInt(100);
            intArrayList.add(randNum);
        }

        // System.out.println(intArrayList);

        // // sorting smallest to largest
        // during the first iteration, the outer for loop will loop through the first position and the innner for loop to the second position that we are comparing. for example during the first iteration i would be position 0 and j would be position 1. the 
        for (int i = 0; i < intArrayList.size() - 1; i++) {
            for (int j = i + 1; j < intArrayList.size(); j++) {
                if (intArrayList.get(i) > intArrayList.get(j)) {
                    int temp = intArrayList.get(i);
                    intArrayList.set(i, intArrayList.get(j));
                    intArrayList.set(j, temp);
                }
            }
        }

        System.out.println("Sorted smallest to largest:\n " + intArrayList);

        // sorting largest to smallest
        for (int i = 0; i < intArrayList.size() - 1; i++) {
            for (int j = i + 1; j < intArrayList.size(); j++) {
                if (intArrayList.get(i) < intArrayList.get(j)) {
                    int temp = intArrayList.get(i);
                    intArrayList.set(i, intArrayList.get(j));
                    intArrayList.set(j, temp);
                }
            }
        }

        System.out.println("Sort largest to smallest:\n" + intArrayList);

    }
}
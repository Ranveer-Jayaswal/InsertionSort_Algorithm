import java.util.ArrayList;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int size = 10000;
        ArrayList<Integer> list = new ArrayList<>(size);
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }


        long startTime = System.currentTimeMillis();
        int iterations = sort(list);
        long endTime = System.currentTimeMillis();

        System.out.println("Number of iterations: " + iterations);
        System.out.println("Runtime: " + (endTime - startTime) + " milliseconds");
    }

    public static int sort(ArrayList<Integer> list) {
        int iterations = 0;
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
                iterations++;
            }
            list.set(j + 1, key);
            iterations++;
        }
        return iterations;
    }
}

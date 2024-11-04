import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.PriorityQueue;

public class PriorityQueueLab {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("RandIntegers.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
   
        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>();

        while (scanner.hasNextInt()) {  // avoids NoSuchElementException if file is empty by using while lopo
            sortedQueue.add(scanner.nextInt());
        }
        
        int end = sortedQueue.size();
        for (int i = 0; i < end; i++) {  // avoids empty queue exception if size is 0
            System.out.println(sortedQueue.remove());
        }
        scanner.close();
    }
}
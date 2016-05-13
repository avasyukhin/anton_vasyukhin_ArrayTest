package Lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Aphex on 12.05.2016.
 */
public class ArrayTest {
    public static  void main(String[] args){
        Random generator = new Random();
        final int TEST_VALUE =1000000;
        long start_time;
        long end_time;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            arrayList.add(generator.nextInt(20));
        }
        end_time = System.nanoTime();
        System.out.println("Sequential addition (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            linkedList.add(generator.nextInt(20));
        }
        end_time = System.nanoTime();
        System.out.println("Sequential addition (linked) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            arrayList.add(i,generator.nextInt(20));
        }
        end_time = System.nanoTime();
        System.out.println("Random addition (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            linkedList.add(i,generator.nextInt(20));
        }
        end_time = System.nanoTime();
        System.out.println("Random addition (linked) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE;i++){
            arrayList.get(i);
        }
        end_time = System.nanoTime();
        System.out.println("Random get (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE;i++){
            linkedList.get(i);
        }
        end_time = System.nanoTime();
        System.out.println("Random get (linked) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int x: arrayList){}
        end_time = System.nanoTime();
        System.out.println("Iterator (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int x: linkedList){}
        end_time = System.nanoTime();
        System.out.println("Iterator (linked) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        arrayList.sort(Comparator.<Integer>naturalOrder());
        end_time = System.nanoTime();
        System.out.println("Sort (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        linkedList.sort(Comparator.<Integer>naturalOrder());
        end_time = System.nanoTime();
        System.out.println("Sort (linked) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            arrayList.remove(i);
        }
        end_time = System.nanoTime();
        System.out.println("Random remove (array) "+(end_time - start_time)/1e6);
        start_time = System.nanoTime();
        for (int i = 0; i<TEST_VALUE/2;i++){
            linkedList.remove(i);
        }
        end_time = System.nanoTime();
        System.out.println("Random remove (linked) "+(end_time - start_time)/1e6);
    }


}

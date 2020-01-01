/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author asuspc
 */
public class UnsafeArraylistExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(1);
        unsafeArrayList.add(1);

           //create a thread pool fo size 10
           
           ExecutorService executorService = Executors.newFixedThreadPool(10);
           
           //create a Runnable task that increments each element of the Arraylist by one 
           Runnable task = () ->{
             incrementArrayList(unsafeArrayList);  
           };
           // sublit the task to the executor service 100 times.
           //All the tasks will modify the Arraylist concurrently
           for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
           executorService.shutdown();
           executorService.awaitTermination(60, TimeUnit.SECONDS);
           
           System.out.println(unsafeArrayList);
    }
    // Incement all the values in the ArrayList by one

    private static void incrementArrayList(List<Integer> unsafeArrayList) {
        for (int i = 0; i < unsafeArrayList.size(); i++) {
            Integer value = unsafeArrayList.get(i);
            unsafeArrayList.set(i,value+1);
        }
    }
    
    

}

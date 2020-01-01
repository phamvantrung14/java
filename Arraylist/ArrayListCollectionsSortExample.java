/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author asuspc
 */
public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);
        
        System.out.println("Before : "+numbers);
        
        Collections.sort(numbers);
        System.out.println("After : "+numbers);
    }
}

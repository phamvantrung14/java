/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author asuspc
 */
public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);
        
        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext() ){
            Integer num = numbersIterator.next();
            if (num % 2 !=0) {
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}

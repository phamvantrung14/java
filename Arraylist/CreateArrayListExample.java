/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author asuspc
 */
public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        
        //adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
        
        //adding an element at a particular index in an ArrayList
        animals.add(2,"Elephant");
        System.out.println(animals);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asuspc
 */
public class searchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        
        //check if an ArrayList contains a given element
        
        System.out.println("Does names array cotain \"Bob\"? : "+names.contains("Bob"));
        
        //find the index of the first occurrence of an element in an ArrayList
        
        System.out.println("LastindexOf \"Steve\": "+names.lastIndexOf("John"));
        System.out.println("LsatIndexOf \"Nill\": "+names.lastIndexOf("Bill"));
    }
}

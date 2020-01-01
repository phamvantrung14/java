/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author asuspc
 */
public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");
        
        System.out.println("Names: "+names);
        
        //sort an ArrayList using sort() method. You must pass a Comarator the arraylist.sort() method.
                names.sort(new Comparator<String>(){
                    @Override
                    public int compare(String name1, String name2){
                        return  name1.compareTo(name2);
                    }
                });
                
                //the above sort() method call can also be written simply using lambda expression
                    names.sort(Comparator.naturalOrder());
                    System.out.println("Sorted Names : "+names);
    }       

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author asuspc
 */
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        
        System.out.println("Initial List: "+programmingLanguages);
        
        // remobe the element at index 5
        programmingLanguages.remove(5);
        System.out.println("After romove(5): "+programmingLanguages);
        
        //remove the first occureence of the given element from the ArrayList
        //(the remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After romove(\"Kotlin\"): "+programmingLanguages);
        
        //remove all the elements that exist in given collection
        List<String> scriptingLanguuages = new ArrayList<>();
       scriptingLanguuages.add("Python");
       scriptingLanguuages.add("Ruby");
       scriptingLanguuages.add("Perl");
       
       programmingLanguages.removeAll(scriptingLanguuages);
        System.out.println("After removeAll(ScriptingLanguages): "+programmingLanguages);
        
        programmingLanguages.removeIf(new Predicate<String>(){
           @Override
           public boolean test(String s){
               return  s.startsWith("C");
           }
        });
        
        /* the above removeIf() call also be written using lambda expression like this programmingLanguages.removeIf(s -> s.startsWith("C"))*/
        System.out.println("After Removing all elements that start with \"c\":"+programmingLanguages);
        
        //remove all elements fromthe Arraylist
        programmingLanguages.clear();
        System.out.println("After clear(): "+programmingLanguages);
    }
}

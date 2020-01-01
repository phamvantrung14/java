/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

}

/**
 *
 * @author asuspc
 */
public class ArrayListObjectSortExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));
        System.out.println("person List : "+people);
        
        //Sort People by their Age
        
        people.sort((person1, person2)->{
            return person1.getAge()-person2.getAge();
        });
        
        //A more concise way of writing the above sorting function
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Soeted Person list by Age : "+people);
        
        //You can also sort using Collections.sort() method by passing the custom Comparator
        
        Collections.sort(people,Comparator.comparing(Person::getName));
        System.out.println("Sorted Person list by Name : "+people);
    }
}

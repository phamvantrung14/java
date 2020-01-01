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
public class AccesElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        //check if an ArrayList is empty
        System.out.println("Is the TopCompanies list empty? : "+topCompanies.isEmpty());
        topCompanies.add("google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("facebook");
        
        //Find the size of an ArrayList
        
        System.out.println("Here are the top "+topCompanies.size()+"companies to the world");
        System.out.println(topCompanies);
        
        //Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);
        
        System.out.println("Best Company: "+bestCompany);
        System.out.println("Second Best Company: "+secondBestCompany);
        System.out.println("Last Company in the list: "+lastCompany);
        
        //Modify the element at a given index
        
        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: "+topCompanies);
    }
}

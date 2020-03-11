/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mark Evans
 */
public class MapPrac {

    public static void main(String[] args) {
        // create a map object that associates a String-type
        // key with a String type value
        HashMap<String, String> expedMap = new HashMap<>();
        expedMap.put("country", "Philippines");
        expedMap.put("field", "meet people");
        expedMap.put("language", "Filipino");
        expedMap.put("duration", "1 month");
        expedMap.put("risk", "criminal activity");
        expedMap.put("lodging", "Baracay Ocean Club");
        
        System.out.println("Map Status: "+ expedMap.isEmpty());
        System.out.println("Value of lodging key: " + expedMap.get("lodging"));
        System.out.println("Is there a k-v pair keyed to duration?: " + expedMap.containsKey("duration"));
        
        printMapContents(expedMap);
    } // close main
    
    // CODE TO INTERFACES!!! NOT TO CONCRETE CLASSES!!!!!
    public static void printMapContents(Map<String, String> mp) {
        System.out.println("******Printing Map*******");
        // step 1: make sure the map is not empty
        if(!mp.isEmpty()){
            // step 2: extract all the keys as a set (unordered)
            Set<String> keySet = mp.keySet();
            // now I have a set of values: "country", "duration"...
            // use the advanced for loop to iterate over elements
            for(String s: keySet){
                System.out.print("Key: " + s);
                System.out.print(" | ");
                System.out.println("Value: " + mp.get(s));
            } // close for
        } // close if
        
        
        // step 3: use the set of keys to look up their associated\
        // values for display.
        
    }
    
} // close MapPrac

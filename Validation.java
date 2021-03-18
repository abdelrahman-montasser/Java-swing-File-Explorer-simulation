/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gamal
 */
public class Validation {
    // Function to validate the username 
    public static boolean isValidUsername(String name) {

        // Regex to check valid username. 
        String regex = "^[a-zA-Z][A-Za-z0-9_]*$";

        // Compile the ReGex 
        Pattern p = Pattern.compile(regex);

        // If the username is empty 
        // return false 
        if (name == null) {
            return false;
        }

        // Pattern class contains matcher() method 
        // to find matching between given username 
        // and regular expression. 
        Matcher m = p.matcher(name);

        // Return if the username 
        // matched the ReGex 
        return m.matches();
    }
}

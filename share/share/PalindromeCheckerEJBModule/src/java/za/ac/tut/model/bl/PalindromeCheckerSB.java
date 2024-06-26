/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;

/**
 *
 * @author Student
 */
@Stateless
public class PalindromeCheckerSB implements PalindromeCheckerSBLocal {

    @Override
    public Boolean check(Integer num) {
        return isPalindrome(num);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Boolean isPalindrome(Integer num) {
        boolean outcome = false;
        
        Integer newNumber = determineReverseForm(num);
        
        if(newNumber.equals(num)){
            outcome = true;
        }
        
        return outcome;
    }

    @Override
    public Integer getReverseForm(Integer num) {
        return determineReverseForm(num);
    }

    private Integer determineReverseForm(Integer num) {
        Integer firstDigit, remainder, secondDigit, thirdDigit, newNumber;
        //123
        firstDigit = num/100;
        remainder = num%100;
        secondDigit = remainder / 10;
        thirdDigit = remainder % 10;
        
        newNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit * 1;  
        
        return newNumber;
    }
    
    
}

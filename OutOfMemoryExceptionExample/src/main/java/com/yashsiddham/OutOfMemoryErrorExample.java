package com.yashsiddham;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try{
            // Adding Strings to the ArrayList until it causes out of memory error...
            while(true){
                // Can probably add 1000 entries on every iteration, but in that case
                // program throws error, even when the OutOfMemoryError should be caught...
                list.add("Trying to cause an out of memory error");
            }

        } catch (OutOfMemoryError e){
            System.out.println("OutOfMemoryError occured: " + e.getMessage());
        }
    }
}
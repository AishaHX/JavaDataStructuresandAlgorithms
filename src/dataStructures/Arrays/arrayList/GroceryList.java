package dataStructures.Arrays.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    // arraylist can hold an object
    // arrayList is a calss and has it's own constructure
    private ArrayList <String> groceryList = new ArrayList<>();

    // method adds to the grocery List
    public void addGroceryList(String item){
        // calling method to add items into array list
        groceryList.add(item);
    } // end addGroceryList

// Method that prints the items in the list
    public void printGroceryList(){
        // returning how many elements are in the arrayList
        System.out.println("I have " + groceryList.size() + "items in my grocery list");
        // looping too through to output every element
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " ." + groceryList.get(i));

        }
    } // End printGroceryList

    // Modifying the list
    public void modifyGroceryList (int position , String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position) + " has been modified.");
    } // end modifyGriceryList

    //removing item from the list
    public void removeGroceryItem (int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }// end removeGroceryItem

    // Find Items

    public String findItem (String searchItem){
       // boolean exists = groceryList.contains(seachItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0 ){
            return groceryList.get(position);
        } // end if

        return null;

    } //END findItem




}

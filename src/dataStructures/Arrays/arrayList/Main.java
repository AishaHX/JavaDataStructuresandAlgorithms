package dataStructures.Arrays.arrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        /* is resizable array
        * */

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter youre choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5 :
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;


            } // end switch
        } // end while

    }
    // print instructions
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list og grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5- To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");

    } // printInstructions

    // Add item
    public static void addItem(){
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryList(scanner.nextLine());
    } // end addItem


    // modifyItem
    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        // using -1 (itemNumber-1) to get the exakt number : human cout to computer count
        groceryList.modifyGroceryList(itemNumber-1 , newItem);

    }//mofify


    // removeItem
    public static void removeItem (){
        System.out.println("Enter the position you want to remove : ");
        int itemPosition = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemPosition-1);
    } // end removeItem

    // searchForItem

    public static void searchForItem (){
        System.out.println("Enter the item you want to search : ");
        String searchItem = scanner.nextLine();
        scanner.nextLine();
        if (groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + "in our grocery List");
        } else {
            System.out.println(searchItem + "is not in the our grocery List");
        }// end if

    } // end searchForItem
}

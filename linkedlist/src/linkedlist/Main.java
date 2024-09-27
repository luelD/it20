package linkedlist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
		
		Linkedlist list = new Linkedlist();

        // Adding elements to the list
        System.out.println("Enter the list of elements: ");
        int number1 = wow.nextInt();
        int number2 = wow.nextInt();
        int number3 = wow.nextInt();
        int number4 = wow.nextInt();
        int number5 = wow.nextInt();
              
        list.add(number1);
        list.add(number2);
        list.add(number3);
        list.add(number4);
        list.add(number5);     
        
        System.out.println("Current Linked List: ");
        list.printList();
        
        //Delete  the elements
        System.out.println("Enter the number you want to delete: ");
        System.out.println();
        System.out.println("Deleting a number/numbers from the list...");
        System.out.println("Current Linked List:");
        int number6 = wow.nextInt();
        list.deleteByValue(number6);
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        System.out.println("Enter the first number you want to move/swap: ");
        int number7 = wow.nextInt();
        System.out.println("Enter the second number you want to move/swap: ");
        int number8 = wow.nextInt();
        list.moveNodePointer(number7, number8);
        list.printList();
	}
}
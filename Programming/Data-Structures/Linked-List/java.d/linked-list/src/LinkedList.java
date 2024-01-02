package main;

// import LinkedList.Singly;
// import LinkedList.Doubly;
// import LinkedList.Circular;
// import LinkedList.CircularDoubly;

import java.util.Scanner;

public class LinkedList { 


  public static void main(String[] args) {
    LinkedList.Init(); 
  }

  public static void Init() { 
    String[] list_types = new String[]{"Singly-Linked-List",
                            "Doubly-Linked-List", 
                            "Circular-Linked-List", 
                            "Circular-Doubly-Linked-List"};
    Scanner scanner = new Scanner(System.in);
    LinkedList.CLI(list_types, scanner);
  }

  public static String read_next_arg(Scanner scanner) { 
    String message = scanner.nextLine();
    return message;
  }

  public static void msg_out(String msg) { 
    System.out.println(msg);
  }
  
  // Linked List CLI 
  public static void CLI(String[] list_types, Scanner scanner) { 
    System.out.println("CLI Triggered");
    System.out.println("Which type of linked list would you like to implement?");
    for (int i = 0; i < list_types.length ; i++) { 
      System.out.printf("[ %d ] %s\n", i, list_types[i] );
    }
    switch(LinkedList.read_next_arg(scanner)) { 
      case("0"):
        LinkedList.msg_out(list_types[0]);
        break;
      case("1"):
        LinkedList.msg_out(list_types[1]);
        break;
      case("2"):
        LinkedList.msg_out(list_types[2]);
        break;
      case("3"):
        LinkedList.msg_out(list_types[3]);
        break;
      case("4"):
        LinkedList.msg_out(list_types[4]);
        break;
      default: 
        System.out.println("Try Again");
        LinkedList.CLI(list_types, scanner);
        break;
    }    
  }
    
  // public static void SinglyLinkedListInit() {}
  // public static void DoublyLinkedListInit() {}
  // public static void CircularLinkedListInit() {}
  // public static void DoublyCircularLinkedListInit() {} 
  
}

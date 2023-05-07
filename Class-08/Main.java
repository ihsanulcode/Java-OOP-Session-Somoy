import java.util.*;

public class Main {
	private static int index = 0;
	final static int size = 1000;
	private static Plant[] plants = new Plant[size];
	private static Scanner input = new Scanner(System.in);

	public static void add() { // add
		if (index >= size) {
			System.out.println("Array size exceeds!");
			return;
		}

        System.out.println("\n--- Enter Flower Details ---");
        System.out.print("Flower Name: ");
        String name = input.nextLine();
        System.out.print("Flower Color: ");
        String color = input.nextLine();
        System.out.print("Has Smell: ");
        boolean hasSmell = input.nextBoolean();
        System.out.print("Has Thorn: ");
        boolean hasThorn = input.nextBoolean();
        Plant p = new Flower(name,color,hasSmell,hasThorn);
        
		plants[index] = p;
		index++;
		System.out.println("Added!\n");
	}

	public static void remove() { // remove
		if (index > size)
			return;
		
		System.out.print("\nFlower Name: ");
		String n = input.nextLine();
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				for (int j = i; j < index - 1; j++)
					plants[j] = plants[j + 1];
				index--;
			}
		}
		System.out.println("Removed!\n");
	}

	public static Plant search() { // search
	    System.out.print("\nFlower Name: ");
		String n = input.nextLine();
		
		for (int i = 0; i < index; i++) {
			if (plants[i].getName().equals(n)) {
				return plants[i];
			}
		}
		return null;
	}

	public static void display() { // display
	System.out.println("\n--- Display Plants ---");
		for (int i = 0; i < index; i++)
			System.out.println(plants[i]);
		System.out.println();
	}

	public static void main(String[] args) { // main
	    int n = 0;
		
		while(true){
		    System.out.println("1. Add\n2. Remove\n3.Search\n4. Display\n5. Exit\n");
		    System.out.print("Enter your choice: ");
		    n = input.nextInt();
		    input.nextLine();
		    
		    switch(n){
		        case 1:
		            add();
		            break;
		        case 2:
		            remove();
		            break;
		        case 3:
		            Plant p = search();
		            if(p!=null) System.out.println("Found!\n"+p.toString()+"\n");
		            else System.out.println("Not Found!\n");
		            break;
		        case 4:
		            display();
		            break;
		        case 5:
		            System.out.println("\n--- System Exits ---\n");
		            System.exit(0);
		            break;
		        default:
		            System.out.println("Invalid option!\n");
		    }
		}

	}
}
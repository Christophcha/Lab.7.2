
public class Driver {

	public static void main(String[] args) {

		LinkedStack object2 = new LinkedStack();

		// LinkedStack
		object2.push(1);
		object2.push(7);
		object2.push(3);
		object2.push(4);
		object2.push(9);
		object2.push(2);

		System.out.println("Pushed " + object2.size() + " ints to LinkedStack");
		System.out.println(object2);
		
		object2.removeBottonHalf(); //removes bottom half of stack. 

		System.out.println("After removing bottom half of elements, we're left with: " + object2);

	}

}
/*
 * THIS IS THE METHOD I USED IN THE LinkedStack CLASS
 * 
public void removeBottonHalf() {

	LinkedNode current = front;

	for (int i = 0; i < count / 2 - 1; i++) {
		current = current.next;
	}
	current.next = null;
	count = count / 2 - 1;
	System.out.println();
}

Time complexity for this method is O(n).
*/

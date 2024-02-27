package exerciseFeb27;

/** A class representing a linked list. */
public class LinkedList {
	private Node head, tail;

	/** Constructor */
	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
	 * Insert a new node with the given element in front of the linked list
	 * @param elem value of the new node
	 */
	public void insertAtFront(int elem) {
		if (head == null) {
			head = tail = new Node(elem);
		}
		else {
			Node node = new Node(elem);
			node.setNext(head);
			head = node;
		}
	}

	/**
	 * Creates a new node with the given element and adds it to the back of the
	 * list
	 */
	public void append(int elem) {
		Node newNode = new Node(elem);
		if (tail != null) {
			tail.setNext(newNode);
			tail = newNode;
		} else {
			head = tail = newNode;
		}

	}

	/** Prints all the nodes in the link list */
	public void printNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getElem() + " ");
			current = current.next();
		}
		System.out.println();
	}


	/** Remove the node with the given element
	 *
	 * @param elem element
	 */
	public void removeElement(int elem) {
		// FILL IN CODE: Remove the node with the given elem

	}

	/**
	 * Return the element in the middle of the linked list
	 * @return value of the middle element
	 */
	public int findMiddleElement() {
		Node slow = head;
		Node fast = head;
		// FILL IN CODE: use fast and slow pointers to find the middle node

		return 0;
	}

	/**
	 * Find the value at the k-th node from the end
	 * @param k index of the node from the end of the list
	 * @return value of the node
	 */
	public int findKthFromEnd(int k) {
		// FILL IN CODE
		// Using two pointers, find the value in the k-th node from the end of the linked list

		return 0;
	}

	public static void main(String[] args) {
		LinkedList list2 = new LinkedList();
		list2.append(1);
		list2.append(7);
		list2.append(25);
		list2.append(50);
		list2.append(55);
		list2.append(5);
		list2.append(13);

		list2.printNodes();
		int midElement = list2.findMiddleElement();
		System.out.println(midElement);

		// TODO:
		// Call remove
		// Call findKthFromEnd
	}

}

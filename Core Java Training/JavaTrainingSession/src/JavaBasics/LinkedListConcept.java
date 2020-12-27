package JavaBasics;

import java.util.LinkedList;
/* Linked list is same like Array list but it has |Data -> Next| -> |Data -> Next|-> |Data -> Next| Model
 * 1. If linked list object reference variable is called out without any specified get method, it will list all the values stored in linked list object.
 */
public class LinkedListConcept {

	public static int i;
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("Tom");
		ll.add(20);
		ll.add(30.56);
		System.out.println("The LinkedList Table:"+ll);
		ll.addFirst("Mr.");
		ll.addLast('M');
		System.out.println("The LinkedList Table:"+ll);
		
		for(i=0; i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		
		
	}

}

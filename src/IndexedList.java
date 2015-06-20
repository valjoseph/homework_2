import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author Aaron Escoto - Val Joseph Argate - Tri Ninh
 *
 */

public class IndexedList implements List<Node> {
	
	private ArrayList<Node> elmnts;
	DoublyLinkedList doub;
	int k;

	public IndexedList(){
		elmnts = new ArrayList<>();
		doub = new DoublyLinkedList();
	}

	@Override
	public int size() {
		return doub.size();
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}
	
	@Override
	public void clear() {

	}
	@Override
	public boolean add(Node n){
		doub.add(n.data);
		return true;
	}
	/**
	public void add( int n, Node element) {
		if(first = null) {
			n = first;
		}
		else if{
			first
		}
		else{
			last.next = n;
			n = last;
		}
	}
	 */
	@Override
	public Node get(int index) {
		Node temp = null;
		return temp;
	}

	@Override
	public Node set(int index, Node element) {
		return null;
	}

	@Override
	public Node remove(int index) {
		return null;
	}


	/** Dummied out methods**/
	@Override
	public boolean isEmpty() {return false;}
	@Override
	public boolean contains(Object o) {return false;}
	@Override
	public Iterator<Node> iterator() {return null;}
	@Override
	public Object[] toArray() {return null;}
	@Override
	public <T> T[] toArray(T[] a) {return null;}
	@Override
	public boolean containsAll(Collection<?> c) {return false;}
	@Override
	public boolean addAll(Collection<? extends Node> c) {return false;}
	@Override
	public boolean addAll(int index, Collection<? extends Node> c) {return false;}
	@Override
	public boolean removeAll(Collection<?> c) {return false;}
	@Override
	public boolean retainAll(Collection<?> c) {return false;}
	@Override
	public int indexOf(Object o) {return 0;}
	@Override
	public int lastIndexOf(Object o) {return 0;}
	@Override
	public ListIterator<Node> listIterator() {return null;}
	@Override
	public ListIterator<Node> listIterator(int index) {
		return null;
	}
	@Override
	public List<Node> subList(int fromIndex, int toIndex) {
		return null;
	}
	@Override
	public void add( int n, Node element){}
}

import java.awt.*;

public class Node
{
	public Node previous;
	public Node next;
	public int data;
	
	public Node(int number)
	{
		//previous = new Node(previous.data);
		//next = new Node(next.data);
		//this.first = null;
		//this.last = null;
		previous = null;
		next = null;
		this.data = number;

	}

	public Node(Node previous, int number, Node next)
	{
		this.previous = previous;
		this.data = number;
		this.next = next;
	}

	// accessors and mutators
	public int getNumber(int number){return this.data;}
	public void setNumber(int number){this.data = number;}
	
}
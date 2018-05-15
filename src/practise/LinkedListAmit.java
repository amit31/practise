package practise;

import java.util.Stack;

public class LinkedListAmit <T>{
	
	Node head;
	Node head1=head;
	LinkedListAmit()
	{
		head =null;
	}
	
	
	public void add(Object value)
	{
		Node newNode = new Node( value,null);
		
		if(head==null)
		{
			head =newNode;
		}
		else {
			
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addatEnd(Object value)
	{
		Node tail = head;
		Node newNode = new Node( value,null);
		
		while(tail.next!=null)
		{
			tail = tail.next;
			
			
		}
		tail.next=newNode;
			
		
	}
		
	public void reverseAgain()
	{
		
		Node current = head;
		Node previous =null;
		Node next = null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
	    head=previous;
		
		
	}
	
	
	public void findMiddle()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		System.out.println("the mid value is "+slow.value);
	}
	
	public void reverseusingStack()
	{
		
		System.out.println("Reverse the LinkedList using stack");
		Node tail = head;
		
		Stack  <Object > s = new Stack<Object>();
		
		while(tail!=null) {
			s.push(tail.value);
			tail=tail.next;
		}
		
		while(!(s.isEmpty())){
			System.out.println(s.pop());
			
		}
		
	}
	
	
	
	public void reverse() {
		
		Node next = null;
		Node current=head;
	
		Node previous =null;
		while( current!=null){
			next=current.next;
			current.next=previous;
			previous = current;
            current = next;
		}
		
	head=previous;	
	}
	
	
	public void display()
	{
		Node n =head;
		while(n!=null)
		{
			System.out.println((T)n.value);
			n=n.next;
		}
		
	}

}

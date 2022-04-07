
public class linkedList 
{
	Node head;
	
public class Node //creating class node to describe the node characteristic
{
	int data;
	Node next;
}

public void insertdata(int num)//this method insert the value 
{
    Node node = new Node();
	node.data = num;
	node.next = null;
	if(head==null) // check the condition
	{
		head = node;
	}
	else
	{
		Node n = head;
		while(n.next!=null)
		{
			n = n.next;
		}
		n.next =  node;
	}
		
}
public void insertAtStarting(int num) //this method insert at the starting
{
	Node node = new Node();
	node.data = num;
	node.next = null;
	node.next = head;
	head = node;
}
	
public void insertAtindex(int index,int num)//this method insert at the specific index with specific data
{
	Node node = new Node();
	node.data = num;
	node.next = null;
		
	if(index==0)
	{
		insertAtStarting(num);
	}
	else{
	Node n = head;
	for(int i=0;i<index-1;i++)
	{
		n = n.next;
	}
	node.next = n.next;
	n.next = node;
	}
}
	
public void deleteAt(int index)//this method delete the value at the specified index
{
	System.out.println("delete the element ");
	if(index==0)
	{
		head = head.next;
	}
	else
	{
		Node n = head;
		Node n1 = null;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
			
		n1 = null;
	}
}
	
public void show()  //this method show the value
{
	System.out.println("show the element after some method");
	Node node = head;
		
	while(node.next!=null)
	{
		
		System.out.println(node.data);
		node = node.next;
	}
	System.out.println(node.data);
}

public static void main(String[] args) {
		
	linkedList good = new linkedList();
	good.insertdata(20);
	good.insertdata(30);
	good.insertdata(40);
	good.insertAtStarting(55);
		
	good.insertAtindex(0, 77);
	good.show();
	good.deleteAt(2);
		
	good.show();
}

}
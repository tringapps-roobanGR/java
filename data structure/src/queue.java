
public class queue {
	int arr[]=new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) //enqueue is to add the num to queue 
	{    
		System.out.println("Enqueue to add the element");
		arr[rear]=data;
		rear=rear+1;
		size =size+1;
	}
	
	public void show()//show is to show the num after performing method,when show is called 
	{           
		System.out.println("To show the the element");
		for (int i=0;i<size;i++) {
			System.out.println(arr[front+i]);
		}
	}
	
	public int dequeue() // dequeue is to delete the num from  queue 
	{               
		System.out.println("dequeue to delete the element");
		int data =arr[front];
		front =front+1;
		size=size-1;
		return data;
		
	}
	
	public static void main(String[]args)//creating object for the class to access the method
	{
		queue good =new queue();   
		good.enqueue(3);
		good.enqueue(5);
		good.enqueue(6);
		good.enqueue(7);
		good.enqueue(8);
		good.show();
		good.dequeue();
		good.show();
	}
	
}
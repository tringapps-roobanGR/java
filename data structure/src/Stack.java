
public class Stack {
	int arr[]=new int[3];
	int top=-1;                  //the stack uses LIFO method
	
	public void push(int num) {   //this method add the num into the stack
		if(top<3)
			arr[++top]=num;
	}
	
	public void pop() {            // this method delete the num from the stack 
		if(top>-1) {
			top--;
		}
			
	}
	public void display() {          // this method is used to display element after every method is called 
		System.out.println("---------");//when this method is called
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
			
	}
	void peek() {                     // this method is used to display the peek element
		System.out.println("this shows the peek element");
		int temp=arr[top];
		System.out.println(temp);
	}
	public static void main(String[]args) {
		Stack good =new Stack();
		good.push(3);                 //this is the first num
		good.push (4);
		good.push (5);                //this is the last num
		good.display();
		
		good.pop();                   //this removes the last num (5) 
		good.display();
		
		good.peek();                  //this display the next num to remove or in peek (4)
	}

}

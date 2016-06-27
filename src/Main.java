import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Press Enter key to stop the timer");
		Counter mom = new Counter();
		Thread th1=new Thread(mom);
		
		Counter1 child = new Counter1(th1);
		Thread th2=new Thread(child);
		
		th1.start();
		th2.start();
		String userinput="start";
		Scanner sc =new Scanner(System.in);
		while(!userinput.equals(""))
		{
			userinput=sc.nextLine();
				
		}
		mom.setWhoCalled(2);
	    th1.interrupt();
	    th2.interrupt();
	    
		sc.close();
	}

}


public class Counter1 implements Runnable{
	private int count=1;
	private Thread momRef;
	
	public Counter1(Thread momRef) {
		this.momRef = momRef;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(count<10000)
		{
			try {
				Thread.sleep(2000);
				System.out.println("Mom...");
				momRef.interrupt();
				
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			   break;
			}
			Thread mainthread = Thread.currentThread();
			
			System.out.println("Thread: "+mainthread.getName()+", Count: "+count);
			
			count++;
		}
		
		
	}

}

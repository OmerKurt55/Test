package thread;

public class SleepyThread extends Thread implements Runnable {
	
		private Thread partnerThread;
		private final CharSequence text;
		private final static int ROUNDS = 5;
		private final boolean first;
		
		SleepyThread(CharSequence text, boolean first) {
		this.text = text;
		this.first = first;
		}
		
		void setPartnerThread(Thread partnerThread) {
			this.partnerThread = partnerThread;
		}
		
		@Override
		public void run() {
		
			if(first) {
		System.out.println(this.text);
		}
			
		for(int i = 0; i < ROUNDS; i++) {
		
			try {
				
				this.partnerThread.interrupt();
		
				Thread.sleep(Integer.MAX_VALUE);
		
			} catch (InterruptedException ex) { }
		
			finally {
		
				System.out.println(this.text);
	}
}
		this.partnerThread.interrupt();
		
		
}
}
package deadLock;

public class ThreadB extends Thread {
	private Object lockA=null;
	private Object lockB=null;
	public ThreadB(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}
	@Override
	public void run() {
		synchronized(lockB){
			System.out.println("Thread B:       LockB");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lockA){
				System.out.println("Thread B:       LockA");
			}
		}
		System.out.println("Thread B:       Finished");
	}
}

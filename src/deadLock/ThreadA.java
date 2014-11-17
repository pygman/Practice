package deadLock;

public class ThreadA extends Thread {
	private Object lockA=null;
	private Object lockB=null;
	public ThreadA(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}
	@Override
	public void run() {
		synchronized(lockA){
			System.out.println("Thread A :       LockA");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lockB){
				System.out.println("Thread A :       LockB");
			}
		}
		System.out.println("Thread A :       Finished");
	}
}

package deadLock;

public class DeadLock {
	final static Object lockA=new Object();
	final static Object lockB=new Object();
	public static void main(String[] args) {
		ThreadA a=new ThreadA(lockA,lockB);
		ThreadB b=new ThreadB(lockA,lockB);
		a.start();
		b.start();
	}
}
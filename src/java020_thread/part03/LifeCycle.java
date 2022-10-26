package java020_thread.part03;

/*
 * 스레드 생명주기(Thread Life Cycle)
 * start() - 실행준비상태(RUNNABLE)- run() - TERMINATED
 *                             sleep(시간값), wait()-대기상태(WAITING)
 */

public class LifeCycle extends Thread{
	
	public LifeCycle() {
		
	}
	
	public void run() {
		System.out.println(getState());//RUNNABLE
	}

}

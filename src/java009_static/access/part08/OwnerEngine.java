package java009_static.access.part08;

public class OwnerEngine extends Car{
	private int seat;
	
	public OwnerEngine() {
		
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	void information() {
		System.out.println(seat+"인승 차량입니다.");
	}
	
//	@Override
//	public String toString() {
//		return String.format("차량의 색상:%s, 속도:%d", color, getSpeed());
//	}
}

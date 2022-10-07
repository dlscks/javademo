package java001_basic.prob;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
	  int num = 123;
	  int size = 10;
	  int basketNumber;
	  
	  basketNumber = num % size == 0 ? num / size : num / size + 1;
	  System.out.println("필요한 바구니의 수 : " + basketNumber);
	  
     
      
	}//end main()

}//end class















package java004_array;

public class Java044_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
		// int[][] num= {{1,2},{3,4},{5,6}};
		int[][] num = new int[][] {{1,2},{3,4},{5,6}};

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println("\n");
		}
		System.out.println("======================");
		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println("\n");
		}
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		System.out.println("======================");
		int row = 0;
		for (int col = 0; col < num[row].length; col++) {
			for (; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println("\n");
		}
		System.out.println("======================");
		
	}

}

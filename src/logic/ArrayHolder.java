package logic;

public class ArrayHolder{
		
	private static int [][] array;
	
	public ArrayHolder(){}
	
	public static int[][] getArray() {
		if (array==null){
			synchronized (ArrayHolder.class) {
				if (array==null){
				array=new int[][]{
					{0, 0, 0, 1, 0, 0},
					{0, 0, 1, 1, 0, 0},
					{0, 0, 0, 1, 0, 0}};
				}
			}
		}
		return array;
	}
	
}

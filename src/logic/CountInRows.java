package logic;

public class CountInRows implements MaxSequance{
	private int countOfSequence;
	private int array[][];
		
		
	public CountInRows() {
		super();
	}
	
	public CountInRows(int[][] array) {
		super();
		this.array = array;
	}

	public int[][] getArray() {
		return array;
	}

	public CountInRows setArray(int[][] array) {
		this.array = array;
		return this;
	}

	public int getCountOfSequence() {
		return countOfSequence;
	}

	@Override
	public int findMaxSiquenceOnLines() {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+"R ");
				if (array[i][j] == 1) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
			System.out.println();
			count = 0;
		}
		return maxCount;
	}

}
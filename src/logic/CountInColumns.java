package logic;

public class CountInColumns implements MaxSequance{
	private int countOfSequence;
	
	private int array[][];
		
	public CountInColumns() {
		super();
	}
	
	public int[][] getArray() {
		return array;
	}

	public CountInColumns setArray(int[][] array) {
		this.array = array;
		return this;
	}

	public CountInColumns(int[][] array) {
		this.array = array;
	}
	
	public int getCountOfSequence() {
		return countOfSequence;
	}

	@Override
	public int findMaxSiquenceOnLines() {
		int count = 0;
		int maxCount = 0;
		for (int j = 0; j < array[0].length; j++) {
			//System.out.println("ColumnClass");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j]+"C ");
				if (array[i][j] == 1) {
					count++;
				}
			}
			System.out.println();
			if (count > maxCount) {
				maxCount = count;
			}
			count = 0;
		}
		return maxCount;
	}
}

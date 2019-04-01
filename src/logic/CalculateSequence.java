package logic;

public class CalculateSequence {

	public int getLongestSequence(){
		MaxSequance c = new CountInColumns(ArrayHolder.getArray());
		MaxSequance r = new CountInRows(ArrayHolder.getArray());
		int rInt = r.findMaxSiquenceOnLines();
		int cInt = c.findMaxSiquenceOnLines();
				
		System.out.println("maximum sequence in row or column whatever is : "
				+ Math.max(rInt, cInt));
		return Math.max(rInt, cInt);
	}

}

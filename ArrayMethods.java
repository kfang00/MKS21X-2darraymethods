public class ArrayMethods {
	public static int rowSum(int[][] ary, int x){
		if ((x >= ary.length) || (x < 0)) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < ary[x].length; i++) {
			sum += ary[x][i];
		}
		return sum;
	}
 
	public static int columnSum(int[][] ary, int x){
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			if ((x >= ary[i].length) || (x < 0)) {
				sum += 0;
			}
			else {
				sum += ary[i][x];
			}
		}
	}

	public static int[] allRowSums(int[][] ary){
		int[] array = new int[ary.length];
		for (int i = 0; i < ary.length; i++) {
			array[i] = rowSum(int[][] ary, int i);
		}
		return array;
	}

	public static int[] allColSums(int[][] ary){
		int size = 0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].length > size) {
				size = ary[i].length;
			}
		}
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = columnSum(int[][] ary, int i);
		}
		return array;
	}

	public static boolean isRowMagic(int[][] ary){
		int[] array = allRowSums(int[][] ary);
		int ref = 0;
		for (int i = 0; (i + 1) < array.length; i++) {
			if (array[i] != array[i + 1]) {
				return false;
			}
		}
		return true;
	}







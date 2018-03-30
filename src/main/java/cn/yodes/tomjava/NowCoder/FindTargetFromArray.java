package cn.yodes.tomjava.NowCoder;

public class FindTargetFromArray {
	public boolean Find(int target, int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
				if ((array[i][0] <= target) && (array[i][array.length - 1] >= target)) {
					for(int j = 0; j < array.length; j++){
						if(array[i][j] == target)	return true;
					}
				}
		}
		return false;
	}

	public static void main(String[] args) {
		int target = 7;
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(new FindTargetFromArray().Find(target, array));
		;
	}
}

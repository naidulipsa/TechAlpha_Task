package Task1;

public class RemoveDuplicateArray {

	public static int removeDuplicates(int ar[]) {
		int rd=0;
		for (int i = 1; i < ar.length; i++) {
			if(ar[rd]!=ar[i]) {
				rd++;
				ar[rd]=ar[i];
			}
		}
        return  rd+1;

	}
	public static void main(String[] args) {
		int ar[]= {1,2,2,3,3,4,5};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

		int rd=removeDuplicates(ar);
		System.out.println();

		for (int i = 0; i < rd; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}

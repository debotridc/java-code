import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList anacheck(String[] input) {
		ArrayList ar = new ArrayList();
		ArrayList al = new ArrayList();
		int i = 0, j = 0;

		String a[] = new String[input.length];
		for (i = 0; i < input.length; i++) {
			char temp[] = input[i].toCharArray();
			Arrays.sort(temp);
			a[i] = new String(temp);
			// System.out.println(a[i]);
		}

		for (i = 0; i < input.length; i++) {
			for (j = i + 1; j < input.length; j++) {
				if (a[i].equals(a[j])) {
					ar.add('[');
					ar.add(i+1);
					ar.add(j+1);
					ar.add(']');
				}

			}
		}

		al.addAll(ar);
		return al;

	}
	
	public static void main(String args[]) {
		String[] in= {"abcd","god","dog","cdba","gfgh"};
		System.out.println(anacheck(in));
	}
}

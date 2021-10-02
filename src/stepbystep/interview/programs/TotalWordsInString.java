package stepbystep.interview.programs;

public class TotalWordsInString {

	// String Variable
	private static String str = "Step By Step";
	private static int count = 1;
	private static boolean flag = false;

	public static void main(String args[]) {
		for (int i = 0; i <= str.length() - 1; i++) {			
			if (str.length() == 0) {
				flag = true;
				break;
			} else if ((str.length() == 1) && (str.charAt(i) == ' ')) {
				flag = true;
				break;
			} else if ((str.charAt(i)) == ' ' && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		if (flag) {
			System.out.println("Total Number of words from the String are = 0");
		} else {
			System.out.println("Total Number of words from the String are = " + count);
		}

	}
}

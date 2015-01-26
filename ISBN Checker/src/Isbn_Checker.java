/* 2015-01-12
 * ISBN validator for the daily programmer challenge on reddit
 * http://www.reddit.com/r/dailyprogrammer/comments/2s7ezp/20150112_challenge_197_easy_isbn_validator/
 * 
 */
public class Isbn_Checker {

	public static void main(String[] args) {
		System.out.println(isValidISBN("0-7475-3269-9"));
	}

	public static boolean isValidISBN(String ISBN){
		int multiplier = 10;
		int sum = 0;

		for (int i = 0; i<ISBN.length();i++){
			if (!(ISBN.charAt(i) == '-')){
				if (ISBN.charAt(i) == 'X') {
					sum += 10 * multiplier;
				}
				sum += Character.getNumericValue(ISBN.charAt(i)) * multiplier;
				multiplier--;
			}
		}
		return (sum%11 == 0);
	}
}

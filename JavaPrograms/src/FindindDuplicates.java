
public class FindindDuplicates {

	public static void main(String[] args) {
		String str = ("Bitter Butter Better");
		char[] ch = str.toCharArray();
		char temp = 0;

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[i] == ch[j + i]) {
					//temp = ch[i];


				}


			}
		}

	}
}

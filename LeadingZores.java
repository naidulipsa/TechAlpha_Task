package Task1;

public class LeadingZores {
public static void main(String[] args) {
	String str="00000123789";
	String ansString="";
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='0') {
			continue;
		}
		else {
			ansString=str.substring(i);
			break;
		}
	}
	System.out.println(ansString);
	
}
}

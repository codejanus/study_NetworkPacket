import java.util.Arrays;

public class UCheck {

	public static void main(String[] args) {

		String s="687474703a2f2f6e72746a6f2e65752f2f6c6f6164696e672e7068703f73706c3d6a617661646e7726";
		String s1 = s.replaceAll("h", "");
		byte abyte0[] = new byte[s1.length()/2];
		for(int i=0; i<s1.length(); i+=2)
			abyte0[i/2]=(byte)((Character.digit(s1.charAt(i), 16) << 4) + Character.digit(s1.charAt(i+1), 16));
		System.out.println("output1: " + Arrays.toString(abyte0));
		
		char abyte1[] = new char[s1.length()];
		for(int i=0; i<s1.length(); i+=2){
			abyte1[i/2]=(char)((Character.digit(s1.charAt(i), 16) << 4) + Character.digit(s1.charAt(i+1), 16));
		}
		System.out.println("output2: " + Arrays.toString(abyte1));
		
		char abyte2[] = new char[s1.length()];
		String u = "";
		for(int i=0; i<abyte2.length; i++){
			char tmp = (char)abyte1[i];
			abyte2[i]=tmp;
			u += tmp;
		}
		System.out.println("output3: " + u);
	}
}

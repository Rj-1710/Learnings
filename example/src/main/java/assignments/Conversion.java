package assignments;

public class Conversion {
	
	public String convertToWords(long num) {
	String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
			"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	long[] nunits = {10000000l,100000l,1000l,100l,1};
	String[] sunits = {" Crores ", " Lakhs "," Thousands "," Hundred "," "};
	String words = "";
	
	if(num ==0) {
		words +="zero";
	}
	
	for(int i=0; i<nunits.length;i++) {
		long num1 = num/nunits[i];
		if(num1>0) {
			if(num1<20) {
				words += ones[(int)num1]+ sunits[i];
			}
			else {
				words += tens[(int)(num1/10)]+" "+ones[(int)(num1%10)] +sunits[i];
			}
		}
		num %=nunits[i];
	}
	
	return words.trim()+" only";
	
	}
	
	public static void main(String[] args) {
		

		System.out.println(new Conversion().convertToWords(45963l));
	}
}

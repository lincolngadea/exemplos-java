import java.util.Locale;
import java.util.Scanner;

public class FuncoesUteis {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc  DEFG    ";
		
		String f01 = original.toLowerCase();
		String f02 = original.toUpperCase();
		String f03 = original.trim();
		String f04 = original.substring(2);
		String f05 = original.substring(2,9);
		String f06 = original.replace("a", "X");
		String f07 = original.replace("abc", "XY");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+f01+"-");
		System.out.println("toUperCase: -"+f02+"-");
		System.out.println("trim: -"+f03+"-");
		System.out.println("substring: -"+f04+"-");		
		System.out.println("substring: -"+f05+"-");	
		System.out.println("replace: -"+f06+"-");
		System.out.println("replace: -"+f07+"-");
		System.out.println("indexOf 'bc': -"+i+"-");
		System.out.println("lastIndexOf 'bc': -"+j+"-");
	}
}

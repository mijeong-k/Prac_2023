package equals;

public class StrEquals {

	public static void main(String[] args) {
		String str1 = "good";
		String str2 = "good";
		if(str1==str2) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		if(str1.equals(str2)) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}		
		
		System.out.println("----------------------");
		
		String str3 = new String("good");
		String str4 = new String("good");
		if(str3==str4) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		if(str3.equals(str4)) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}			
		
		System.out.println("----------------------");
		
		String str5 = "good";
		String str6 = new String("good");
		if(str5==str6) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		if(str5.equals(str6)) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}		
		
		System.out.println("----------------------");
				
		String str7 = "good";
		String str8 = new String("good2");
		if(str7==str8) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		if(str7.equals(str8)) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}	
		
		System.out.println("----------------------");
				
		String str9 = "good";
		String str0 = "good2";
		if(str9==str0) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		if(str9.equals(str0)) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}

	}

}

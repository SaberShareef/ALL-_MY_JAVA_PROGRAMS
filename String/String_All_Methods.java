package String;

public class String_All_Methods {

	public static void main(String[] args) 
	{
		
		
						//Equals Method
						//It focus on case sensitive
		
		String ActRes="Something Something";
		String ExpRes="Something Something";
		
		Boolean flag=ActRes.equals(ExpRes);
		System.out.println("equal comparison when both actual and expeacted are same-->"+flag);
		
		String ActRes_false="Something Something";
		String ExpRes_false="something something";
		
		Boolean flag1=ActRes_false.equals(ExpRes_false);
		System.out.println("equal comparision when actaul and expected are not same-->"+flag1);
		
		
						//Equalingorecase Method
						//It ignores case sensitive
		String Act_Res="Something Something";
		String Exp_Res="something something";
		
		Boolean flag_1=Act_Res.equalsIgnoreCase(Exp_Res);
		System.out.println("\nEqualingore Comparision is-->"+flag_1);
		
		
						//Contains Method
						//it is CaseSensitive as well as follows sequence
		
		String Status="Account is created";
		System.out.println("\nComparision-1 is -->"+ Status.contains("Account"));
		System.out.println("Comparision-1 is -->"+ Status.contains("account is created"));
		System.out.println("Comparision-2 is -->"+ Status.contains("Account created"));
		System.out.println("Comparision-3 is -->"+ Status.contains("ted\n"));
		
						//Length Method
		
		String MobileNo="7700000000";
		int Length=MobileNo.length();
		
		if(Length==10)
			System.out.println("\nLength is matched");
		else
			System.out.println("\nLength is mismatched");
		
						//Trim Method
						// this method use-full to remove white spaces
		
		String pincode="     501509      ";
		System.out.println("\nbefore trim String length -->"+pincode.length());
		System.out.println("\nafter trim of String length-->"+pincode.trim().length());
		
		
		//checking length of string before trim
		if(pincode.length()==6)
			System.out.println("valid pincode");
		else
			System.out.println("invalid pincode");
		
		//checking length of string after applying trim method
		if(pincode.trim().length()==6)
			System.out.println("valid pincode");
		else
			System.out.println("\ninvalid pincode");
		
		
						//SubString Method
		
		String AccountNo="624015795223";
		String LastDigits=AccountNo.substring(7);
		System.out.println("\nLast digits are-->"+LastDigits);
		
		String MiddleDigits=AccountNo.substring(3, 8);
		System.out.println("\nLast digits are-->"+MiddleDigits);
		
						//is empty method
		String str="";
		String str1="123456789";
		System.out.println("\nwhen string is empty-->"+str.isEmpty());
		System.out.println("\nwhen string has charectors -->"+str1.isEmpty());
		
		if(str1.isEmpty())
			System.out.println("\n string is empty");
		else
			System.out.println("string contains "+str1);
		
		
		
						//Startwith Method
		
		String AccountNumber="1111624015792434444";
		Boolean flag3=AccountNumber.startsWith("1111");
		System.out.println("\nstart with comparision when its true -->"+flag3);
		Boolean flag4 = AccountNumber.startsWith("6240");
		System.out.println("start with comparision when its false -->"+flag4);
		
						//Endwith Method
		
		Boolean flag5=AccountNumber.endsWith("4444");
		System.out.println("\n end with comparision when its true -->"+flag5);
		Boolean flag6=AccountNumber.endsWith("9243");
		System.out.println("end with comparision when its false-->'"+flag6);
		
						//Charsat method
		
		String sentance="Something,Nothing";
		char ch=sentance.charAt(6);
		System.out.println("\n charector at 6th posion is-->"+ch);
		
						//Tolowercase Method
		
		String name="SomeThing";
		System.out.println("\n"+name.toLowerCase());
		
						//ToUppercase Method
		
		System.out.println("\n"+name.toUpperCase());
		
						//Concat Method
		
		String fname="Saber";
		String lname="mohd";
		System.out.println(lname.concat(fname));
		
		
						//Replace all Method
		
		String value="mindq9030323456dilsukhnagar";
		String Numberonly=value.replaceAll("[^0-9]", "");
		System.out.println("it prints numbers only in the string-->" + Numberonly);
		String Chonly=value.replaceAll("[^a-z]", "");
		System.out.println("it prints only charectors in the string-->" + Chonly);
			

	}

}

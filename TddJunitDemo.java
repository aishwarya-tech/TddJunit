package MyPro;

public class TddJunitDemo {

	public String RemoveA(String string1)
	{
		String result = string1;
		int StrLen = string1.length();
		char firstChar = string1.charAt(0);
		char secondChar = string1.charAt(1);
		
		if(firstChar=='A' && secondChar=='A')
		{
			String res3 =  string1.substring(2, StrLen-1);
			result=res3;
		}
		
		if(firstChar == 'A')
		{
			String res1 = string1.substring(1, StrLen-1);
			result=res1;
		}
		
		if(secondChar=='A')
		{
			String res2 = string1.charAt(0)+string1.substring(2, StrLen-1);
			result=res2;
		}
		
		
		return result;
	}

}

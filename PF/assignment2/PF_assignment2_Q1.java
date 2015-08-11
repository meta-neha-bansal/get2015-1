//This program is mainly for displaying these type of pattern.
/*
      1
     121
    12321
   1234321
    12321
     121
      1
*/
public class PF_assignment2_Q1 {
	public String pyramid(int row)
	{
		int i=0;
		String finalString="";
		String str1="",str2="";
		//below code is for upper half of pattern
		for(i=1;i<=row;i++)
		{
			str1=spaces(i,row);                //calling function of space for each row
			str2=numbers(i);              //calling function of numbers each row
			finalString+=str1+str2+"\n";      
		}
		//below code is for lower half of pattern
		for(i=row-1;i>0;i--)
		{
			str1=spaces(i,row);
			str2=numbers(i);
			finalString+=str1+str2;
			if(i!=1)
				finalString+="\n";
		}
		return finalString;                //return the final string of this pattern
		
	}
	//below function is to return string of spaces.
	public String spaces(int rowNumber,int totalRows)
	{
		String str="";
		int i=0;
		for(i=rowNumber;i<totalRows;i++)
			str+=" ";
		return str;	
		
	}
	//below function is to return string of numbers.
	public String numbers(int rowNumber)
	{
		String str="";
		int i=0;
		for(i=1;i<=rowNumber;i++)
			str+=i;
		for(i=rowNumber-1;i>0;i--)
			str+=i;
		return str;		
	}

    
    public static void main(String[] args)
    {
    	PF_assignment2_Q1 pf=new PF_assignment2_Q1();
    	String str=pf.pyramid(3);
    	System.out.println(str);
    	
    }
}

/*This program is mainly for displaying these type of pattern
    12345
     1234
      123
       12
        1
*/
 public class PF_assignment2_Q2 {
	public String pyramid(int row)
	{
		int i=0;
		String str1="",str2="",finalString="";
		for(i=1;i<=row;i++)
		{
			str1=spaces(i,n);  //call the function of space for each row.
			str2=numbers(i,n);  //call the function of number for each row.
			finalString+=str1+str2+"\n";
		}
		return finalString;  //return the final string
	}
	//below code is for return string of spaces.
	public String spaces(int row,int n)
	{
		String str="";
		int i=0;
		for(i=1;i<row;i++)
			str+=" ";
		return str;	
		
	}
	//below code is for return string of numbers.
	public String numbers(int row,int n)
	{
		String str="";
		int i=0;
		for(i=1;i<=n-row+1;i++)
			str+=i;
		return str;		
	}
    
    public static void main(String[] args) 
    {
    	PF_assignment2_Q2 pf=new PF_assignment2_Q2();
    	String str=pf.pyramid(3);
    	System.out.println(str);
    }
}

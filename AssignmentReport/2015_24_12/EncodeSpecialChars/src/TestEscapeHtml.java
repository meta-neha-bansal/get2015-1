import org.apache.commons.lang.StringEscapeUtils;


public class TestEscapeHtml {

public static void main(String args[]){
		
		String testStr = "<script>alert('Hello')</script>";
		
		System.out.println("Original : " + testStr);
		
		System.out.println("Escaped : " + StringEscapeUtils.escapeHtml(testStr));
		
	}	
}

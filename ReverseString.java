public class ReverseString {

	public static void main(String[] args) {
		String c1= "hi how are you";
		String reverse ="";
		for(int i=(c1.length());i>=0;i--)
		{
		 reverse =reverse+ c1.charAt(i);
               System.out.print(reverse);
	}

}
}
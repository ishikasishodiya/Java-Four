public class Sumofprime {

	public static void main(String[] args) {
		int n=0; int temp=0; int sum=0;
		while(temp<=100) {
			n++;
			if(n%2!=0) {
				for(int i =3;i<=n/2;i=i++) {
					if(n%i!=0) {
						//System.out.println(n);
						sum =sum+n;
					temp++;
					}
					
				}
			}
		}
		System.out.println(sum);
	}

}

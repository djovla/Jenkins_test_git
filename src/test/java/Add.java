
public class Add {

	public static void main(String[] args) {
		int a = 456;
		int solution = 0;
		while (a>0) {
			int i = a%10;
			solution = solution +i;
			a=a/10;
			
			
		}
		System.out.println(solution);
		

	}

}

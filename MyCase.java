public class MyCase{
	public static void main(String[] args) {
		int num = 10 ;
		String c = "A";
		switch(c) {
			case "A" :
				num ++;
				System.out.println("a!") ;
			case "B" :
				num ++;
				System.out.println("b!") ;
			case "Y" :
				num ++ ;
				System.out.println("Y!") ;
			default : 
				System.out.println("!@!") ;
				num -- ;		
		}
		System.out.println(num) ;
	}
}
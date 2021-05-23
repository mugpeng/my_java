class Person {
	private String name ;
	private int age ;
	private static String country = "China" ;
	public Person() {
		this("xiaoming", 20);
		
	}
	public Person(String name) {
		this(name, 20);
	}
	public Person(String name, int age) {
		// this.name = name ; // 相同名称
		// this.age = age ; // 相同名称
		this.nameSetter(name) ;
		this.ageSetter(age) ;
		System.out.println("A Person class has been created.") ;
	} 
	public void nameSetter(String name) {
		this.name = name ;
	}
	public String nameGetter() {
		return this.name ;
	}
	public void ageSetter(int age) {
		this.age = age ;
	}
	public int ageGetter() {
		return this.age ;
	}
	public static void setCountry() {
		
	}
	public String getInfo() {
		return "name :" + name + ", age :" + age + ", country :" + country ;		
	}
}

public class MyDemo {
	public static void main(String[] args) {
		Person per = new Person("Jack") ;
		Person.country = "Duludulu kingdom" ;
		System.out.println(per.getInfo());
	}
}
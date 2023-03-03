package test02;
class Person{
	private String name;
	private int age;
	
	Person(){	} // 1. 매개변수가 없는 생성자 
	
	Person(String name, int age){ // 2. 매개변수가 있는 생성자
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { // set을 하는 이유는 private 때문임
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person per = new Person("홍길동", 18); // 조건이 있어도 되고 없어도됨
		
		System.out.println(per);
		
		System.out.println(per.getName());
		Person per1 = new Person();
		per1.setName("홍길동");
		System.out.println("이름 : " + per.getName() + ", 나이 : " +  per.getAge());
		
		Person per3 = new Person("강감찬", 30);
		System.out.println(per1);
		System.out.println(per);
		System.out.println(per3);
	}

}

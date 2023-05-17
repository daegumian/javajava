package day10.static_.singleton;

public class Singleton {

	//팩토리메서드, 인터페이스패턴, 추상팩ㅌ리패턴, 빌더패턴, 퍼사드패턴 등등등...
	//싱글톤 - 객체가 1개만 생성되도독 클래스를 설계하는 패턴 (디자인 패턴도 공부해보자)
	
	//1. 나 자신의 객체를 1개 생성!!!
	private static Singleton instance = new Singleton();
	
	//2. 객체를 직접생성 할 수 없도록 생성자를 private 선언합니다.
	private Singleton() {
	}
		
	//3. 외부에서 객체생성을 요구할 때, getter를 통해서 instance반환시킴
	public static Singleton getInstance() {
		
		return instance;
	}
	
	private String domain = "www.aaa.bbb";
	
	
	
	/////////////////////////////////////////////////
	public String getDomain() {
		return domain;
		
	}
	
	
	
}

package org.cskj.book.chinese.bean;

public class Chinese {
	private int id ;
	private String name;
	private int age;
	private String kumu;
	private int score;
	@Override
	public String toString() {
		return "Chinese [id=" + id + ", name=" + name + ", age=" + age + ", kumu=" + kumu + ", score=" + score + "]";
	}
	public Chinese(int id, String name, int age, String kumu, int score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.kumu = kumu;
		this.score = score;
	}
	public Chinese() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKumu() {
		return kumu;
	}
	public void setKumu(String kumu) {
		this.kumu = kumu;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

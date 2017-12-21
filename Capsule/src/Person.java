
public class Person {

	public String name= null;
	private int age=0;
	private int HP=0;

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getHP(){
		return this.HP;
	}
	public void setHP(int HP){
		this.HP=HP;
	}
	public Person(){}

	public Person(String name, int age,int HP){
		this.name=name;
		this.age=age;
		this.HP=HP;
	}
	public Person(String name,int HP){
		this.name=name;
		this.age=0;
		this.HP=HP;
	}
	public Person(int age,int HP){
		this.name="名前なし";
		this.age=0;
		this.HP=0;
	}
	public Person(int age,String name){
		this.name=name;
		this.age=age;
	}
}

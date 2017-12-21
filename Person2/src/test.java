
public class test {


	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;

		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person("山中次郎",22);

		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person ichiro =new Person("鈴木一郎");

		System.out.println(ichiro.name);
		System.out.println(ichiro.age);

		Person saburo=new Person(17);

		System.out.println(saburo.name);
		System.out.println(saburo.age);
	}
}

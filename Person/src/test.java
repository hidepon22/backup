public class test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1111-1111";
		taro.address="UK";

		Person hideyo = new Person();
		hideyo.name="内山英世";
		hideyo.age=21;
		hideyo.phoneNumber="080-0000-0000";
		hideyo.address="NZ";

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-2222-2222";
		jiro.address="USA";

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-3333-3333";
		hanako.address="JP";

		System.out.println(taro.name+","+taro.age+","+taro.phoneNumber+","+taro.address);
		System.out.println(hideyo.name+","+hideyo.age+","+hideyo.phoneNumber+","+hideyo.address);
		System.out.println(jiro.name+","+jiro.age+","+jiro.phoneNumber+","+jiro.address);
		System.out.println(hanako.name+","+hanako.age+","+hanako.phoneNumber+","+hanako.address);
	}
}

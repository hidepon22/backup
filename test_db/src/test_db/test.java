package test_db;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		dao.selectAll();
		dao.selectByName("taro");
		dao.updateUserNameByUserName("taro", "saburo");
		dao.insert(4, "shiro", "012");
		dao.delete("shiro");
	}

}

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class person {
	private String name = null;
	private int age = 0;


    public String getName(){
		return this.name;
	}


    public int getage(){
    	return this.age;
    }


	public void setName(String name){
		this.name= name;
	}


	public void setage(int age){
		this.age=age;
	}


	public void showname(){
		System.out.println(name);
	}
	public void showage(){
		System.out.println(age);
	}
}

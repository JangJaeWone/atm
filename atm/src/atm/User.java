package atm;

import java.util.Arrays;

public class User {

	private int userCode; //R
	private String name; //R
	private String id; //R
	private String password; //R
	private int age;
	
	private ArraysList<Account> accs;
	
	public User(int userCode,String name,String id,String password, int age) {
		this.userCode = userCode;
		this.name = name;
		this.id = id;
		this.password= password;
	}
	
	public int getUserCode() {
	return this.userCode;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public ArraysList<Account> getAccs(){
		return (ArraysList<Account>) this.accs.clone(); //복제본제공
	}
	
	public void setAccs(ArraysList<Account> accs) {
		this.accs = accs;
	}
	
	

}

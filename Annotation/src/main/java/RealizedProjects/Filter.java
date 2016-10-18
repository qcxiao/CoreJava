package RealizedProjects;

@Table("user")
public class Filter {
	
	@Column("id")
	private String id ; 
	@Column("userName")
	private String userName;
	@Column("age")
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

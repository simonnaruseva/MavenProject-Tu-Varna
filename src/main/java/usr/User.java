package usr;

public class User implements java.io.Serializable {

	   private static final long serialVersionUID = 1L;
	   private String username = null;
	   private String name = null;
	   private String password = null;
	   private String age = "";
	   private String email = "";
	   private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(String username, String name, String password, int id) {
		   this.setUsername(username);
		   this.setName(name);
		   this.setPassword(password);
		   this.setId(id);
	   }
	   public User() {
		   
	   }
	   
	   public String getUsername(){
	      return username;
	   }
	   public void setUsername(String username){
		   this.username = username;
	   }
	   
	   public String getName(){
		  return name;
	   }
	   
	   public void setName(String name){
		   this.name = name;
	   }
	   
	   public String getPassword(){
		  return password;
	   }
	   
	   public void setPassword(String password){
		   this.password = password;
	   }
	   public String getAge() {

		return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
	

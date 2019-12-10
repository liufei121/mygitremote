public class User{

	private String username;//在master分支中修改的内容

	private Integer id;//在b1分支中修改的内容
	private Integer age;//在fix分支
	
	public User(){
	}
	public User(Integer id,String username){
		this.id=id;
		this.username=username;
	}
}
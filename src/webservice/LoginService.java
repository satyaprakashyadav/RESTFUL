package webservice;
 
import java.util.ArrayList;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
 
import model.SecurityManager;
import pojo.UserVO;
 
@Path("/WebService")
public class LoginService {
 
@POST
 @Path("/login")
 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
 public String login(@FormParam("username") String username,
 @FormParam("password") String password) {
 
 return getAllUsersList(username, password);
 
}
 
public String getAllUsersList(String username,String password)
 {
 String userListData = null;
 try
 {
 ArrayList<UserVO> userList = null;
 SecurityManager securityManager= new SecurityManager();
 userList = securityManager.getAllUsersList();
 for (UserVO userVO : userList) {
 if(userVO.getUsername().equals(username))
 {
 if(userVO.getPassword().equals(password))
 {
 return "Logged in UserName :"+username;
 }
 }
 }
 
} catch (Exception e)
 {
 System.out.println("error");
 e.printStackTrace();
 }
 return "You are not a Valid User";
 }
}
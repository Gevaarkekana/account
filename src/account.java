
/**
 *
 * @author RC_Student_lab
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class account {
       private String username;
       private String password;
       private String FirstName;
       private String lastName;
          
  public account (String username, String password, String firstName, String lastName) {
       this.username = username;
       this.password = password;
       this.FirstName = firstName;
       this.lastName = lastName;
     }   
       
   public boolean checkUsername(){
      return username.contains("-") && username.length()<=5;
  }
          
      public boolean checkPasswordComplexity(){ 
          return password.length() >= 8 &&
                 password.matches(".*[A-Z].*")&&
                 password.matches(".*\\ d.*.") &&
                 password.matches(".*[!@#$^&()_+=`~\\[\\]{}|,.<>?/].*");
      }
          
                
      public String registerUser() {
          if (!checkUsername()) {
              return "Username is not correctly formatted, please ensurethat your username contains an underscore and is no more than 5 "
                      + "chareters in length.";
          } else if(!checkPasswordComplexity()) {
              return"password is not correctly formated please ensure that the password contains at least 8 charectors, a capital letter,"
                        + "a number and special charecter.";
          }   else {
              return "user successfully registered.";
          }
      }
          
      public boolean loginUser(String enteredUsername, String enteredpassword) {
          return enteredUsername.equals(username) && enteredpassword.equals(password);
      }
     public String returnLoginStatus(boolean isloggedIn){
     if (isloggedIn) {
         return "Welcome " + FirstName + " " + lastName + "" + ", it is great to see you again.";
     } else { 
         return " username or password incorrect, please try again.";
     }    
     }


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.printIN("Enter username");
    String username =scanner. nextline();
    System.out.printIN("enter password");
    String password scanner = nextline();
    system.out.printIN("enter firstName");
    String firstName scanner= nextline();
    system.out.printIN ("enter lastname")
    
    Login newUser = new login(username, password, firstName, lastname);
    string registration massage = newUser registration();
    system.out.printIn(registrationMessage);
    
    Systen.out.printIn("enter username for login:" );
    Sring enteredUsername =scanner.nextLine();
    Systen.out.printIn("enter passwird for login:");
    string enteredpassword = scanner.nextLine();
    
    boolean isLoggedIn =newUser.login user(enteredUsername, enteredpassword);
    string loginstatus =newUser.returnloginstatus(islogedin);
    system.out.printIn(loginStatus);
    
    scanner.close();
}
    
    
    
       
    
    
    
         
            
}
  
  
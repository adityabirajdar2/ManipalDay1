public class ParameterizedConstructor  {
    String username, userplace;
    String usercompanyName;
    int userId;
    int userage;
    String userposition;

public ParameterizedConstructor(String name , String place , String companyName , int Id , int age , String position){
    username=name;
    userplace=place;
    usercompanyName=companyName;
    userId=Id;
    userage=age;
    userposition=position;
    
}
void displayUser(){
    System.out.println("Name: "+username);
    System.out.println("UserId: "+userId);
    System.out.println("CompanyName: "+usercompanyName);
    System.out.println("Place: "+userplace);
    System.out.println("Age: "+userage);
    System.out.println("Position: "+userposition);
}
    
public static void main(String args[]){
    ParameterizedConstructor obj = new ParameterizedConstructor("Aditya", "Mumbai", "Axis", 07, 22, "It deputy Manager");
    obj.displayUser();
}
}

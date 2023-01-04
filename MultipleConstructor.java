public class MultipleConstructor  {
    String username, userplace;
    String usercompanyName;
    int userId;
    int userage;
    String userposition;

public MultipleConstructor(String name , String place , String companyName , int Id , int age , String position){
    this();
    username=name;
    userplace=place;
    usercompanyName=companyName;
    userId=Id;
    userage=age;
    userposition=position;
    
}
public MultipleConstructor() {
System.out.println("This is default Constructor");
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
    MultipleConstructor obj = new MultipleConstructor("Aditya", "Mumbai", "Axis", 07, 22, "It deputy Manager");
    obj.displayUser();
   

}
}

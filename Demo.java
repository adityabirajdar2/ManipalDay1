class Demo{
    public String name, place;
    public String companyName;
    private int userId;
    protected byte age;
    private String position;

    void createUser(String name, int userId, String companyName, String place, byte age, String position){
        this.name = name;
        this.userId = userId;
        this.companyName=companyName;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    void displayUser(){
        System.out.println("Name: "+name);
        System.out.println("UserId: "+userId);
        System.out.println("CompanyName: "+companyName);
        System.out.println("Place: "+place);
        System.out.println("Age: "+age);
        System.out.println("Position: "+position);
        
    }

    public static void main(String args[]){
        Demo Obj1 = new Demo();

        Obj1.createUser("Aditya", 7, "Axis", "Mumbai", (byte) 22, "IT Deputy Manager");
        Obj1.displayUser();
    }
}
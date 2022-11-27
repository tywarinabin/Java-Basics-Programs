class Animal{
    String name;
    int age;
    
    public Animal(String S){
        System.out.println("Name : "+S);
    }
    public Animal(){
        this("Nabin");             // This call One Parameterized Constructor of Animal Class.
        // The we can even pass this(); constructor to call default constructor.
        System.out.println("Animal Default Constructor.");
    }
    public Animal(String name, int age){
    this.name = name;
    this.age = age;
// Use case of this operator is if parameter we make and the properties of class is same then we have to use this to get reference of that properties otherwise it cause an error.

    }
}
public class This_and_Super {
    public static void main(String[] args) {
      Animal a = new Animal();
    }
}

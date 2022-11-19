public class App {
    public static Person[] create(){
        Person[] Persons = new Person[5];

        Persons[0] = new Man("Sonny", 20);
        Persons[0] = new Man("Payin", 20);
        Persons[1] = new Woman("Nana Ama", 20);
        
        //Polymorphism 
        Persons[0].eat();
        Persons[1].eat(false);
        
        return Persons;
    }


    public static void  read(Person[] Persons){
        
        System.out.println("[");

        System.out.println(
        "   {" + 
            "name : "+Persons[0].name + " , "+ "age : "+Persons[0].age + ", gender : "+Persons[0].gender 
        + "} \n"
        );
        System.out.println(
        "   {" + 
            "name : "+Persons[1].name + " , "+ "age : "+Persons[1].age + ", gender : "+Persons[0].gender 
        + "} \n"  
        );

        System.out.println( "]");
    }

    public static String update(Person[] Persons){
        Persons[2] = new Man("Brandon", 20);
        Persons[3] = new Woman("Vinci", 20);
        
        // System.out.println(Persons.length);
        if(Persons.length == 5)return "Successfully Updated";
        

        return "Failed to Update";
    }


    public static String delete(Person[] Persons){
        Persons[3] = null;
        
        if(Persons.length == 4)return "Deleted Successfully";
        

        return "Failed to Delete";
    }
    public static void main(String[] args) throws Exception {
        Person[] Persons = new Person[5];
       
        // CREATE
        Persons = create();

        // READ
        read(Persons);

        // UPDATE
        System.out.println(update(Persons));
        
        // DELETE
        System.out.println(delete(Persons));
        
        
        
        
    }
}

public class Main {

    public static void main(String[] args) {


//        Player player = new Player();
//        player.name = "Tim";
//        player.weapon = "Sword";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        //By not setting our fields to private in player and accessing them directly from our main class, we have taken
        //control away from the Player class, and taken the ability away for the Player class to manage the Player's health.

        //Allowing direct access to data on an object, can potentially bypass checks, and additional processing, your
        //class has in place to manage the data.

        //Allowing direct access to fields, means calling code would need to change, when you edit any of the fields.

        //Omitting a constructor, that would accept initialization data, may mean the calling code is responsible for
        //setting up this data, on the new object.

        //Allowing direct access to data on an object, can bypass checks and operations.

        //It encourages interdependency, or coupling, between the calling code and the class.

        //For the previous example, we showed that changing a field name, broke the calling code.

        //And we also showed, that the calling code had to take on the responsibility, for properly initializing a new
        //Player.

        //One of the huge benefits of encapsulation, is that you're not actually affecting any other code.

        //It's sort of like a black box in many ways.

        //But the EnhancedPlayer class has more control over its data.

        //Encapsulation principles:

        //You should create constructors for object initialization, which enforces that only objects with valid data
        //will get created.

        //You should use private access modifier for your fields.

        //You should use setter and getter methods sparingly, and only as needed.

        //You should use access modifiers that aren't private, only for methods that the calling code needs to use.

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());

    }

}

//In Java, encapsulation means hiding things, by making them private, or inaccessible.

//Why would we want to hide things?

//To make the interface simpler, we may want to hide unnecessary details.
//To protect the integrity of data on an object, we may hide or restrict access to some of the data and operations.
//To decouple the published interface from the internal details of the class, we may hide actual names of class members.

//Although Java has a type called interface, that's not what we're referring to.

//When we talk about a class's public or published interface, we're really talking about the class members that are
//exposed to, or can be accessed by, the calling code.

//Everything else in the class is internal, or private to it.

//An application programming interface, or API, is the public contract, that tells others how to use the class.

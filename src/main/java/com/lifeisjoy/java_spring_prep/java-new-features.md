Java 10:

  Local Variable Type Inference:

  Allows developers to declare local variables without explicitly specifying their type. Instead, the compiler infers the       variable's type based on the initializer expression on the right-hand side of the assignment. This is achieved using the      reserved type name var.

  var name = "suresh";
  boolean isInstanceOfString = name instanceof String;
  System.out.println(isInstanceOfString); //outputs: true

  var n; // error: cannot use 'var' on variable without initializer
  var emptyList = null; // error: variable initializer is 'null'
  var arr = { 1, 2, 3 }; // error: array initializer needs an explicit target-type

  //before java 10
  Map<Integer, String> map = new HashMap<>();

  //from java 10
  var idToNameMap = new HashMap<Integer, String>();
  
  - It cant be used for memeber varibales, method parameters, or return types.
  - Reduces boilerplate


Java 13

TextBlocks

Text Blocks were introduced as a preview feature in Java 13 and were made a permanent part of the Java language in Java 15
It provides a more readable and natural way to define strings that span multiple lines without the need for concatenation or escape characters.

String name = """
                  ___        __  ___   __   __    __   _______  ______      
                 /   \\     |  |/  /  |  | |  \\ |  | |   ____||   _   \\     
                /  ^  \\    |  '  /   |  | |   \\|  | |  |__   |  |_)   |    
               /  /_\  \\   |    <    |  | |  . `  | |   __|  |        //     
              /  _____  \\  |  .  \   |  | |  |\\   | |  |____ |  |\\  \\__
             /__/     \__\\ |__|\\__\ |__| |__| \\__| |_______|| _| `._____|
                  ";

Text Blocks are particularly useful for writing SQL queries, JSON, XML, and any other kind of formatted text where readability is important.


Java 16:

records:

speacial type of java class designed to create concise, immutable data-carrier classeswith significantly less boilerplate code.

By using the record keyword, you can declare a complete data class in a single line. 

public record Person(String firstName, String lastName) {}
Person person = new Person("John", "Doe");


private final field for each data component
a public constructor that accepts all components
Public accessor methods for each component, which have the same name as the field
(e.g., person.firstName() instead of person.getFirstName()).
Implementations of equals(), hashCode(), and toString() methods. 



    

  

  
    
  



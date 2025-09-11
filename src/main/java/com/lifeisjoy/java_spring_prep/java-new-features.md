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

    

  

  
    
  



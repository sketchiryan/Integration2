//Ryan McGuire
package integration;
//using inheritance where class is the subclass and people is the super class
//Sharing the private variables from class people to class student
class student extends people { 
  public student (String name, String sex){
     super(name, sex);
   }
   //the method override in student class is overriding the method override in people class
   public void override() {
     System.out.println("The name of the student is " + getName());
   }

}
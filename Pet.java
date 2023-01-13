package Week_2;
public class Pet {

private String name;
private int age;
private double weight;
private static int withoutName;

public Pet(){
    name = "no Name";
    age = 0;
    weight = 0.00;
}

public Pet(String n, int a, double w){
    
    name = n;
    age = a;
    weight = w;
}

public Pet(String n){
    name = n;
}

public Pet(int a){
    age = a;
}
public Pet(double w){
    weight = w;
}
//Set's
public void setName(String newName){
          name = newName;
}

public void setAge(int newAge){
    age = newAge;
}

public void setWeight(double newWeight){
        weight = newWeight;
}    
//Get's
public String getName(){
  return name;
}

public int getAge(){
    return age;
}

public double getWeight(){
    return weight;
}

public String toString(){
   return "Name: " + name + " Age: " + age + " years\n"
           + "Weight: " + weight + " pounds:";
}

}

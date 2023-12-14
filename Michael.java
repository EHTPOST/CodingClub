//Michael Leyva
//Dec 12

import java.util.*;

class Main{
    public static void main(String[] args){
        Person Michael = new Person("Michael" ,15, 64);
        System.out.println(Michael.toString());
        Michael.quoteGreen();
        Michael.eatFood();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of rows to be printed");
        int rows = sc.nextInt();
        Michael.drawTriangle(rows);

    }
}

class Person{
  String name;
  int age;
  int height; //in inches

Person (String name, int age, int height){
    this.name = name;
    this.age = age;
    this.height = height;
   
}
public String getName (){
    return name;
}
public int getAge (){
    return age;
}
public int getHeight(){
    return height;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}
public void setHeight(int height){
    this.height = height;
}

public void quoteGreen (){
    String[] green = {"Listening is fundamental ","We are about positivity \n","This was a team effort \n", "common sense is not too common \n"};
    Random rand = new Random();
    int random = rand.nextInt(green.length);
    System.out.println(green[random]);
}

public void drawTriangle(int rows){
    System.out.println ("look at my triangle!");
    String space = ".";
    String star = "* ";
    for (int i = 1; i <= rows; i++) {
        System.out.println(space.repeat(rows - i) + star.repeat(i));
    }
}

public void eatFood(){
    System.out.println ("nom! nom! nom!");
}

public String toString(){
    String bio = "This is a person named " + name + "! They are " + age + " years old and " + height + " inches tall. they can draw a triangle! They can quote Brian Green! They can eat!\n" ;
    return bio;
}
}

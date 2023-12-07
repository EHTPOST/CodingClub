// Emmett Wall
// 11/2/23
import java.util.*;

class Main {
    public static void main(String[] args) {
        //create a person with attributes
        Person emmett = new Person("attribute1", "atttribute2", 3);
        
        //print their toString
        System.out.println(emmett.toString());
        
        //perform 3 actions, print what they return (if not void)
        emmett.action1();
        
        int[] count = emmett.countMyAttribute3s();
        System.out.println(Arrays.toString(count));
        
        String words = emmett.putWordsTogether("Hello", "World");
        System.out.println(words);
    }
}

class Person{
    //attributes 
    String attribute1;
    String attribute2;
    int attribute3;
    //constructor
    Person(String attribute1, String attribute2, int attribute3){
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }
    //getters
    public String getAttribute1(){
        return attribute1;
    }
    public String getAttribute2(){
        return attribute2;
    }
    public int getAttribute3(){
        return attribute3;
    }
    //setters
    public void setAttribute1(String attribute1){
        this.attribute1 = attribute1;
    }
    public void setAttribute2(String attribute2){
        this.attribute2 = attribute2;
    }
    //3 actions a person can do
    public void action1(){
        System.out.println("Woah look how good I am at action1-ing!");
    }
    public int[] countMyAttribute3s(){
        System.out.println("Woah look how good I am at counting my attribute3s!");
        int[] count = new int[attribute3];
        for(int i = 0; i < count.length; i++){
            count[i] = i+1;
        }
        return count;
    }
    public String putWordsTogether(String str1, String str2){
        System.out.println("Woah look how good I am at putting words together! Here they are");
        return str1 + " " + str2;
    }
    //toString: return a string about the persons attributes and actions
    public String toString(){
        String bio = "This person has attribute1 " + attribute1 + " and attribute2 " + attribute2 + " and attribute3 " + attribute3 + ". They can do action1, count their attribute3's, or put words together.";
        return bio;
    }
}


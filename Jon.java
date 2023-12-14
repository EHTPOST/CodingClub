//Jon

import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Person Jon = new Person("Brown", 15, "Jon");
        System.out.println(Jon.toString());
        Jon.knowingCode();
        int[] count = Jon.countToMyAge();
        System.out.println(Arrays.toString(count));
        Jon.putWordsTogether();
    }
}

class Person {
   String hair;
   int age;
   String name;
   
   Person(String hair, int age, String name){
       this.hair = hair;
       this.age = age;
       this.name = name;
   }
   //getters
   public String getHair(){
       return hair;
   }
   public int getAge(){
       return age;
   }
   public String getName(){
       return name;
   }
   //setters
   public void setHair(String name){
       this.hair = hair;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void setName(String name){
       this.name = name;
   }
   //3 actions a person can do
    public void knowingCode(){
        System.out.println("He knows how to code!!");
    }
    public int[] countToMyAge(){
        System.out.println("watch me count to my age!!");
        int[] count = new int[age +1];
        for(var i = 0; i < count.length; i++){
            count[i] = i+1;
        }
        return count;
    }
    public String putWordsTogether(){
        System.out.println("I'm puttin words together");
        String Word1 = "Hello";
        String Word2 = "and or wsg my guy";
        return Word1 + " " + Word2;
    }
    //toString: return a string about the persons attributes and actions
    public String toString(){
        String bio = "bro knows code (barely) he's " + age + " years old, and bro can count to his age?! (I hope this works bruh) his name is " + name + " and put some words together to say hello (to whoever's reading this) his hair color is " + hair + " They know code, how to count to his age, AND put words together!!! RAAAAAAHHHH!";
        return bio;
    }
   
}

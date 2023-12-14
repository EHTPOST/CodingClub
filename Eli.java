// Eli
// 11/9/23

import java.util.*;

class Main {
    public static void main(String[] args) {
        Person eli = new Person("Eli", 15, "5'8");
        System.out.println(eli.toString());
        eli.speaking();
        System.out.println(eli.speakingTheirName());
        int[] count = eli.countMyAttribute2s();
        System.out.println(Arrays.toString(count));
        String words = eli.putWordsTogether("Hello", "World");
        System.out.println(words);
        System.out.println(Arrays.toString(eli.countingToOneThousand()));
    }
}

class Person{
    String name;
    int age;
    String height;

    Person(String height, int age, String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public String height(){
        return height;
    }

    public int age(){
        return age;
    }

    public String name(){
        return name;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setAge(int age){
        this.age = age;
    }
   
    public void setName(String name){
        this.name = name;
    }

    public void speaking(){
        System.out.println("Woah look how good I am at speaking!");
    }

    public int[] countMyAttribute2s(){
        System.out.println("Woah look how good I am at counting to my age!");
        int[] count = new int[age];
        for(int i = 0; i < count.length; i++){
            count[i] = i+1;
        }
        return count;
    }

    public String putWordsTogether(String height, String name){
        System.out.println("Woah look how good I am at putting words together! Here they are");
        return height + " " + name;
    }

    public String toString(){
        String bio = "This person has height " + height + " and age " + age + " and a name " + name + ". They can walk, count their attribute2's, or put words together.";
        return bio;
    }
   
    public String speakingTheirName(){
        String speaking = "This person is speaking and saying their name which is " + name;
        return speaking;
    }
   
    public int[] countingToOneThousand(){
        int[] countingToOneThousand = new int[1000];
        for(int i = 0; i < countingToOneThousand.length; i++){
            countingToOneThousand[i] = i+1;
        }
        return countingToOneThousand;
}

    public int[] distanceWalkedInMeters(){
        int[] distanceWalkedInMeters = new int[50];
        for(int i = 0; i < distanceWalkedInMeters.length; i++){
            distanceWalkedInMeters[i] = i+1;
        }
        return distanceWalkedInMeters;
    }
}

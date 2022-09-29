class Flower{
String name;
String colour;
int noOfpetals;
 void sheddingFragrance(){
 System.out.println(colour+" "+name+" is shedding fragrance...!");
 }
 void blooming(){
 System.out.println(colour+" "+name+" is bloooming...!");
 }
 public static void main(String args[]){
 Flower rose = new Flower();
 rose.name = "Rose";
 rose.colour = "Red";
rose.noOfpetals = 12;
rose.blooming();
rose.sheddingFragrance();
 }
 }
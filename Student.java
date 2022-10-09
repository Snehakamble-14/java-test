class Student{
String name;
String branch;
String rollno;
String dob;
String collegeName;
void studying(){
 System.out.println(name+" "+branch+" "+rollno+" "+dob+" "+collegeName+" "+"is studying...!");
 }
 public static void main(String args[]){
 Student sneha = new Student();
 sneha.name = "sneha";
 sneha.branch = "Cse";
 sneha.rollno = "3RB18CS106";
sneha.dob = "11/12/2001";
sneha.collegeName = "Bkit";
sneha.studying();
 }
 }
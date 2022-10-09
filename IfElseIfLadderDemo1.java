class IfElseIfLadderDemo1{
public static void main(String[] args){
double marks = 75;
if(marks >= 85){
System.out.println("Boss you passed in distinction !!!");
}
else if(marks >= 60 && marks<85){
System.out.println("Boss you passed in First class !!!");
}
else if(marks <60 && marks >= 35){
System.out.println("Boss you passed in second class !!!");
}
else{
System.out.println("Boss you are failed.");
}
}
}
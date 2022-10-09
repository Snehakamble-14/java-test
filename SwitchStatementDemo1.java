class SwitchStatementDemo1{
public static void main(String args[]){
char alphabet = 'D';
switch(alphabet){
case 'A': System.out.println("A for Apple");
break;
case 'B': System.out.println("B for Ball");
break;
case 'C': System.out.println("C for Cat");
break;
case 'D': System.out.println("D for Dog");
break;
default: System.out.println("invalid value, value range must between A-D");
}
}
}
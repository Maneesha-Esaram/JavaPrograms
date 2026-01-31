class ConstructorEx{
  int n1;
  int n2;
  public ConstructorEx(){
    n1=10;
    n2=20;
  }
void Demo(){
  System.out.println(n1);
  System.out.println(n2);
}
  public static void main(String[] args){
    ConstructorEx c=new ConstructorEx();
    c.Demo();
  }
}

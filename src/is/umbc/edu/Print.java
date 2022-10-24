package is.umbc.edu;

public class Print {
   public  int number=100; //global class variable

    private  void print1(){

        System.out.println("Message from print1 method");
    }
   public  void print2(int abc,int def){
        System.out.println("This is print2 method");
    }
    private  int print3(){
        return 3;
    }
}

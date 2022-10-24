package is.umbc.edu;

import java.io.File;
import java.net.NetPermission;

public class Main {


   // static int number=100; //global class variable

    public static void main(String[] args)
    {
        File myFile=new File("shiva");
        myFile.canExecute();

        NetPermission np=new NetPermission("shiva");
        np.

        Print myPrint=new Print();
        myPrint.print2(4,5);

        Print myPrint2=new Print();
        myPrint2.print2(5,6);

        Person p1=new Person();
        p1.name("Shiva");

        Person p2=new Person();
        p2.name("john");
    }



}




import java.util.*;
import java.util.stream.*;

class Bogie{
String name;int cap;
Bogie(String n,int c){name=n;cap=c;}
}

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

List<Bogie> l=new ArrayList<>();
l.add(new Bogie("Sleeper",72));l.add(new Bogie("AC Chair",56));l.add(new Bogie("First Class",40));
l.add(new Bogie("Sleeper",72));l.add(new Bogie("AC Chair",56));

int total=l.stream().map(b->b.cap).reduce(0,Integer::sum);

System.out.println("Total seating capacity: "+total);

}
}

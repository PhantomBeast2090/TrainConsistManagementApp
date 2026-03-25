import java.util.*;
import java.util.stream.*;

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

LinkedList<String> l=new LinkedList<>();

l.add("Engine");l.add("Sleeper");l.add("AC");l.add("Cargo");l.add("Guard");

l.add(2,"Pantry");

l.removeFirst();l.removeLast();

System.out.println("final train: "+l);

}
}

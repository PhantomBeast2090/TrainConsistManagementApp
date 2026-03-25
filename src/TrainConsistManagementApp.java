import java.util.*;

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

HashMap<String,Integer> m=new HashMap<>();

m.put("Sleeper",72);m.put("AC Chair",60);m.put("First Class",40);

for(Map.Entry<String,Integer> e:m.entrySet())
System.out.println(e.getKey()+" -> "+e.getValue());

}
}

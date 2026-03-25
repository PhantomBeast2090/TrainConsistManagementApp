import java.util.*;
import java.util.stream.*;

class Bogie{
String name;int cap;
Bogie(String n,int c){name=n;cap=c;}
}

class TrainApp{
public static void main(String[] args){

System.out.println("=== Train Consist Management App ===");

Set<String> s=new HashSet<>();

s.add("BG101");s.add("BG102");
s.add("BG101");s.add("BG103");s.add("BG104");s.add("BG102");

System.out.println(s);

}
}

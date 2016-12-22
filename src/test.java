import java.util.ArrayList;
public class test {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<>(3);
    a.add("wocao");
    a.add("woca2o");
    a.add("wocao");
    a.add("wocao");
    a.add("wocao");
    for (String a1 : a) {
      System.out.println(a1);
    }
}
}
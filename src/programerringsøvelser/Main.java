package programerringsøvelser;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String args[]){
    Tekst obj = new Tekst();

    obj.Tilføj("hello");
    obj.Tilføj("flavie");
    obj.Tilføj("Elias");
    obj.Tilføj("flavie");
    obj.Tilføj("flavie");
    obj.Tilføj("hello world");
    obj.Tilføj("hello");

    System.out.println("Normal List:");
    // print list
    for (String item: obj.TekstLinjer) {
      System.out.print(item + " ,");
    }
    System.out.println();


    List<String> DistinctList = new ArrayList<>();
    DistinctList =  obj.FindAntalUnikker(obj.TekstLinjer);
    System.out.println("Unikke List:");
    // print list after selecting unikke string
    for (String item: DistinctList) {
      System.out.print(item + " ,");
    }
  }
}

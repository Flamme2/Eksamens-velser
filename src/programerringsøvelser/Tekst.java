package programerringsøvelser;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tekst {
  List<String> TekstLinjer = new ArrayList<>();

  public  List<String> Tilføj(String input){
    TekstLinjer.add(input);
    return TekstLinjer;
  }

  public List<String> FindAntalUnikker(List<String> val){
   // get Distinct elem from list
    return val.stream().distinct().collect(Collectors.toList());
  }


}


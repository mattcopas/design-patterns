package decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.tuple.Pair;

@Getter
@AllArgsConstructor
public class Talent {

  String name;
  Pair<String, Float> statChange;

}

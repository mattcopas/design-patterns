package decorator;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Character {

  private List<String> abilities;
  private Map<String, Float> stats;
  private String name;

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder()
        .append("Name: ").append(getName()).append("\n")
        .append("Abilities: ").append("\n");

    abilities.forEach(a -> builder.append(a).append("\n"));
    builder.append("Stats: ");
    stats.forEach((s, v) -> builder.append(s + ": " + v).append("\n"));
    return builder.toString();
  }


}

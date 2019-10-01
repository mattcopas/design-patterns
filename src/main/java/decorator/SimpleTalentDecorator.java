package decorator;

import java.util.List;
import java.util.Map;

public class SimpleTalentDecorator implements TalentDecorator{

  @Override
  public Character addTalent(Character character, Talent talent) {
    Map<String,Float> stats = character.getStats();
    stats.put(talent.statChange.getKey(), talent.statChange.getValue());
    List<String> abilities = character.getAbilities();
    abilities.add(talent.getName());
    return new Character(abilities, stats, character.getName());
  }
}

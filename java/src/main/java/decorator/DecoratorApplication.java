package decorator;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class DecoratorApplication {

  public static void main(String[] args) {
    Character character = new Character(new ArrayList<>(), new HashMap<>(), "Character 1");
    System.out.println("Unmodified character: \n" + character.toString());

    Talent talent = new Talent("Talent 1", new ImmutablePair<>("Stat 1", 4.0F));

    TalentDecorator decorator = new SimpleTalentDecorator();

    character = decorator.addTalent(character, talent);

    System.out.println("Talented character: \n" + character.toString());
  }

}

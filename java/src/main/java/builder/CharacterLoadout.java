package builder;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class CharacterLoadout {

  List<String> weapons;
  List<String> talents;
  List<String> grenades;

  public Builder toBuilder() {
    return new Builder(weapons, talents, grenades);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Loadout: \n");
    builder.append("Weapons: \n");
    weapons.forEach(w -> builder.append(w + "\n"));
    builder.append("Talents: \n");
    talents.forEach(t -> builder.append(t + "\n"));
    builder.append("Grenades: \n");
    grenades.forEach(g -> builder.append(g + "\n"));
    return builder.toString();
  }

  @NoArgsConstructor
  @AllArgsConstructor
  public static class Builder {

    private List<String> weapons = new ArrayList<>();
    private List<String> talents = new ArrayList<>();
    private List<String> grenades = new ArrayList<>();

    public Builder addGrenade(String grenade) {
      grenades.add(grenade);
      return this;
    }

    public Builder addWeapon(String weapon) {
      weapons.add(weapon);
      return this;
    }

    public Builder addTalent(String talent) {
      talents.add(talent);
      return this;
    }

    CharacterLoadout build() {
      return new CharacterLoadout(weapons, talents, grenades);
    }
  }

}

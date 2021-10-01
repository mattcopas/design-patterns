package builder;

public class BuilderApplication {

  public static void main(String[] args) {
    CharacterLoadout loadout = new CharacterLoadout.Builder()
        .addGrenade("Grenade 1")
        .addTalent("Talent 1")
        .addWeapon("Weapon 1")
        .build();

    System.out.println(loadout.toString());


    CharacterLoadout biggierLoadout = loadout.toBuilder().
        addWeapon("Weapon 2")
        .addGrenade("Grenade 2")
        .addTalent("Talent 2")
        .build();

    System.out.println(biggierLoadout.toString());
  }

}

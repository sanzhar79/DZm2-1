import java.util.Arrays;

public class Adventurer {
    private String name;
    private String position;
    private int health;
    private int level;
    private PassiveSkills skill;
    private Occupation occupation;


    public Adventurer(String name, String position, int health, int level, PassiveSkills skill, Occupation occupation) {
        this.name = name;
        this.position = position;
        this.health = health;
        this.level = level;
        this.skill = skill;
        this.occupation =occupation;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public PassiveSkills getSkill() {
        return skill;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public String getInfo() {
        return "Name:" + name +
                "\nPosition: " + position +
                "\nHealth: " + health +
                "\nLevel: " + level+
                "\nSkill: " + skill+
                "\nOccupation: "+occupation;
    }
}

public class Hero extends Adventurer {

    private String name;
    private String position;
    private int health;
    private int level;
    private PassiveSkills skill;

    private Occupation occupation;

    public Hero(String name, String position, int health, int level, PassiveSkills skill, Occupation occupation) {
        super(name, position, health, level, skill, occupation);
        this.name = name;
        this.position = position;
        this.health = health;
        this.level = level;
        this.skill = skill;
        this.occupation =occupation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public PassiveSkills getSkill() {
        return skill;
    }

    @Override
    public Occupation getOccupation() {
        return occupation;
    }

    public final void makeAction(){
        System.out.println(name + " использует навык скрытности");
    }
    public void makeAction(String action) {
        System.out.println(name + action);
    }

    public String getInfo() {
        return "Name:" + name +
                "\nPosition: " + position +
                "\nHealth: " + health +
                "\nLevel: " + level +
                "\nSkill: " + skill +
                "\nOccupation: " + occupation;
    }
}
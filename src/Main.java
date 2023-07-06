import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //объект класса 1го уровня иерархии

        Adventurer adventurer= new Adventurer(" RUDEUS"," TRAVELER",200,1,PassiveSkills.Valor, new Occupation(" KNIGHT"));

        //объект класса 2го уровня иерархии

        Hero hero=new Hero(" ARTHAS", " KING OF THE DEATH", 1000, 50, PassiveSkills.Perception,new Occupation(" LICH KING"));

        //объект класса 3го уровня иерархии()

        //OBJECT 1

        Legend legend1=new Legend(" Al'AKIR","ELEMENTAL", 7500, 95, PassiveSkills.BlessingOfTheGods, new Occupation("GOD OF THE WIND"));

        //OBJECT 2

        Legend legend2=new Legend(" RAGNAROS", "ELEMENTAL", 9200, 99, PassiveSkills.Immortality, new Occupation("GOD OF THE FLAME"));

        // вывод всех свойств объектов

        System.out.println(adventurer.getInfo());
        System.out.println(hero.getInfo());
        System.out.println(legend1.getInfo());
        System.out.println(legend2.getInfo());

        //перегрузкам методов
        hero.makeAction();
        hero.makeAction(" использует навык безумия");
    }
}
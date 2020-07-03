package day01.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 20:23
 **/

public class Monster {
    private Integer blood;
    private Integer level;

    public Monster(Integer level) {
        super();
        this.level = level;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "blood=" + blood +
                ", level=" + level +
                '}';
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

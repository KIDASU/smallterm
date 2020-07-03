package day01.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 20:23
 **/

public class Hero {
    private Integer exp;
    private Integer level;
    private Integer harm;

    public Monster attack(Monster monster){
        monster.setBlood(monster.getBlood()-this.harm);
        return monster;
    }

    public Hero(Integer exp, Integer level, Integer harm) {
        super();
        this.exp = exp;
        this.level = level;
        this.harm = harm;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "exp=" + exp +
                ", level=" + level +
                ", harm=" + harm +
                '}';
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHarm() {
        return harm;
    }

    public void setHarm(Integer harm) {
        this.harm = harm;
    }
}

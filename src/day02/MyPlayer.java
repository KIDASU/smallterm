package day02;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 21:08
 **/

public class MyPlayer implements AudioPlayer,Mp4Player{

    public static void main(String[] args) {
        MyPlayer myPlayer = new MyPlayer();
        myPlayer.play("123.mp3");
        myPlayer.playMp4("123.mp4");
    }


    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

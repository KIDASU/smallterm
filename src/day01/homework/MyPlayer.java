package day01.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 21:08
 **/

public class MyPlayer {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("mp3", "beyond the horizon.mp3");
        audioPlayer.play();
        Mp4Player mp4Player=new Mp4Player("mp4", "alone.mp4");
        mp4Player.playMp4();
        mp4Player.play();
    }


}

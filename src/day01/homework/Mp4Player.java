package day01.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 21:07
 **/

public class Mp4Player extends AudioPlayer{

    public Mp4Player(String audioType, String fileName) {
        super(audioType, fileName);
    }

    public void playMp4() {

        if(super.audioType.equalsIgnoreCase("mp4")){
            System.out.println("Playing mp4 file. Name: "+ fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }


}

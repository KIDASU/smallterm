package day01.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-22 20:51
 **/

public class AudioPlayer {
    protected String audioType;
    protected String fileName;
    public void play() {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }

    public AudioPlayer(String audioType, String fileName) {
        super();
        this.audioType = audioType;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "AudioPlayer{" +
                "audioType='" + audioType + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

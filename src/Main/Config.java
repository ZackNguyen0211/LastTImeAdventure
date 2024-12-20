package Main;

import java.io.*;

public class Config {
    GamePanel gp;
    public Config(GamePanel gp){
        this.gp = gp;
    }
    public void saveConfig(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/config.txt"));

            //Music
            bw.write(String.valueOf(gp.music.volumeScale));
            bw.newLine();
            //SE
            bw.write(String.valueOf(gp.se.volumeScale));
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadConfig(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/config.txt"));

            //Music
            String s = br.readLine();
            gp.music.volumeScale = Integer.parseInt(s);

            //SE
            s = br.readLine();
            gp.se.volumeScale = Integer.parseInt(s);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
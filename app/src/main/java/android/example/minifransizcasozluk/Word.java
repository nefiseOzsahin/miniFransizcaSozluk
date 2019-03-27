package android.example.minifransizcasozluk;

public class Word {

    private String fransizca;
    private String turkce;
    private int image;
    private int music;

    public Word(String fransizca, String turkce, int color, int music) {
        this.fransizca = fransizca;
        this.turkce = turkce;
        this.image = color;
        this.music = music;
    }

    public String getFransizca() {
        return fransizca;
    }

    public void setFransizca(String fransizca) {
        this.fransizca = fransizca;
    }

    public String getTurkce() {
        return turkce;
    }

    public void setTurkce(String turkce) {
        this.turkce = turkce;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int color) {
        this.image = color;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }
}

public class SmartTv {

    // Atributos
    private boolean status = false;
    private int channel = 1;
    private int volume = 50;

    // Métodos
    public int getChannel() {
        return this.channel;
    }

    public int setChannel() {
        int newChannel = ++this.channel;
        return newChannel;
    }

    public int moreVolume() {
        int newChannel = ++this.volume;
        return newChannel;
    }

    public int lessVolume() {
        int newChannel = --this.channel;
        return newChannel;
    }

    public boolean onTv() {
        return this.status = true;
    }

    public boolean offTv() {
        return this.status = false;
    }

    public String startTv() {
        return this.status == true ? "Ligada" : "Desligada";
    }

}

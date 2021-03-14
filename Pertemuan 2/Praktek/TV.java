public class TV {
    int channel = 0;
    int volumeLevel = 0;
    boolean on = false;

    public TV() {
    }

    public void nyalakan() {
        on = true;
    }

    public void matikan() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 0 && newChannel <= 19) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 150) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 19) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 0) {
            channel--;
        }
    }

    public void volumeBesar() {
        if (on && volumeLevel < 150) {
            volumeLevel++;
        }
    }

    public void volumeKecil() {
        if (on && volumeLevel > 0) {
            volumeLevel--;
        }
    }
}
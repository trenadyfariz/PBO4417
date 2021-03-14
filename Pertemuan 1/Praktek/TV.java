public class TV {
    int channel = 0; // Default channel is 0
    int volumeLevel = 0; // Default volume level is 0

    public TV() {
    }

    public void TurnOn() {
        on = true;
    }

    public void TurnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 0 && newChannel <= 19) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 0 && newVolumeLevel <= 150) {
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

    public void volumeUp() {
        if (on && volumeLevel < 150) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 0) {
            volumeLevel--;
        }
    }
}
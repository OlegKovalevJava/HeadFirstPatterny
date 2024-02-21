package org.example.pattern6COMMAND;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.on();

        stereo.setVolume(11);
    }
}

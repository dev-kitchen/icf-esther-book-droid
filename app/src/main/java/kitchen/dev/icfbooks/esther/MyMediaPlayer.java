package kitchen.dev.icfbooks.esther;

import android.widget.MediaController;

import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.LibVLC;

/**
 * Created by noc on 27.08.16.
 */
public class MyMediaPlayer extends MediaPlayer implements MediaController.MediaPlayerControl {

    public MyMediaPlayer(LibVLC lib){
        super(lib);
    }

    @Override
    public void start() {
        play();
    }

    @Override
    public int getDuration() {
        return (int) getLength();
    }

    @Override
    public int getCurrentPosition() {
        float pos = getPosition();
        return (int)(pos * getDuration());
    }

    @Override
    public void seekTo(int i) {
        setPosition((float) i/getDuration());
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return true;
    }

    @Override
    public boolean canSeekBackward() {
        return true;
    }

    @Override
    public boolean canSeekForward() {
        return true;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }
}

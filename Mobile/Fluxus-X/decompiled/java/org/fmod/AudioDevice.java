package org.fmod;

import android.media.AudioTrack;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class AudioDevice {
    private AudioTrack mTrack = null;

    private int fetchChannelConfigFromCount(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 6) {
            return 252;
        }
        return i10 == 8 ? 6396 : 0;
    }

    public void close() {
        try {
            this.mTrack.stop();
        } catch (IllegalStateException unused) {
            Log.e("fmod", "AudioDevice::init : AudioTrack stop caused IllegalStateException");
        }
        this.mTrack.release();
        this.mTrack = null;
    }

    public boolean init(int i10, int i11, int i12, int i13) {
        int iFetchChannelConfigFromCount = fetchChannelConfigFromCount(i10);
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iFetchChannelConfigFromCount, 2);
        if (minBufferSize < 0) {
            Log.w("fmod", "AudioDevice::init : Couldn't query minimum buffer size, possibly unsupported sample rate or channel count");
        } else {
            Log.i("fmod", "AudioDevice::init : Min buffer size: " + minBufferSize + " bytes");
        }
        int i14 = i12 * i13 * i10 * 2;
        int i15 = i14 > minBufferSize ? i14 : minBufferSize;
        Log.i("fmod", "AudioDevice::init : Actual buffer size: " + i15 + " bytes");
        try {
            AudioTrack audioTrack = new AudioTrack(3, i11, iFetchChannelConfigFromCount, 2, i15, 1);
            this.mTrack = audioTrack;
            try {
                audioTrack.play();
                return true;
            } catch (IllegalStateException unused) {
                Log.e("fmod", "AudioDevice::init : AudioTrack play caused IllegalStateException");
                this.mTrack.release();
                this.mTrack = null;
                return false;
            }
        } catch (IllegalArgumentException unused2) {
            Log.e("fmod", "AudioDevice::init : AudioTrack creation caused IllegalArgumentException");
            return false;
        }
    }

    public void write(byte[] bArr, int i10) {
        this.mTrack.write(bArr, 0, i10);
    }
}

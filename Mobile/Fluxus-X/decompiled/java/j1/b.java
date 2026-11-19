package j1;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i10) {
        return audioRecord.getTimestamp(audioTimestamp, i10);
    }
}

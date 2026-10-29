package p205j1;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7015b {
    /* JADX INFO: renamed from: a */
    public static int m29696a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    /* JADX INFO: renamed from: b */
    public static int m29697b(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i10) {
        return audioRecord.getTimestamp(audioTimestamp, i10);
    }
}

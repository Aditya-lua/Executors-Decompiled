package p205j1;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: j1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7017d {
    /* JADX INFO: renamed from: a */
    public static AudioRecordingConfiguration m29699a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m29700b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    /* JADX INFO: renamed from: c */
    public static void m29701c(AudioRecord audioRecord, Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    /* JADX INFO: renamed from: d */
    public static void m29702d(AudioRecord audioRecord, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}

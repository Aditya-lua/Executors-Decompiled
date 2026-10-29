package j1;

import android.media.AudioFormat;
import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static AudioRecord a(AudioRecord.Builder builder) {
        return builder.build();
    }

    public static AudioRecord.Builder b() {
        return new AudioRecord.Builder();
    }

    public static void c(AudioRecord.Builder builder, AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void d(AudioRecord.Builder builder, int i10) {
        builder.setAudioSource(i10);
    }

    public static void e(AudioRecord.Builder builder, int i10) {
        builder.setBufferSizeInBytes(i10);
    }
}

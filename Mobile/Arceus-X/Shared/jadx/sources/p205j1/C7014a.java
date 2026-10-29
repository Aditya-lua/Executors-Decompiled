package p205j1;

import android.media.AudioFormat;
import android.media.AudioRecord;

/* JADX INFO: renamed from: j1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7014a {
    /* JADX INFO: renamed from: a */
    public static AudioRecord m29691a(AudioRecord.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static AudioRecord.Builder m29692b() {
        return new AudioRecord.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static void m29693c(AudioRecord.Builder builder, AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    /* JADX INFO: renamed from: d */
    public static void m29694d(AudioRecord.Builder builder, int i10) {
        builder.setAudioSource(i10);
    }

    /* JADX INFO: renamed from: e */
    public static void m29695e(AudioRecord.Builder builder, int i10) {
        builder.setBufferSizeInBytes(i10);
    }
}

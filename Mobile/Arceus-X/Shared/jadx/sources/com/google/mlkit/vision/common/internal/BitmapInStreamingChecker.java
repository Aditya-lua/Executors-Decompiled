package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p305n9.C8935g;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapInStreamingChecker {
    private static final C8935g zza = new C8935g("StreamingFormatChecker", "");
    private final LinkedList zzb = new LinkedList();
    private long zzc = -1;

    public void check(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.zzb.add(Long.valueOf(jElapsedRealtime));
        if (this.zzb.size() > 5) {
            this.zzb.removeFirst();
        }
        if (this.zzb.size() != 5 || jElapsedRealtime - ((Long) C8953m.m36047l((Long) this.zzb.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.zzc;
        if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.zzc = jElapsedRealtime;
            zza.m36008h("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}

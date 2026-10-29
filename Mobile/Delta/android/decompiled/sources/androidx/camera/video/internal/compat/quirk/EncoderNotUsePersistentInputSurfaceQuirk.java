package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1400a = Arrays.asList("SM-N9208", "SM-G920V");

    public static boolean g() {
        return f1400a.contains(Build.MODEL.toUpperCase());
    }
}

package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1825a = Arrays.asList("SM-N9208", "SM-G920V");

    /* JADX INFO: renamed from: g */
    public static boolean m2279g() {
        return f1825a.contains(Build.MODEL.toUpperCase());
    }
}

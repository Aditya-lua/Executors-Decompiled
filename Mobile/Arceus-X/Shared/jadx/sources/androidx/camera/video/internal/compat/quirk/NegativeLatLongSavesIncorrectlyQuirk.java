package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2315g() {
        return Build.VERSION.SDK_INT < 34;
    }
}

package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import f1.x;
import n0.o0;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    private static boolean g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return g();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean c(o0 o0Var, x xVar) {
        return g() && o0Var.i() == 0 && xVar == x.f16050a;
    }
}

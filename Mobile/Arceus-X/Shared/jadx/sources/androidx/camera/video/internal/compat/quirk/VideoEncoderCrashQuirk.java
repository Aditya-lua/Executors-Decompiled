package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p115f1.C5306x;
import p296n0.InterfaceC8799o0;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    /* JADX INFO: renamed from: g */
    private static boolean m2340g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2341h() {
        return m2340g();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: c */
    public boolean mo2288c(InterfaceC8799o0 interfaceC8799o0, C5306x c5306x) {
        return m2340g() && interfaceC8799o0.mo26583i() == 0 && c5306x == C5306x.f20629a;
    }
}

package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001a0.C0008c0;
import p296n0.InterfaceC8758g3;
import p589z.C13658y;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: b */
    public static final List<String> f1758b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a */
    public final C0008c0 f1759a;

    public TorchFlashRequiredFor3aUpdateQuirk(C0008c0 c0008c0) {
        this.f1759a = c0008c0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2151g(C0008c0 c0008c0) {
        return m2152h() && m2154k(c0008c0);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m2152h() {
        Iterator<String> it = f1758b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2153i(C0008c0 c0008c0) {
        return Build.VERSION.SDK_INT >= 28 && C13658y.m49748R(c0008c0, 5) == 5;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2154k(C0008c0 c0008c0) {
        return ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2155l(C0008c0 c0008c0) {
        return m2151g(c0008c0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m2156j() {
        return !m2153i(this.f1759a);
    }
}

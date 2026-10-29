package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n0.g3;
import z.y;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements g3 {
    public static final List<String> b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f1346a;

    public TorchFlashRequiredFor3aUpdateQuirk(c0 c0Var) {
        this.f1346a = c0Var;
    }

    public static boolean g(c0 c0Var) {
        return h() && k(c0Var);
    }

    private static boolean h() {
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(c0 c0Var) {
        return Build.VERSION.SDK_INT >= 28 && y.R(c0Var, 5) == 5;
    }

    public static boolean k(c0 c0Var) {
        return ((Integer) c0Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static boolean l(c0 c0Var) {
        return g(c0Var);
    }

    public boolean j() {
        return !i(this.f1346a);
    }
}

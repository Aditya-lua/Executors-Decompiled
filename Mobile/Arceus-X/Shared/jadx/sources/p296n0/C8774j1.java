package p296n0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p140g0.C5931r1;
import p140g0.C5945v;

/* JADX INFO: renamed from: n0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8774j1 {

    /* JADX INFO: renamed from: a */
    public static final C5945v f31916a = new C5945v.a().m26634b(2).m26633a();

    /* JADX INFO: renamed from: n0.j1$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m35221a(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: n0.j1$b */
    public static class b extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f31917a;

        public b(String str, int i10, Throwable th2) {
            super(str, th2);
            this.f31917a = i10;
        }

        /* JADX INFO: renamed from: a */
        public int m35222a() {
            return this.f31917a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m35220a(Context context, C8738d1 c8738d1, C5945v c5945v) throws b {
        Integer numM26629d;
        if (Build.VERSION.SDK_INT >= 34 && a.m35221a(context) != 0) {
            C5931r1.m26561a("CameraValidator", "Virtual device with ID: " + a.m35221a(context) + " has " + c8738d1.m35040m().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e10 = null;
        if (c5945v != null) {
            try {
                numM26629d = c5945v.m26629d();
                if (numM26629d == null) {
                    C5931r1.m26572l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                C5931r1.m26564d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            numM26629d = null;
        }
        C5931r1.m26561a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numM26629d);
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c5945v == null || numM26629d.intValue() == 1)) {
                C5945v.f22638d.m26632g(c8738d1.m35040m());
                i10 = 1;
            }
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            C5931r1.m26573m("CameraValidator", "Camera LENS_FACING_BACK verification failed", e10);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c5945v == null || numM26629d.intValue() == 0)) {
                C5945v.f22637c.m26632g(c8738d1.m35040m());
                i10++;
            }
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            C5931r1.m26573m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e10);
        }
        try {
            f31916a.m26632g(c8738d1.m35040m());
            C5931r1.m26561a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (e10 == null) {
            return;
        }
        C5931r1.m26563c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c8738d1.m35040m());
        throw new b("Expected camera missing from device.", i10, e10);
    }
}

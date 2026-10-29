package n0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0.v f24705a = new g0.v.a().b(2).a();

    public static class a {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24706a;

        public b(String str, int i10, Throwable th2) {
            super(str, th2);
            this.f24706a = i10;
        }

        public int a() {
            return this.f24706a;
        }
    }

    public static void a(Context context, d1 d1Var, g0.v vVar) throws b {
        Integer numD;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            g0.r1.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + d1Var.m().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e10 = null;
        if (vVar != null) {
            try {
                numD = vVar.d();
                if (numD == null) {
                    g0.r1.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                g0.r1.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            numD = null;
        }
        g0.r1.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (vVar == null || numD.intValue() == 1)) {
                g0.v.f17534d.g(d1Var.m());
                i10 = 1;
            }
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            g0.r1.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", e10);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (vVar == null || numD.intValue() == 0)) {
                g0.v.f17533c.g(d1Var.m());
                i10++;
            }
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            g0.r1.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e10);
        }
        try {
            f24705a.g(d1Var.m());
            g0.r1.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (e10 == null) {
            return;
        }
        g0.r1.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + d1Var.m());
        throw new b("Expected camera missing from device.", i10, e10);
    }
}

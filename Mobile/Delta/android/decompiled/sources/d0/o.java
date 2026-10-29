package d0;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import n0.o3;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f14259a = new Rational(16, 9);

    public static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, o3.b bVar) {
        if (((PreviewPixelHDRnetQuirk) c0.e.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f14259a)) {
            return;
        }
        y.a.C0647a c0647a = new y.a.C0647a();
        c0647a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0647a.b());
    }
}

package p063d0;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import p036c0.C1500e;
import p296n0.C8802o3;
import p561y.C12964a;

/* JADX INFO: renamed from: d0.o */
/* JADX INFO: loaded from: classes.dex */
public class C4384o {

    /* JADX INFO: renamed from: a */
    public static final Rational f18240a = new Rational(16, 9);

    /* JADX INFO: renamed from: a */
    public static boolean m22049a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    /* JADX INFO: renamed from: b */
    public static void m22050b(Size size, C8802o3.b bVar) {
        if (((PreviewPixelHDRnetQuirk) C1500e.m7653b(PreviewPixelHDRnetQuirk.class)) == null || m22049a(size, f18240a)) {
            return;
        }
        C12964a.a aVar = new C12964a.a();
        aVar.m48221f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.m35322g(aVar.m48218b());
    }
}

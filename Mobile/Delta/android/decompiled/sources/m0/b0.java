package m0;

import android.graphics.Rect;
import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements x0.a0<a, x0.b0<byte[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.d f23573a;

    public static abstract class a {
        public static a c(x0.b0<androidx.camera.core.d> b0Var, int i10) {
            return new d(b0Var, i10);
        }

        public abstract int a();

        public abstract x0.b0<androidx.camera.core.d> b();
    }

    public b0(k3 k3Var) {
        this.f23573a = new v0.d(k3Var);
    }

    public static p0.g b(byte[] bArr) throws g0.h1 {
        try {
            return p0.g.k(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new g0.h1(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<byte[]> apply(a aVar) {
        x0.b0<byte[]> b0VarD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                b0VarD = c(aVar, iE);
            } else {
                b0VarD = d(aVar);
            }
            aVar.b().c().close();
            return b0VarD;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }

    public final x0.b0<byte[]> c(a aVar, int i10) {
        x0.b0<androidx.camera.core.d> b0VarB = aVar.b();
        byte[] bArrA = this.f23573a.a(b0VarB.c());
        p0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        return x0.b0.m(bArrA, gVarD, i10, b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }

    public final x0.b0<byte[]> d(a aVar) throws g0.h1 {
        x0.b0<androidx.camera.core.d> b0VarB = aVar.b();
        androidx.camera.core.d dVarC = b0VarB.c();
        Rect rectB = b0VarB.b();
        try {
            byte[] bArrN = w0.b.n(dVarC, rectB, aVar.a(), b0VarB.f());
            return x0.b0.m(bArrN, b(bArrN), Barcode.FORMAT_QR_CODE, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b0VarB.f(), p0.a0.v(b0VarB.g(), rectB), b0VarB.a());
        } catch (w0.b.a e10) {
            throw new g0.h1(1, "Failed to encode the image to JPEG.", e10);
        }
    }
}

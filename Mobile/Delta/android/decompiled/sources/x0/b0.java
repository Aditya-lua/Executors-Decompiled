package x0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0<T> {
    public static b0<Bitmap> j(Bitmap bitmap, p0.g gVar, Rect rect, int i10, Matrix matrix, n0.e0 e0Var) {
        return new b(bitmap, gVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, e0Var);
    }

    public static b0<androidx.camera.core.d> k(androidx.camera.core.d dVar, p0.g gVar, Rect rect, int i10, Matrix matrix, n0.e0 e0Var) {
        return l(dVar, gVar, new Size(dVar.getWidth(), dVar.getHeight()), rect, i10, matrix, e0Var);
    }

    public static b0<androidx.camera.core.d> l(androidx.camera.core.d dVar, p0.g gVar, Size size, Rect rect, int i10, Matrix matrix, n0.e0 e0Var) {
        if (w0.b.j(dVar.getFormat())) {
            x2.g.h(gVar, "JPEG image must have Exif.");
        }
        return new b(dVar, gVar, dVar.getFormat(), size, rect, i10, matrix, e0Var);
    }

    public static b0<byte[]> m(byte[] bArr, p0.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, n0.e0 e0Var) {
        return new b(bArr, gVar, i10, size, rect, i11, matrix, e0Var);
    }

    public abstract n0.e0 a();

    public abstract Rect b();

    public abstract T c();

    public abstract p0.g d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return p0.a0.h(b(), h());
    }
}

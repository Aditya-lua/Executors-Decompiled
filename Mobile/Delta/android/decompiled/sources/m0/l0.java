package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements x0.a0<u0.b, x0.b0<androidx.camera.core.d>> {
    public static x0.b0<androidx.camera.core.d> b(v0 v0Var, p0.g gVar, androidx.camera.core.d dVar) {
        return x0.b0.k(dVar, gVar, v0Var.b(), v0Var.f(), v0Var.h(), d(dVar));
    }

    public static x0.b0<androidx.camera.core.d> c(v0 v0Var, p0.g gVar, androidx.camera.core.d dVar) {
        Size size = new Size(dVar.getWidth(), dVar.getHeight());
        int iF = v0Var.f() - gVar.s();
        Size sizeE = e(iF, size);
        Matrix matrixD = p0.a0.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return x0.b0.l(dVar, gVar, sizeE, f(v0Var.b(), matrixD), gVar.s(), g(v0Var.h(), matrixD), d(dVar));
    }

    public static n0.e0 d(androidx.camera.core.d dVar) {
        return dVar.H2() instanceof s0.c ? ((s0.c) dVar.H2()).f() : n0.e0.a.k();
    }

    public static Size e(int i10, Size size) {
        return p0.a0.i(p0.a0.w(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<androidx.camera.core.d> apply(u0.b bVar) throws g0.h1 {
        p0.g gVarJ;
        androidx.camera.core.d dVarA = bVar.a();
        v0 v0VarB = bVar.b();
        if (w0.b.j(dVarA.getFormat())) {
            try {
                gVarJ = p0.g.j(dVarA);
                dVarA.H1()[0].k().rewind();
            } catch (IOException e10) {
                throw new g0.h1(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            gVarJ = null;
        }
        if (!d0.f23579g.b(dVarA)) {
            return b(v0VarB, gVarJ, dVarA);
        }
        x2.g.h(gVarJ, "JPEG image must have exif.");
        return c(v0VarB, gVarJ, dVarA);
    }
}

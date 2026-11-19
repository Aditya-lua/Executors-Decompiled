package m0;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import g0.n1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements x0.a0<x0.b0<androidx.camera.core.d>, Bitmap> {
    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(x0.b0<androidx.camera.core.d> b0Var) throws Throwable {
        androidx.camera.core.f fVar;
        Bitmap bitmapM;
        androidx.camera.core.f fVar2 = null;
        try {
            try {
                int iE = b0Var.e();
                if (iE == 35) {
                    androidx.camera.core.d dVarC = b0Var.c();
                    boolean z10 = b0Var.f() % 180 != 0;
                    fVar = new androidx.camera.core.f(n1.a(z10 ? dVarC.getHeight() : dVarC.getWidth(), z10 ? dVarC.getWidth() : dVarC.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.d dVarG = ImageProcessingUtil.g(dVarC, fVar, ByteBuffer.allocateDirect(dVarC.getWidth() * dVarC.getHeight() * 4), b0Var.f(), false);
                        dVarC.close();
                        if (dVarG == null) {
                            throw new g0.h1(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapM = w0.b.b(dVarG);
                        dVarG.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new g0.h1(0, "Can't convert " + (b0Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        fVar2 = fVar;
                        if (fVar2 != null) {
                            fVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b0Var.e());
                    }
                    androidx.camera.core.d dVarC2 = b0Var.c();
                    Bitmap bitmapB = w0.b.b(dVarC2);
                    dVarC2.close();
                    fVar = null;
                    bitmapM = w0.b.m(bitmapB, b0Var.f());
                }
                if (fVar != null) {
                    fVar.close();
                }
                return bitmapM;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

package m0;

import androidx.camera.core.ImageProcessingUtil;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.n1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements x0.a0<x0.b0<byte[]>, x0.b0<androidx.camera.core.d>> {
    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<androidx.camera.core.d> apply(x0.b0<byte[]> b0Var) {
        androidx.camera.core.f fVar = new androidx.camera.core.f(n1.a(b0Var.h().getWidth(), b0Var.h().getHeight(), Barcode.FORMAT_QR_CODE, 2));
        androidx.camera.core.d dVarE = ImageProcessingUtil.e(fVar, b0Var.c());
        fVar.j();
        Objects.requireNonNull(dVarE);
        p0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return x0.b0.k(dVarE, gVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}

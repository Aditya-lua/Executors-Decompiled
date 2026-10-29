package m0;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l implements x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.y f23618a;

    public l(x0.y yVar) {
        this.f23618a = yVar;
    }

    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<Bitmap> apply(x0.b0<Bitmap> b0Var) {
        androidx.camera.core.d dVarA = this.f23618a.c(new x0.v(new z0(b0Var), 1)).a();
        Objects.requireNonNull(dVarA);
        Bitmap bitmapD = w0.b.d(dVarA.H1(), dVarA.getWidth(), dVarA.getHeight());
        p0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return x0.b0.j(bitmapD, gVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}

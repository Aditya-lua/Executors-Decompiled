package z;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f38609a;
    public final t3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f38610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38611d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Integer> f38612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.c f38613f;

    public s3(y yVar, a0.c0 c0Var, Executor executor) {
        this.f38609a = yVar;
        this.b = new t3(c0Var, 0);
        this.f38610c = executor;
    }

    public final void a() {
        y1.c.a<Integer> aVar = this.f38612e;
        if (aVar != null) {
            aVar.f(new g0.m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f38612e = null;
        }
        y.c cVar = this.f38613f;
        if (cVar != null) {
            this.f38609a.g0(cVar);
            this.f38613f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f38611d) {
            return;
        }
        this.f38611d = z10;
        if (z10) {
            return;
        }
        this.b.b(0);
        a();
    }

    public void c(y.a.C0758a c0758a) {
        c0758a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.b.a()), n0.n1.c.REQUIRED);
    }
}

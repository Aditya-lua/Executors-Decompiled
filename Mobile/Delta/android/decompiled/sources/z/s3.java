package z;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f36809a;
    public final t3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f36810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36811d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Integer> f36812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.c f36813f;

    public s3(y yVar, a0.c0 c0Var, Executor executor) {
        this.f36809a = yVar;
        this.b = new t3(c0Var, 0);
        this.f36810c = executor;
    }

    public final void a() {
        y1.c.a<Integer> aVar = this.f36812e;
        if (aVar != null) {
            aVar.f(new g0.m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f36812e = null;
        }
        y.c cVar = this.f36813f;
        if (cVar != null) {
            this.f36809a.g0(cVar);
            this.f36813f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f36811d) {
            return;
        }
        this.f36811d = z10;
        if (z10) {
            return;
        }
        this.b.b(0);
        a();
    }

    public void c(y.a.C0647a c0647a) {
        c0647a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.b.a()), n0.n1.c.REQUIRED);
    }
}

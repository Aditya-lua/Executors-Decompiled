package z;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f37504a;
    public final t3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37506d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Integer> f37507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.c f37508f;

    public s3(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37504a = yVar;
        this.b = new t3(c0Var, 0);
        this.f37505c = executor;
    }

    public final void a() {
        y1.c.a<Integer> aVar = this.f37507e;
        if (aVar != null) {
            aVar.f(new g0.m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f37507e = null;
        }
        y.c cVar = this.f37508f;
        if (cVar != null) {
            this.f37504a.g0(cVar);
            this.f37508f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f37506d) {
            return;
        }
        this.f37506d = z10;
        if (z10) {
            return;
        }
        this.b.b(0);
        a();
    }

    public void c(y.a.C0662a c0662a) {
        c0662a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.b.a()), n0.n1.c.REQUIRED);
    }
}

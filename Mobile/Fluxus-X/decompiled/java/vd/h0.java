package vd;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.d f34274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f34275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f34276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb.k f34277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f34278g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, tb.k kVar, int i10, c.d dVar, long j10, long j11, tb.k kVar2) {
        super(n0Var, kVar);
        this.f34274c = dVar;
        this.f34275d = j10;
        this.f34276e = j11;
        this.f34277f = kVar2;
        this.f34278g = n0Var;
    }

    @Override // ge.u0
    public final void b() {
        if (n0.j(this.f34278g)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f34278g, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f34278g;
            ((ge.l0) n0Var.f34309f.e()).p0(n0.a(n0Var, this.f34274c, this.f34275d, this.f34276e, 0), new k0(this.f34278g, this.f34277f, this.f34275d));
        } catch (RemoteException e10) {
            this.f34278g.f34305a.b(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f34274c.b(), this.f34274c.c(), Long.valueOf(this.f34275d));
            this.f34277f.d(new b(-100, e10));
        }
    }
}

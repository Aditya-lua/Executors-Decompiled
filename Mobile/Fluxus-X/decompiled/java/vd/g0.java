package vd;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f34270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb.k f34271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f34272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, tb.k kVar, int i10, long j10, tb.k kVar2) {
        super(n0Var, kVar);
        this.f34270c = j10;
        this.f34271d = kVar2;
        this.f34272e = n0Var;
    }

    @Override // ge.u0
    public final void b() {
        if (n0.j(this.f34272e)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f34272e, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f34272e;
            ((ge.l0) n0Var.f34309f.e()).c0(n0.b(n0Var, this.f34270c, 0), new l0(this.f34272e, this.f34271d));
        } catch (RemoteException e10) {
            this.f34272e.f34305a.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f34270c));
            this.f34271d.d(new b(-100, e10));
        }
    }
}

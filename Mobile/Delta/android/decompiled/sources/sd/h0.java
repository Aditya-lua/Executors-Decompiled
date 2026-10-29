package sd;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.d f30631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb.k f30634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f30635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, sb.k kVar, int i10, c.d dVar, long j10, long j11, sb.k kVar2) {
        super(n0Var, kVar);
        this.f30631c = dVar;
        this.f30632d = j10;
        this.f30633e = j11;
        this.f30634f = kVar2;
        this.f30635g = n0Var;
    }

    @Override // de.u0
    public final void b() {
        if (n0.j(this.f30635g)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f30635g, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f30635g;
            ((de.l0) n0Var.f30666f.e()).G(n0.a(n0Var, this.f30631c, this.f30632d, this.f30633e, 0), new k0(this.f30635g, this.f30634f, this.f30632d));
        } catch (RemoteException e10) {
            this.f30635g.f30662a.b(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f30631c.b(), this.f30631c.c(), Long.valueOf(this.f30632d));
            this.f30634f.d(new b(-100, e10));
        }
    }
}

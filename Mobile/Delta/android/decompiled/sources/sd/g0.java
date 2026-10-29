package sd;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.k f30628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f30629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, sb.k kVar, int i10, long j10, sb.k kVar2) {
        super(n0Var, kVar);
        this.f30627c = j10;
        this.f30628d = kVar2;
        this.f30629e = n0Var;
    }

    @Override // de.u0
    public final void b() {
        if (n0.j(this.f30629e)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f30629e, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f30629e;
            ((de.l0) n0Var.f30666f.e()).y0(n0.b(n0Var, this.f30627c, 0), new l0(this.f30629e, this.f30628d));
        } catch (RemoteException e10) {
            this.f30629e.f30662a.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f30627c));
            this.f30628d.d(new b(-100, e10));
        }
    }
}

package td;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.k f32237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f32238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, sb.k kVar, int i10, long j10, sb.k kVar2) {
        super(n0Var, kVar);
        this.f32236c = j10;
        this.f32237d = kVar2;
        this.f32238e = n0Var;
    }

    @Override // ee.u0
    public final void b() {
        if (n0.j(this.f32238e)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f32238e, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f32238e;
            ((ee.l0) n0Var.f32275f.e()).L0(n0.b(n0Var, this.f32236c, 0), new l0(this.f32238e, this.f32237d));
        } catch (RemoteException e10) {
            this.f32238e.f32271a.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f32236c));
            this.f32237d.d(new b(-100, e10));
        }
    }
}

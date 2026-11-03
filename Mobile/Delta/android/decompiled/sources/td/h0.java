package td;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.d f32240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f32242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb.k f32243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f32244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, sb.k kVar, int i10, c.d dVar, long j10, long j11, sb.k kVar2) {
        super(n0Var, kVar);
        this.f32240c = dVar;
        this.f32241d = j10;
        this.f32242e = j11;
        this.f32243f = kVar2;
        this.f32244g = n0Var;
    }

    @Override // ee.u0
    public final void b() {
        if (n0.j(this.f32244g)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f32244g, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f32244g;
            ((ee.l0) n0Var.f32275f.e()).m1(n0.a(n0Var, this.f32240c, this.f32241d, this.f32242e, 0), new k0(this.f32244g, this.f32243f, this.f32241d));
        } catch (RemoteException e10) {
            this.f32244g.f32271a.b(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f32240c.b(), this.f32240c.c(), Long.valueOf(this.f32241d));
            this.f32243f.d(new b(-100, e10));
        }
    }
}

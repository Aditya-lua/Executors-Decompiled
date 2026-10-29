package zo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements ft.d<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f37936a;
    public final ft.i<zq.a.C0689a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<gp.w> f37937c;

    public l0(ft.i<Context> iVar, ft.i<zq.a.C0689a> iVar2, ft.i<gp.w> iVar3) {
        this.f37936a = iVar;
        this.b = iVar2;
        this.f37937c = iVar3;
    }

    public static l0 a(ft.i<Context> iVar, ft.i<zq.a.C0689a> iVar2, ft.i<gp.w> iVar3) {
        return new l0(iVar, iVar2, iVar3);
    }

    public static k0 c(Context context, zq.a.C0689a c0689a, gp.w wVar) {
        return new k0(context, c0689a, wVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f37936a.get(), this.b.get(), this.f37937c.get());
    }
}

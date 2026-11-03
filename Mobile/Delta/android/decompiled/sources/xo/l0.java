package xo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements dt.d<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f36059a;
    public final dt.i<xq.a.C0658a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<ep.w> f36060c;

    public l0(dt.i<Context> iVar, dt.i<xq.a.C0658a> iVar2, dt.i<ep.w> iVar3) {
        this.f36059a = iVar;
        this.b = iVar2;
        this.f36060c = iVar3;
    }

    public static l0 a(dt.i<Context> iVar, dt.i<xq.a.C0658a> iVar2, dt.i<ep.w> iVar3) {
        return new l0(iVar, iVar2, iVar3);
    }

    public static k0 c(Context context, xq.a.C0658a c0658a, ep.w wVar) {
        return new k0(context, c0658a, wVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f36059a.get(), this.b.get(), this.f36060c.get());
    }
}

package es;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements wt.d<k4.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<String[]>> f14342a;
    public final wt.i<g.d<String[]>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<Context> f14343c;

    public l4(wt.i<g.d<String[]>> iVar, wt.i<g.d<String[]>> iVar2, wt.i<Context> iVar3) {
        this.f14342a = iVar;
        this.b = iVar2;
        this.f14343c = iVar3;
    }

    public static l4 a(wt.i<g.d<String[]>> iVar, wt.i<g.d<String[]>> iVar2, wt.i<Context> iVar3) {
        return new l4(iVar, iVar2, iVar3);
    }

    public static k4.a c(g.d<String[]> dVar, g.d<String[]> dVar2, Context context) {
        return new k4.a(dVar, dVar2, context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k4.a get() {
        return c(this.f14342a.get(), this.b.get(), this.f14343c.get());
    }
}

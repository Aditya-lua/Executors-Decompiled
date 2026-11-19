package fq;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<g.i>> f16429a;
    public final wt.i<Context> b;

    public k(wt.i<g.d<g.i>> iVar, wt.i<Context> iVar2) {
        this.f16429a = iVar;
        this.b = iVar2;
    }

    public static k a(wt.i<g.d<g.i>> iVar, wt.i<Context> iVar2) {
        return new k(iVar, iVar2);
    }

    public static j c(g.d<g.i> dVar, Context context) {
        return new j(dVar, context);
    }

    public j b() {
        return c(this.f16429a.get(), this.b.get());
    }
}

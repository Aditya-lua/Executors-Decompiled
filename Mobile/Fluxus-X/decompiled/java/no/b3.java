package no;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements wt.d<y2.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<String[]>> f25920a;
    public final wt.i<g.d<g.j>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<Context> f25921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<er.c> f25922d;

    public b3(wt.i<g.d<String[]>> iVar, wt.i<g.d<g.j>> iVar2, wt.i<Context> iVar3, wt.i<er.c> iVar4) {
        this.f25920a = iVar;
        this.b = iVar2;
        this.f25921c = iVar3;
        this.f25922d = iVar4;
    }

    public static b3 a(wt.i<g.d<String[]>> iVar, wt.i<g.d<g.j>> iVar2, wt.i<Context> iVar3, wt.i<er.c> iVar4) {
        return new b3(iVar, iVar2, iVar3, iVar4);
    }

    public static y2.b c(g.d<String[]> dVar, g.d<g.j> dVar2, Context context, er.c cVar) {
        return new y2.b(dVar, dVar2, context, cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y2.b get() {
        return c(this.f25920a.get(), this.b.get(), this.f25921c.get(), this.f25922d.get());
    }
}

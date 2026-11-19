package vo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<String[]>> f34809a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<er.c> f34810c;

    public k(wt.i<g.d<String[]>> iVar, wt.i<Context> iVar2, wt.i<er.c> iVar3) {
        this.f34809a = iVar;
        this.b = iVar2;
        this.f34810c = iVar3;
    }

    public static k a(wt.i<g.d<String[]>> iVar, wt.i<Context> iVar2, wt.i<er.c> iVar3) {
        return new k(iVar, iVar2, iVar3);
    }

    public static j c(g.d<String[]> dVar, Context context, er.c cVar) {
        return new j(dVar, context, cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f34809a.get(), this.b.get(), this.f34810c.get());
    }
}

package go;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements dt.d<com.withpersona.sdk2.inquiry.governmentid.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<String[]>> f18673a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f18674c;

    public e(dt.i<g.c<String[]>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        this.f18673a = iVar;
        this.b = iVar2;
        this.f18674c = iVar3;
    }

    public static e a(dt.i<g.c<String[]>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.e c(g.c<String[]> cVar, Context context, oq.c cVar2) {
        return new com.withpersona.sdk2.inquiry.governmentid.e(cVar, context, cVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.e get() {
        return c(this.f18673a.get(), this.b.get(), this.f18674c.get());
    }
}

package io;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ft.d<com.withpersona.sdk2.inquiry.governmentid.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<String[]>> f20616a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qq.c> f20617c;

    public e(ft.i<g.c<String[]>> iVar, ft.i<Context> iVar2, ft.i<qq.c> iVar3) {
        this.f20616a = iVar;
        this.b = iVar2;
        this.f20617c = iVar3;
    }

    public static e a(ft.i<g.c<String[]>> iVar, ft.i<Context> iVar2, ft.i<qq.c> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.e c(g.c<String[]> cVar, Context context, qq.c cVar2) {
        return new com.withpersona.sdk2.inquiry.governmentid.e(cVar, context, cVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.e get() {
        return c(this.f20616a.get(), this.b.get(), this.f20617c.get());
    }
}

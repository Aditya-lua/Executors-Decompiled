package com.withpersona.sdk2.inquiry.document;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<i.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<String[]>> f10229a;
    public final ft.i<g.c<g.h>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<Context> f10230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<qq.c> f10231d;

    public j(ft.i<g.c<String[]>> iVar, ft.i<g.c<g.h>> iVar2, ft.i<Context> iVar3, ft.i<qq.c> iVar4) {
        this.f10229a = iVar;
        this.b = iVar2;
        this.f10230c = iVar3;
        this.f10231d = iVar4;
    }

    public static j a(ft.i<g.c<String[]>> iVar, ft.i<g.c<g.h>> iVar2, ft.i<Context> iVar3, ft.i<qq.c> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i.b c(g.c<String[]> cVar, g.c<g.h> cVar2, Context context, qq.c cVar3) {
        return new i.b(cVar, cVar2, context, cVar3);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i.b get() {
        return c(this.f10229a.get(), this.b.get(), this.f10230c.get(), this.f10231d.get());
    }
}

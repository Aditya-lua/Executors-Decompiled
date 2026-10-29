package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ft.d<h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<String[]>> f13893a;
    public final ft.i<g.c<String[]>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<Context> f13894c;

    public i(ft.i<g.c<String[]>> iVar, ft.i<g.c<String[]>> iVar2, ft.i<Context> iVar3) {
        this.f13893a = iVar;
        this.b = iVar2;
        this.f13894c = iVar3;
    }

    public static i a(ft.i<g.c<String[]>> iVar, ft.i<g.c<String[]>> iVar2, ft.i<Context> iVar3) {
        return new i(iVar, iVar2, iVar3);
    }

    public static h.a c(g.c<String[]> cVar, g.c<String[]> cVar2, Context context) {
        return new h.a(cVar, cVar2, context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.a get() {
        return c(this.f13893a.get(), this.b.get(), this.f13894c.get());
    }
}

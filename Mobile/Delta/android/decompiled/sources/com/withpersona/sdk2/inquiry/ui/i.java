package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements dt.d<h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<String[]>> f13974a;
    public final dt.i<g.c<String[]>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<Context> f13975c;

    public i(dt.i<g.c<String[]>> iVar, dt.i<g.c<String[]>> iVar2, dt.i<Context> iVar3) {
        this.f13974a = iVar;
        this.b = iVar2;
        this.f13975c = iVar3;
    }

    public static i a(dt.i<g.c<String[]>> iVar, dt.i<g.c<String[]>> iVar2, dt.i<Context> iVar3) {
        return new i(iVar, iVar2, iVar3);
    }

    public static h.a c(g.c<String[]> cVar, g.c<String[]> cVar2, Context context) {
        return new h.a(cVar, cVar2, context);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.a get() {
        return c(this.f13974a.get(), this.b.get(), this.f13975c.get());
    }
}

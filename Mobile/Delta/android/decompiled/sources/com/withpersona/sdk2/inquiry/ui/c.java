package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ft.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f13826a;
    public final ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qr.a.C0521a> f13827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<zq.a.C0689a> f13828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<h.a> f13829e;

    public c(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, ft.i<qr.a.C0521a> iVar3, ft.i<zq.a.C0689a> iVar4, ft.i<h.a> iVar5) {
        this.f13826a = iVar;
        this.b = iVar2;
        this.f13827c = iVar3;
        this.f13828d = iVar4;
        this.f13829e = iVar5;
    }

    public static c a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, ft.i<qr.a.C0521a> iVar3, ft.i<zq.a.C0689a> iVar4, ft.i<h.a> iVar5) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static a c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, qr.a.C0521a c0521a, zq.a.C0689a c0689a, h.a aVar2) {
        return new a(context, aVar, c0521a, c0689a, aVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f13826a.get(), this.b.get(), this.f13827c.get(), this.f13828d.get(), this.f13829e.get());
    }
}

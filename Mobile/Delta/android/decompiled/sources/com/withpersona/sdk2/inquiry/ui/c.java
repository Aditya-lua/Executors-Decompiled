package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements dt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13907a;
    public final dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<or.a.C0489a> f13908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<xq.a.C0658a> f13909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<h.a> f13910e;

    public c(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, dt.i<or.a.C0489a> iVar3, dt.i<xq.a.C0658a> iVar4, dt.i<h.a> iVar5) {
        this.f13907a = iVar;
        this.b = iVar2;
        this.f13908c = iVar3;
        this.f13909d = iVar4;
        this.f13910e = iVar5;
    }

    public static c a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, dt.i<or.a.C0489a> iVar3, dt.i<xq.a.C0658a> iVar4, dt.i<h.a> iVar5) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static a c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, or.a.C0489a c0489a, xq.a.C0658a c0658a, h.a aVar2) {
        return new a(context, aVar, c0489a, c0658a, aVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f13907a.get(), this.b.get(), this.f13908c.get(), this.f13909d.get(), this.f13910e.get());
    }
}

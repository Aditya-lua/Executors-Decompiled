package com.withpersona.sdk2.inquiry.document.network;

import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10448a;
    public final i<co.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<kq.a> f10449c;

    public h(i<zn.c> iVar, i<co.a> iVar2, i<kq.a> iVar3) {
        this.f10448a = iVar;
        this.b = iVar2;
        this.f10449c = iVar3;
    }

    public static h a(i<zn.c> iVar, i<co.a> iVar2, i<kq.a> iVar3) {
        return new h(iVar, iVar2, iVar3);
    }

    public static g.a c(zn.c cVar, co.a aVar, kq.a aVar2) {
        return new g.a(cVar, aVar, aVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.a get() {
        return c(this.f10448a.get(), this.b.get(), this.f10449c.get());
    }
}

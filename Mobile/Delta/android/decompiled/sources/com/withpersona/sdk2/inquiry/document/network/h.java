package com.withpersona.sdk2.inquiry.document.network;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ft.d<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<bo.c> f10367a;
    public final i<fo.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<mq.a> f10368c;

    public h(i<bo.c> iVar, i<fo.a> iVar2, i<mq.a> iVar3) {
        this.f10367a = iVar;
        this.b = iVar2;
        this.f10368c = iVar3;
    }

    public static h a(i<bo.c> iVar, i<fo.a> iVar2, i<mq.a> iVar3) {
        return new h(iVar, iVar2, iVar3);
    }

    public static g.a c(bo.c cVar, fo.a aVar, mq.a aVar2) {
        return new g.a(cVar, aVar, aVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.a get() {
        return c(this.f10367a.get(), this.b.get(), this.f10368c.get());
    }
}

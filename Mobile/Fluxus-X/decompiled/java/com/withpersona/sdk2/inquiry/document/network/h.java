package com.withpersona.sdk2.inquiry.document.network;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements wt.d<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<po.c> f10003a;
    public final i<so.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<ar.a> f10004c;

    public h(i<po.c> iVar, i<so.a> iVar2, i<ar.a> iVar3) {
        this.f10003a = iVar;
        this.b = iVar2;
        this.f10004c = iVar3;
    }

    public static h a(i<po.c> iVar, i<so.a> iVar2, i<ar.a> iVar3) {
        return new h(iVar, iVar2, iVar3);
    }

    public static g.a c(po.c cVar, so.a aVar, ar.a aVar2) {
        return new g.a(cVar, aVar, aVar2);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.a get() {
        return c(this.f10003a.get(), this.b.get(), this.f10004c.get());
    }
}

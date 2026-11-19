package com.withpersona.sdk2.inquiry.document.network;

import wt.i;
import xq.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<po.c> f9967a;
    public final i<k> b;

    public d(i<po.c> iVar, i<k> iVar2) {
        this.f9967a = iVar;
        this.b = iVar2;
    }

    public static d a(i<po.c> iVar, i<k> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c.a c(po.c cVar, k kVar) {
        return new c.a(cVar, kVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.a get() {
        return c(this.f9967a.get(), this.b.get());
    }
}

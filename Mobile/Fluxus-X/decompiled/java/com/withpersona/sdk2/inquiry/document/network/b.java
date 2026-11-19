package com.withpersona.sdk2.inquiry.document.network;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements wt.d<a.C0164a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<po.c> f9916a;

    public b(i<po.c> iVar) {
        this.f9916a = iVar;
    }

    public static b a(i<po.c> iVar) {
        return new b(iVar);
    }

    public static a.C0164a c(po.c cVar) {
        return new a.C0164a(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0164a get() {
        return c(this.f9916a.get());
    }
}

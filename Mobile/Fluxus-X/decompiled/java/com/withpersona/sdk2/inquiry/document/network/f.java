package com.withpersona.sdk2.inquiry.document.network;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<po.c> f9982a;

    public f(i<po.c> iVar) {
        this.f9982a = iVar;
    }

    public static f a(i<po.c> iVar) {
        return new f(iVar);
    }

    public static e.a c(po.c cVar) {
        return new e.a(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.a get() {
        return c(this.f9982a.get());
    }
}

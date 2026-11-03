package com.withpersona.sdk2.inquiry.document.network;

import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10427a;

    public f(i<zn.c> iVar) {
        this.f10427a = iVar;
    }

    public static f a(i<zn.c> iVar) {
        return new f(iVar);
    }

    public static e.a c(zn.c cVar) {
        return new e.a(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.a get() {
        return c(this.f10427a.get());
    }
}

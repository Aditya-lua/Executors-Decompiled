package com.withpersona.sdk2.inquiry.document.network;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<bo.c> f10346a;

    public f(i<bo.c> iVar) {
        this.f10346a = iVar;
    }

    public static f a(i<bo.c> iVar) {
        return new f(iVar);
    }

    public static e.a c(bo.c cVar) {
        return new e.a(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.a get() {
        return c(this.f10346a.get());
    }
}

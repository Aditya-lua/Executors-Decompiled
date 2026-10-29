package com.withpersona.sdk2.inquiry.document.network;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ft.d<a.C0179a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<bo.c> f10280a;

    public b(i<bo.c> iVar) {
        this.f10280a = iVar;
    }

    public static b a(i<bo.c> iVar) {
        return new b(iVar);
    }

    public static a.C0179a c(bo.c cVar) {
        return new a.C0179a(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0179a get() {
        return c(this.f10280a.get());
    }
}

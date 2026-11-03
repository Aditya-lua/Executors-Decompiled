package com.withpersona.sdk2.inquiry.document.network;

import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements dt.d<a.C0182a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10361a;

    public b(i<zn.c> iVar) {
        this.f10361a = iVar;
    }

    public static b a(i<zn.c> iVar) {
        return new b(iVar);
    }

    public static a.C0182a c(zn.c cVar) {
        return new a.C0182a(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0182a get() {
        return c(this.f10361a.get());
    }
}

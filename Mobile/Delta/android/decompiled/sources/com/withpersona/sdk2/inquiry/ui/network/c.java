package com.withpersona.sdk2.inquiry.ui.network;

import dt.d;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<or.c> f14084a;

    public c(i<or.c> iVar) {
        this.f14084a = iVar;
    }

    public static c a(i<or.c> iVar) {
        return new c(iVar);
    }

    public static b.a c(or.c cVar) {
        return new b.a(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f14084a.get());
    }
}

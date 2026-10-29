package com.withpersona.sdk2.inquiry.document.network;

import ft.i;
import jq.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<bo.c> f10331a;
    public final i<k> b;

    public d(i<bo.c> iVar, i<k> iVar2) {
        this.f10331a = iVar;
        this.b = iVar2;
    }

    public static d a(i<bo.c> iVar, i<k> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c.a c(bo.c cVar, k kVar) {
        return new c.a(cVar, kVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.a get() {
        return c(this.f10331a.get(), this.b.get());
    }
}

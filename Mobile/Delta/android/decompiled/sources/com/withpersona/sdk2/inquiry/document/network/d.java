package com.withpersona.sdk2.inquiry.document.network;

import dt.i;
import hq.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dt.d<c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10412a;
    public final i<k> b;

    public d(i<zn.c> iVar, i<k> iVar2) {
        this.f10412a = iVar;
        this.b = iVar2;
    }

    public static d a(i<zn.c> iVar, i<k> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c.a c(zn.c cVar, k kVar) {
        return new c.a(cVar, kVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.a get() {
        return c(this.f10412a.get(), this.b.get());
    }
}

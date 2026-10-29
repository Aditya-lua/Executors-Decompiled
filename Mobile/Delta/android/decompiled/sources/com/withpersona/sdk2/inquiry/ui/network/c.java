package com.withpersona.sdk2.inquiry.ui.network;

import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<qr.c> f14003a;

    public c(i<qr.c> iVar) {
        this.f14003a = iVar;
    }

    public static c a(i<qr.c> iVar) {
        return new c(iVar);
    }

    public static b.a c(qr.c cVar) {
        return new b.a(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f14003a.get());
    }
}

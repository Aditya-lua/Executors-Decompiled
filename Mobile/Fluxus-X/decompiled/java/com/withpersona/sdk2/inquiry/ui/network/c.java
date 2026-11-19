package com.withpersona.sdk2.inquiry.ui.network;

import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<gs.c> f11485a;

    public c(i<gs.c> iVar) {
        this.f11485a = iVar;
    }

    public static c a(i<gs.c> iVar) {
        return new c(iVar);
    }

    public static b.a c(gs.c cVar) {
        return new b.a(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f11485a.get());
    }
}

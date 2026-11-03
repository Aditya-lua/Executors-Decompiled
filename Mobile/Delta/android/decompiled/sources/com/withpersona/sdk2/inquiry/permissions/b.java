package com.withpersona.sdk2.inquiry.permissions;

import dt.i;
import pp.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12389a;

    public b(j jVar) {
        this.f12389a = jVar;
    }

    public static i<a.InterfaceC0228a> b(j jVar) {
        return dt.e.a(new b(jVar));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a
    public a a() {
        return this.f12389a.b();
    }
}

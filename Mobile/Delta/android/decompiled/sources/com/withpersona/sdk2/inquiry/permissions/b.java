package com.withpersona.sdk2.inquiry.permissions;

import ft.i;
import rp.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0225a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12308a;

    public b(j jVar) {
        this.f12308a = jVar;
    }

    public static i<a.InterfaceC0225a> b(j jVar) {
        return ft.e.a(new b(jVar));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a
    public a a() {
        return this.f12308a.b();
    }
}

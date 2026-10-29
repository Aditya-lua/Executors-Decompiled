package com.withpersona.sdk2.inquiry.internal;

import gp.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo.d f11454a;

    public d(zo.d dVar) {
        this.f11454a = dVar;
    }

    public static ft.i<c.a> b(zo.d dVar) {
        return ft.e.a(new d(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.c.a
    public c a(InquiryAttributes inquiryAttributes) {
        return this.f11454a.b(inquiryAttributes);
    }
}

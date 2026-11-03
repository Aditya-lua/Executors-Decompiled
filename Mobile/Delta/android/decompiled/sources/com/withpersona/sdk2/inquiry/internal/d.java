package com.withpersona.sdk2.inquiry.internal;

import ep.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo.d f11535a;

    public d(xo.d dVar) {
        this.f11535a = dVar;
    }

    public static dt.i<c.a> b(xo.d dVar) {
        return dt.e.a(new d(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.c.a
    public c a(InquiryAttributes inquiryAttributes) {
        return this.f11535a.b(inquiryAttributes);
    }
}

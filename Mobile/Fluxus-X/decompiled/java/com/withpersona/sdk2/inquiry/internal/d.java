package com.withpersona.sdk2.inquiry.internal;

import up.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np.d f10096a;

    public d(np.d dVar) {
        this.f10096a = dVar;
    }

    public static wt.i<c.a> b(np.d dVar) {
        return wt.e.a(new d(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.c.a
    public c a(InquiryAttributes inquiryAttributes) {
        return this.f10096a.b(inquiryAttributes);
    }
}

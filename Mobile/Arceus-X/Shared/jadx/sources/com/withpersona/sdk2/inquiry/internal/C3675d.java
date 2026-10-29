package com.withpersona.sdk2.inquiry.internal;

import gp.InquiryAttributes;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13954d;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3675d implements C3674c.a {

    /* JADX INFO: renamed from: a */
    public final C13954d f14740a;

    public C3675d(C13954d c13954d) {
        this.f14740a = c13954d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3674c.a> m18347b(C13954d c13954d) {
        return C5831e.m26182a(new C3675d(c13954d));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3674c.a
    /* JADX INFO: renamed from: a */
    public C3674c mo18345a(InquiryAttributes inquiryAttributes) {
        return this.f14740a.m50455b(inquiryAttributes);
    }
}

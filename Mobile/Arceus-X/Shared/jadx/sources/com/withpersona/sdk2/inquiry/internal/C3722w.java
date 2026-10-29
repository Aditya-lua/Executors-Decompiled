package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13979p0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C3722w implements C3721v.a {

    /* JADX INFO: renamed from: a */
    public final C13979p0 f15572a;

    public C3722w(C13979p0 c13979p0) {
        this.f15572a = c13979p0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3721v.a> m18828b(C13979p0 c13979p0) {
        return C5831e.m26182a(new C3722w(c13979p0));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3721v.a
    /* JADX INFO: renamed from: a */
    public C3721v mo18826a(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.f15572a.m50520b(str, str2, inquirySessionConfig);
    }
}

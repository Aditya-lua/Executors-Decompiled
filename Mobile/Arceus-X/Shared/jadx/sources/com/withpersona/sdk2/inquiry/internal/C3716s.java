package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13975n0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C3716s implements C3715r.a {

    /* JADX INFO: renamed from: a */
    public final C13975n0 f15552a;

    public C3716s(C13975n0 c13975n0) {
        this.f15552a = c13975n0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3715r.a> m18807b(C13975n0 c13975n0) {
        return C5831e.m26182a(new C3716s(c13975n0));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3715r.a
    /* JADX INFO: renamed from: a */
    public C3715r mo18805a(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return this.f15552a.m50508b(str, str2, str3, str4, inquirySessionConfig);
    }
}

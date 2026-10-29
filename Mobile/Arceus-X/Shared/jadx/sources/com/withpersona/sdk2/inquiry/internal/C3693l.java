package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13953c0;
import p610zo.EnumC13949a0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C3693l implements C3692k.b {

    /* JADX INFO: renamed from: a */
    public final C13953c0 f15271a;

    public C3693l(C13953c0 c13953c0) {
        this.f15271a = c13953c0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3692k.b> m18598b(C13953c0 c13953c0) {
        return C5831e.m26182a(new C3693l(c13953c0));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3692k.b
    /* JADX INFO: renamed from: a */
    public C3692k mo18594a(String str, @Nullable String str2, String str3, EnumC13949a0 enumC13949a0, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return this.f15271a.m50452b(str, str2, str3, enumC13949a0, inquirySessionConfig, z10);
    }
}

package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13952c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3673b implements C3672a.a {

    /* JADX INFO: renamed from: a */
    public final C13952c f14733a;

    public C3673b(C13952c c13952c) {
        this.f14733a = c13952c;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3672a.a> m18342b(C13952c c13952c) {
        return C5831e.m26182a(new C3673b(c13952c));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3672a.a
    /* JADX INFO: renamed from: a */
    public C3672a mo18340a(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return this.f14733a.m50449b(str, inquirySessionDataWrapper);
    }
}

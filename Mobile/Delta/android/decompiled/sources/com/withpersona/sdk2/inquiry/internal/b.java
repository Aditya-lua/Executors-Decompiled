package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0212a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo.c f11448a;

    public b(zo.c cVar) {
        this.f11448a = cVar;
    }

    public static ft.i<a.InterfaceC0212a> b(zo.c cVar) {
        return ft.e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a
    public a a(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return this.f11448a.b(str, inquirySessionDataWrapper);
    }
}

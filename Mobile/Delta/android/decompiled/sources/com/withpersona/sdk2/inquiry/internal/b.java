package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0215a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo.c f11529a;

    public b(xo.c cVar) {
        this.f11529a = cVar;
    }

    public static dt.i<a.InterfaceC0215a> b(xo.c cVar) {
        return dt.e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a
    public a a(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return this.f11529a.b(str, inquirySessionDataWrapper);
    }
}

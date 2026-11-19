package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a.InterfaceC0176a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np.c f10089a;

    public b(np.c cVar) {
        this.f10089a = cVar;
    }

    public static wt.i<a.InterfaceC0176a> b(np.c cVar) {
        return wt.e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a.InterfaceC0176a
    public a a(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return this.f10089a.b(str, inquirySessionDataWrapper);
    }
}

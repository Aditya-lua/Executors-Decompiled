package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C3718u implements TransitionWorker.InterfaceC3662a {

    /* JADX INFO: renamed from: a */
    public final C3717t f15558a;

    public C3718u(C3717t c3717t) {
        this.f15558a = c3717t;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<TransitionWorker.InterfaceC3662a> m18811b(C3717t c3717t) {
        return C5831e.m26182a(new C3718u(c3717t));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.TransitionWorker.InterfaceC3662a
    /* JADX INFO: renamed from: a */
    public TransitionWorker mo18320a(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return this.f15558a.m18810b(str, str2, str3, str4, list, inquirySessionConfig, transitionData);
    }
}

package com.withpersona.sdk2.inquiry.governmentid;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3547h implements GovernmentIdAnalyzeWorker.a {

    /* JADX INFO: renamed from: a */
    public final C3546g f14097a;

    public C3547h(C3546g c3546g) {
        this.f14097a = c3546g;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<GovernmentIdAnalyzeWorker.a> m17547b(C3546g c3546g) {
        return C5831e.m26182a(new C3547h(c3546g));
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.a
    /* JADX INFO: renamed from: a */
    public GovernmentIdAnalyzeWorker mo17543a(IdConfig.EnumC3514b enumC3514b, String str) {
        return this.f14097a.m17546b(enumC3514b, str);
    }
}

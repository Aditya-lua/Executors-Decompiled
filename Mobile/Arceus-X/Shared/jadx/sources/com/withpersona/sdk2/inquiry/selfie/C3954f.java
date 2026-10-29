package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p584yp.C13412v;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3954f implements C3953e.b {

    /* JADX INFO: renamed from: a */
    public final C13412v f16609a;

    public C3954f(C13412v c13412v) {
        this.f16609a = c13412v;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3953e.b> m20049b(C13412v c13412v) {
        return C5831e.m26182a(new C3954f(c13412v));
    }

    @Override // com.withpersona.sdk2.inquiry.selfie.C3953e.b
    /* JADX INFO: renamed from: a */
    public C3953e mo20039a(C3955g c3955g, PoseInfo poseInfo, boolean z10) {
        return this.f16609a.m49040b(poseInfo, z10, c3955g);
    }
}

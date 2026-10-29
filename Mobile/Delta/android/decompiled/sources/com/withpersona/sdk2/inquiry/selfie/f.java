package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import yp.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f12953a;

    public f(v vVar) {
        this.f12953a = vVar;
    }

    public static ft.i<e.b> b(v vVar) {
        return ft.e.a(new f(vVar));
    }

    @Override // com.withpersona.sdk2.inquiry.selfie.e.b
    public e a(g gVar, PoseInfo poseInfo, boolean z10) {
        return this.f12953a.b(poseInfo, z10, gVar);
    }
}

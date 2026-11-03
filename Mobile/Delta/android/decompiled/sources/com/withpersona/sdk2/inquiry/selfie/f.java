package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import wp.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f13034a;

    public f(v vVar) {
        this.f13034a = vVar;
    }

    public static dt.i<e.b> b(v vVar) {
        return dt.e.a(new f(vVar));
    }

    @Override // com.withpersona.sdk2.inquiry.selfie.e.b
    public e a(g gVar, PoseInfo poseInfo, boolean z10) {
        return this.f13034a.b(poseInfo, z10, gVar);
    }
}

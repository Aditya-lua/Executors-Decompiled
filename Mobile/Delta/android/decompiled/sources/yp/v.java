package yp;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<fn.n0> f36302a;
    public final ft.i<qq.c> b;

    public v(ft.i<fn.n0> iVar, ft.i<qq.c> iVar2) {
        this.f36302a = iVar;
        this.b = iVar2;
    }

    public static v a(ft.i<fn.n0> iVar, ft.i<qq.c> iVar2) {
        return new v(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.selfie.e c(ct.a<fn.n0> aVar, PoseInfo poseInfo, boolean z10, com.withpersona.sdk2.inquiry.selfie.g gVar, qq.c cVar) {
        return new com.withpersona.sdk2.inquiry.selfie.e(aVar, poseInfo, z10, gVar, cVar);
    }

    public com.withpersona.sdk2.inquiry.selfie.e b(PoseInfo poseInfo, boolean z10, com.withpersona.sdk2.inquiry.selfie.g gVar) {
        return c(ft.c.b(this.f36302a), poseInfo, z10, gVar, this.b.get());
    }
}

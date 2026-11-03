package wp;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<dn.n0> f34931a;
    public final dt.i<oq.c> b;

    public v(dt.i<dn.n0> iVar, dt.i<oq.c> iVar2) {
        this.f34931a = iVar;
        this.b = iVar2;
    }

    public static v a(dt.i<dn.n0> iVar, dt.i<oq.c> iVar2) {
        return new v(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.selfie.e c(at.a<dn.n0> aVar, PoseInfo poseInfo, boolean z10, com.withpersona.sdk2.inquiry.selfie.g gVar, oq.c cVar) {
        return new com.withpersona.sdk2.inquiry.selfie.e(aVar, poseInfo, z10, gVar, cVar);
    }

    public com.withpersona.sdk2.inquiry.selfie.e b(PoseInfo poseInfo, boolean z10, com.withpersona.sdk2.inquiry.selfie.g gVar) {
        return c(dt.c.b(this.f34931a), poseInfo, z10, gVar, this.b.get());
    }
}

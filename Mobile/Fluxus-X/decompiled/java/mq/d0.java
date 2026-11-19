package mq;

import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<sn.b1> f23560a;
    public final wt.i<er.c> b;

    public d0(wt.i<sn.b1> iVar, wt.i<er.c> iVar2) {
        this.f23560a = iVar;
        this.b = iVar2;
    }

    public static d0 a(wt.i<sn.b1> iVar, wt.i<er.c> iVar2) {
        return new d0(iVar, iVar2);
    }

    public static c0 c(tt.a<sn.b1> aVar, PoseInfo poseInfo, boolean z10, f0 f0Var, er.c cVar) {
        return new c0(aVar, poseInfo, z10, f0Var, cVar);
    }

    public c0 b(PoseInfo poseInfo, boolean z10, f0 f0Var) {
        return c(wt.c.b(this.f23560a), poseInfo, z10, f0Var, this.b.get());
    }
}

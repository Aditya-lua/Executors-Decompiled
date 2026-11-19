package mq;

import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements c0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f23574a;

    public e0(d0 d0Var) {
        this.f23574a = d0Var;
    }

    public static wt.i<c0.b> b(d0 d0Var) {
        return wt.e.a(new e0(d0Var));
    }

    @Override // mq.c0.b
    public c0 a(f0 f0Var, PoseInfo poseInfo, boolean z10) {
        return this.f23574a.b(poseInfo, z10, f0Var);
    }
}

package vd;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.d0 f34295a;
    public final ge.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge.d0 f34296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ge.d0 f34297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ge.d0 f34298e;

    public /* synthetic */ l1(Context context, k1 k1Var) {
        ge.z zVarB = ge.a0.b(context);
        this.f34295a = zVarB;
        ge.d0 d0VarB = ge.y.b(g.f34269a);
        this.b = d0VarB;
        u uVar = new u(zVarB, e1.f34266a);
        this.f34296c = uVar;
        ge.d0 d0VarB2 = ge.y.b(new o(zVarB, d0VarB, uVar, e1.f34266a));
        this.f34297d = d0VarB2;
        this.f34298e = ge.y.b(new f(d0VarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f34298e.a();
    }
}

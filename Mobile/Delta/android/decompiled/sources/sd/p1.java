package sd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.d0 f30673a;
    public final de.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.d0 f30674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de.d0 f30675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.d0 f30676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final de.d0 f30677f;

    public /* synthetic */ p1(Context context, o1 o1Var) {
        de.z zVarB = de.a0.b(context);
        this.f30673a = zVarB;
        de.d0 d0VarB = de.y.b(c0.f30620a);
        this.b = d0VarB;
        u uVar = new u(zVarB, g1.f30630a);
        this.f30674c = uVar;
        de.d0 d0VarB2 = de.y.b(new p0(zVarB, d0VarB, uVar, g1.f30630a));
        this.f30675d = d0VarB2;
        de.d0 d0VarB3 = de.y.b(new u0(d0VarB2));
        this.f30676e = d0VarB3;
        this.f30677f = de.y.b(new b0(d0VarB2, d0VarB3));
    }

    @Override // sd.w
    public final c a() {
        return (c) this.f30677f.a();
    }
}

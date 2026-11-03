package td;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.d0 f32282a;
    public final ee.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.d0 f32283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ee.d0 f32284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee.d0 f32285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ee.d0 f32286f;

    public /* synthetic */ p1(Context context, o1 o1Var) {
        ee.z zVarB = ee.a0.b(context);
        this.f32282a = zVarB;
        ee.d0 d0VarB = ee.y.b(c0.f32229a);
        this.b = d0VarB;
        u uVar = new u(zVarB, g1.f32239a);
        this.f32283c = uVar;
        ee.d0 d0VarB2 = ee.y.b(new p0(zVarB, d0VarB, uVar, g1.f32239a));
        this.f32284d = d0VarB2;
        ee.d0 d0VarB3 = ee.y.b(new u0(d0VarB2));
        this.f32285e = d0VarB3;
        this.f32286f = ee.y.b(new b0(d0VarB2, d0VarB3));
    }

    @Override // td.w
    public final c a() {
        return (c) this.f32286f.a();
    }
}

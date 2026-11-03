package td;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.d0 f32261a;
    public final ee.d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.d0 f32262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ee.d0 f32263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee.d0 f32264e;

    public /* synthetic */ l1(Context context, k1 k1Var) {
        ee.z zVarB = ee.a0.b(context);
        this.f32261a = zVarB;
        ee.d0 d0VarB = ee.y.b(g.f32235a);
        this.b = d0VarB;
        u uVar = new u(zVarB, e1.f32232a);
        this.f32262c = uVar;
        ee.d0 d0VarB2 = ee.y.b(new o(zVarB, d0VarB, uVar, e1.f32232a));
        this.f32263d = d0VarB2;
        this.f32264e = ee.y.b(new f(d0VarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f32264e.a();
    }
}

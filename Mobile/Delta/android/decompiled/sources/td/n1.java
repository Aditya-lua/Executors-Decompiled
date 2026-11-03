package td;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f32276a;

    public /* synthetic */ n1(m1 m1Var) {
    }

    public final n1 a(Context context) {
        context.getClass();
        this.f32276a = context;
        return this;
    }

    @Override // td.v
    public final w b() {
        ee.c0.a(this.f32276a, Context.class);
        return new p1(this.f32276a, null);
    }
}

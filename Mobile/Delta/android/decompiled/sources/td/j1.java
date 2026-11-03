package td;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f32252a;

    public /* synthetic */ j1(i1 i1Var) {
    }

    public final j1 a(Context context) {
        context.getClass();
        this.f32252a = context;
        return this;
    }

    @Override // td.q1
    public final l1 b() {
        ee.c0.a(this.f32252a, Context.class);
        return new l1(this.f32252a, null);
    }
}

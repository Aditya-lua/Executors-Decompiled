package sd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30643a;

    public /* synthetic */ j1(i1 i1Var) {
    }

    public final j1 a(Context context) {
        context.getClass();
        this.f30643a = context;
        return this;
    }

    @Override // sd.q1
    public final l1 b() {
        de.c0.a(this.f30643a, Context.class);
        return new l1(this.f30643a, null);
    }
}

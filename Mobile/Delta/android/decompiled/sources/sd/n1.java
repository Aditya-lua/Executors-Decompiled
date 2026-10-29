package sd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30667a;

    public /* synthetic */ n1(m1 m1Var) {
    }

    public final n1 a(Context context) {
        context.getClass();
        this.f30667a = context;
        return this;
    }

    @Override // sd.v
    public final w b() {
        de.c0.a(this.f30667a, Context.class);
        return new p1(this.f30667a, null);
    }
}

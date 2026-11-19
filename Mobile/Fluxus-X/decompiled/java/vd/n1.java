package vd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34310a;

    public /* synthetic */ n1(m1 m1Var) {
    }

    public final n1 a(Context context) {
        context.getClass();
        this.f34310a = context;
        return this;
    }

    @Override // vd.v
    public final w b() {
        ge.c0.a(this.f34310a, Context.class);
        return new p1(this.f34310a, null);
    }
}

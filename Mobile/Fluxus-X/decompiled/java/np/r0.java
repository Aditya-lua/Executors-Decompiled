package np;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements wt.d<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f26417a;
    public final wt.i<av.p0> b;

    public r0(wt.i<Context> iVar, wt.i<av.p0> iVar2) {
        this.f26417a = iVar;
        this.b = iVar2;
    }

    public static r0 a(wt.i<Context> iVar, wt.i<av.p0> iVar2) {
        return new r0(iVar, iVar2);
    }

    public static q0 c(Context context, av.p0 p0Var) {
        return new q0(context, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        return c(this.f26417a.get(), this.b.get());
    }
}

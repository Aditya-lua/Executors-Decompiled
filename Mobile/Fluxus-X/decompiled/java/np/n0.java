package np;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements wt.d<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f26382a;
    public final wt.i<nr.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<up.w> f26383c;

    public n0(wt.i<Context> iVar, wt.i<nr.b.a> iVar2, wt.i<up.w> iVar3) {
        this.f26382a = iVar;
        this.b = iVar2;
        this.f26383c = iVar3;
    }

    public static n0 a(wt.i<Context> iVar, wt.i<nr.b.a> iVar2, wt.i<up.w> iVar3) {
        return new n0(iVar, iVar2, iVar3);
    }

    public static m0 c(Context context, nr.b.a aVar, up.w wVar) {
        return new m0(context, aVar, wVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f26382a.get(), this.b.get(), this.f26383c.get());
    }
}

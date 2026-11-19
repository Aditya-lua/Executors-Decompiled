package fq;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements wt.d<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16550a;
    public final wt.i<j.a> b;

    public x(wt.i<Context> iVar, wt.i<j.a> iVar2) {
        this.f16550a = iVar;
        this.b = iVar2;
    }

    public static x a(wt.i<Context> iVar, wt.i<j.a> iVar2) {
        return new x(iVar, iVar2);
    }

    public static u c(Context context, j.a aVar) {
        return new u(context, aVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f16550a.get(), this.b.get());
    }
}

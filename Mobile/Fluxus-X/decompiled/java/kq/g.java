package kq;

import mv.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21744a;
    public final wt.i<c> b;

    public g(f fVar, wt.i<c> iVar) {
        this.f21744a = fVar;
        this.b = iVar;
    }

    public static g a(f fVar, wt.i<c> iVar) {
        return new g(fVar, iVar);
    }

    public static a0 c(f fVar, c cVar) {
        return (a0) wt.h.e(fVar.b(cVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c(this.f21744a, this.b.get());
    }
}

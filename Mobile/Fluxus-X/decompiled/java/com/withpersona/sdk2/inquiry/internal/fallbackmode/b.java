package com.withpersona.sdk2.inquiry.internal.fallbackmode;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements wt.d<rp.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10389a;
    public final wt.i<d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<f.a> f10390c;

    public b(a aVar, wt.i<d> iVar, wt.i<f.a> iVar2) {
        this.f10389a = aVar;
        this.b = iVar;
        this.f10390c = iVar2;
    }

    public static rp.a a(a aVar, d dVar, f.a aVar2) {
        return (rp.a) wt.h.e(aVar.a(dVar, aVar2));
    }

    public static b b(a aVar, wt.i<d> iVar, wt.i<f.a> iVar2) {
        return new b(aVar, iVar, iVar2);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rp.a get() {
        return a(this.f10389a, this.b.get(), this.f10390c.get());
    }
}

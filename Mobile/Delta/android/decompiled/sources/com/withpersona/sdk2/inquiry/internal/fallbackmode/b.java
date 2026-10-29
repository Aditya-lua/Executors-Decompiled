package com.withpersona.sdk2.inquiry.internal.fallbackmode;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ft.d<dp.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11747a;
    public final ft.i<d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<f.a> f11748c;

    public b(a aVar, ft.i<d> iVar, ft.i<f.a> iVar2) {
        this.f11747a = aVar;
        this.b = iVar;
        this.f11748c = iVar2;
    }

    public static dp.a a(a aVar, d dVar, f.a aVar2) {
        return (dp.a) ft.h.e(aVar.a(dVar, aVar2));
    }

    public static b b(a aVar, ft.i<d> iVar, ft.i<f.a> iVar2) {
        return new b(aVar, iVar, iVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dp.a get() {
        return a(this.f11747a, this.b.get(), this.f11748c.get());
    }
}

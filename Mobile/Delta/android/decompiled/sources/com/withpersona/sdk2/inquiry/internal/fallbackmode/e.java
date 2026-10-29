package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<FallbackModeService> f11798a;
    public final ft.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<i.a> f11799c;

    public e(ft.i<FallbackModeService> iVar, ft.i<w> iVar2, ft.i<i.a> iVar3) {
        this.f11798a = iVar;
        this.b = iVar2;
        this.f11799c = iVar3;
    }

    public static e a(ft.i<FallbackModeService> iVar, ft.i<w> iVar2, ft.i<i.a> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d c(FallbackModeService fallbackModeService, w wVar, i.a aVar) {
        return new d(fallbackModeService, wVar, aVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f11798a.get(), this.b.get(), this.f11799c.get());
    }
}

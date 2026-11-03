package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements dt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<FallbackModeService> f11879a;
    public final dt.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<i.a> f11880c;

    public e(dt.i<FallbackModeService> iVar, dt.i<w> iVar2, dt.i<i.a> iVar3) {
        this.f11879a = iVar;
        this.b = iVar2;
        this.f11880c = iVar3;
    }

    public static e a(dt.i<FallbackModeService> iVar, dt.i<w> iVar2, dt.i<i.a> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d c(FallbackModeService fallbackModeService, w wVar, i.a aVar) {
        return new d(fallbackModeService, wVar, aVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f11879a.get(), this.b.get(), this.f11880c.get());
    }
}

package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import hn.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<FallbackModeService> f10440a;
    public final wt.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<i.a> f10441c;

    public e(wt.i<FallbackModeService> iVar, wt.i<w> iVar2, wt.i<i.a> iVar3) {
        this.f10440a = iVar;
        this.b = iVar2;
        this.f10441c = iVar3;
    }

    public static e a(wt.i<FallbackModeService> iVar, wt.i<w> iVar2, wt.i<i.a> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d c(FallbackModeService fallbackModeService, w wVar, i.a aVar) {
        return new d(fallbackModeService, wVar, aVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f10440a.get(), this.b.get(), this.f10441c.get());
    }
}

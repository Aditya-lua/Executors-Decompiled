package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<w> f11803a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<i.a> f11804c;

    public g(ft.i<w> iVar, ft.i<Context> iVar2, ft.i<i.a> iVar3) {
        this.f11803a = iVar;
        this.b = iVar2;
        this.f11804c = iVar3;
    }

    public static g a(ft.i<w> iVar, ft.i<Context> iVar2, ft.i<i.a> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(w wVar, Context context, i.a aVar, int i10) {
        return new f(wVar, context, aVar, i10);
    }

    public f b(int i10) {
        return c(this.f11803a.get(), this.b.get(), this.f11804c.get(), i10);
    }
}

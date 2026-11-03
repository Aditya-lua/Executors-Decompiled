package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<w> f11884a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<i.a> f11885c;

    public g(dt.i<w> iVar, dt.i<Context> iVar2, dt.i<i.a> iVar3) {
        this.f11884a = iVar;
        this.b = iVar2;
        this.f11885c = iVar3;
    }

    public static g a(dt.i<w> iVar, dt.i<Context> iVar2, dt.i<i.a> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(w wVar, Context context, i.a aVar, int i10) {
        return new f(wVar, context, aVar, i10);
    }

    public f b(int i10) {
        return c(this.f11884a.get(), this.b.get(), this.f11885c.get(), i10);
    }
}

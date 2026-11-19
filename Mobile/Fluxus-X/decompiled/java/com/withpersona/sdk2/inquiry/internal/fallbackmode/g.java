package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import hn.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<w> f10445a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<i.a> f10446c;

    public g(wt.i<w> iVar, wt.i<Context> iVar2, wt.i<i.a> iVar3) {
        this.f10445a = iVar;
        this.b = iVar2;
        this.f10446c = iVar3;
    }

    public static g a(wt.i<w> iVar, wt.i<Context> iVar2, wt.i<i.a> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(w wVar, Context context, i.a aVar, int i10) {
        return new f(wVar, context, aVar, i10);
    }

    public f b(int i10) {
        return c(this.f10445a.get(), this.b.get(), this.f10446c.get(), i10);
    }
}

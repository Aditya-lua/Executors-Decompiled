package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import fn.x;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f10912a;
    public final ft.i<x> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qq.c> f10913c;

    public g(ft.i<Context> iVar, ft.i<x> iVar2, ft.i<qq.c> iVar3) {
        this.f10912a = iVar;
        this.b = iVar2;
        this.f10913c = iVar3;
    }

    public static g a(ft.i<Context> iVar, ft.i<x> iVar2, ft.i<qq.c> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static GovernmentIdAnalyzeWorker c(Context context, x xVar, qq.c cVar, IdConfig.b bVar, String str) {
        return new GovernmentIdAnalyzeWorker(context, xVar, cVar, bVar, str);
    }

    public GovernmentIdAnalyzeWorker b(IdConfig.b bVar, String str) {
        return c(this.f10912a.get(), this.b.get(), this.f10913c.get(), bVar, str);
    }
}

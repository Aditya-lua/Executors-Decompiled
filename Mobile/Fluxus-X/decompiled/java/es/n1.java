package es;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements wt.d<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f14361a;
    public final wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<gs.a.C0332a> f14362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<nr.b.a> f14363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<k4.a> f14364e;

    public n1(wt.i<Context> iVar, wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, wt.i<gs.a.C0332a> iVar3, wt.i<nr.b.a> iVar4, wt.i<k4.a> iVar5) {
        this.f14361a = iVar;
        this.b = iVar2;
        this.f14362c = iVar3;
        this.f14363d = iVar4;
        this.f14364e = iVar5;
    }

    public static n1 a(wt.i<Context> iVar, wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, wt.i<gs.a.C0332a> iVar3, wt.i<nr.b.a> iVar4, wt.i<k4.a> iVar5) {
        return new n1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static k1 c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, gs.a.C0332a c0332a, nr.b.a aVar2, k4.a aVar3) {
        return new k1(context, aVar, c0332a, aVar2, aVar3);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k1 get() {
        return c(this.f14361a.get(), this.b.get(), this.f14362c.get(), this.f14363d.get(), this.f14364e.get());
    }
}

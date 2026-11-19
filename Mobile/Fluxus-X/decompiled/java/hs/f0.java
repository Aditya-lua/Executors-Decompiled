package hs;

import android.content.Context;
import es.k4;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements wt.d<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f18588a;
    public final wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<gs.a.C0332a> f18589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<nr.b.a> f18590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<k4.a> f18591e;

    public f0(wt.i<Context> iVar, wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, wt.i<gs.a.C0332a> iVar3, wt.i<nr.b.a> iVar4, wt.i<k4.a> iVar5) {
        this.f18588a = iVar;
        this.b = iVar2;
        this.f18589c = iVar3;
        this.f18590d = iVar4;
        this.f18591e = iVar5;
    }

    public static f0 a(wt.i<Context> iVar, wt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, wt.i<gs.a.C0332a> iVar3, wt.i<nr.b.a> iVar4, wt.i<k4.a> iVar5) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static e0 c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, gs.a.C0332a c0332a, nr.b.a aVar2, k4.a aVar3) {
        return new e0(context, aVar, c0332a, aVar2, aVar3);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f18588a.get(), this.b.get(), this.f18589c.get(), this.f18590d.get(), this.f18591e.get());
    }
}

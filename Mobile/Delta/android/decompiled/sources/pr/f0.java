package pr;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements dt.d<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f29104a;
    public final dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<or.a.C0489a> f29105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<xq.a.C0658a> f29106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.ui.h.a> f29107e;

    public f0(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, dt.i<or.a.C0489a> iVar3, dt.i<xq.a.C0658a> iVar4, dt.i<com.withpersona.sdk2.inquiry.ui.h.a> iVar5) {
        this.f29104a = iVar;
        this.b = iVar2;
        this.f29105c = iVar3;
        this.f29106d = iVar4;
        this.f29107e = iVar5;
    }

    public static f0 a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, dt.i<or.a.C0489a> iVar3, dt.i<xq.a.C0658a> iVar4, dt.i<com.withpersona.sdk2.inquiry.ui.h.a> iVar5) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static e0 c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, or.a.C0489a c0489a, xq.a.C0658a c0658a, com.withpersona.sdk2.inquiry.ui.h.a aVar2) {
        return new e0(context, aVar, c0489a, c0658a, aVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f29104a.get(), this.b.get(), this.f29105c.get(), this.f29106d.get(), this.f29107e.get());
    }
}

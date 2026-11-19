package up;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<com.withpersona.sdk2.inquiry.internal.network.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f33796a;
    public final wt.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<y> f33797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<rp.i> f33798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<kq.c> f33799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<mo.a> f33800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<sp.a> f33801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<Boolean> f33802h;

    public d(wt.i<Context> iVar, wt.i<w> iVar2, wt.i<y> iVar3, wt.i<rp.i> iVar4, wt.i<kq.c> iVar5, wt.i<mo.a> iVar6, wt.i<sp.a> iVar7, wt.i<Boolean> iVar8) {
        this.f33796a = iVar;
        this.b = iVar2;
        this.f33797c = iVar3;
        this.f33798d = iVar4;
        this.f33799e = iVar5;
        this.f33800f = iVar6;
        this.f33801g = iVar7;
        this.f33802h = iVar8;
    }

    public static d a(wt.i<Context> iVar, wt.i<w> iVar2, wt.i<y> iVar3, wt.i<rp.i> iVar4, wt.i<kq.c> iVar5, wt.i<mo.a> iVar6, wt.i<sp.a> iVar7, wt.i<Boolean> iVar8) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static com.withpersona.sdk2.inquiry.internal.network.e c(Context context, w wVar, y yVar, rp.i iVar, kq.c cVar, mo.a aVar, sp.a aVar2, boolean z10) {
        return new com.withpersona.sdk2.inquiry.internal.network.e(context, wVar, yVar, iVar, cVar, aVar, aVar2, z10);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.network.e get() {
        return c(this.f33796a.get(), this.b.get(), this.f33797c.get(), this.f33798d.get(), this.f33799e.get(), this.f33800f.get(), this.f33801g.get(), this.f33802h.get().booleanValue());
    }
}

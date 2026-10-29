package gp;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<com.withpersona.sdk2.inquiry.internal.network.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f18327a;
    public final ft.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<y> f18328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<dp.i> f18329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<wp.c> f18330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<yn.a> f18331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<ep.a> f18332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<Boolean> f18333h;

    public d(ft.i<Context> iVar, ft.i<w> iVar2, ft.i<y> iVar3, ft.i<dp.i> iVar4, ft.i<wp.c> iVar5, ft.i<yn.a> iVar6, ft.i<ep.a> iVar7, ft.i<Boolean> iVar8) {
        this.f18327a = iVar;
        this.b = iVar2;
        this.f18328c = iVar3;
        this.f18329d = iVar4;
        this.f18330e = iVar5;
        this.f18331f = iVar6;
        this.f18332g = iVar7;
        this.f18333h = iVar8;
    }

    public static d a(ft.i<Context> iVar, ft.i<w> iVar2, ft.i<y> iVar3, ft.i<dp.i> iVar4, ft.i<wp.c> iVar5, ft.i<yn.a> iVar6, ft.i<ep.a> iVar7, ft.i<Boolean> iVar8) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static com.withpersona.sdk2.inquiry.internal.network.e c(Context context, w wVar, y yVar, dp.i iVar, wp.c cVar, yn.a aVar, ep.a aVar2, boolean z10) {
        return new com.withpersona.sdk2.inquiry.internal.network.e(context, wVar, yVar, iVar, cVar, aVar, aVar2, z10);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.network.e get() {
        return c(this.f18327a.get(), this.b.get(), this.f18328c.get(), this.f18329d.get(), this.f18330e.get(), this.f18331f.get(), this.f18332g.get(), this.f18333h.get().booleanValue());
    }
}

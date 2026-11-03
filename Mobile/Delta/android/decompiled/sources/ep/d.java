package ep;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dt.d<com.withpersona.sdk2.inquiry.internal.network.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f16225a;
    public final dt.i<w> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<y> f16226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<bp.i> f16227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<up.c> f16228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<wn.a> f16229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<cp.a> f16230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<Boolean> f16231h;

    public d(dt.i<Context> iVar, dt.i<w> iVar2, dt.i<y> iVar3, dt.i<bp.i> iVar4, dt.i<up.c> iVar5, dt.i<wn.a> iVar6, dt.i<cp.a> iVar7, dt.i<Boolean> iVar8) {
        this.f16225a = iVar;
        this.b = iVar2;
        this.f16226c = iVar3;
        this.f16227d = iVar4;
        this.f16228e = iVar5;
        this.f16229f = iVar6;
        this.f16230g = iVar7;
        this.f16231h = iVar8;
    }

    public static d a(dt.i<Context> iVar, dt.i<w> iVar2, dt.i<y> iVar3, dt.i<bp.i> iVar4, dt.i<up.c> iVar5, dt.i<wn.a> iVar6, dt.i<cp.a> iVar7, dt.i<Boolean> iVar8) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static com.withpersona.sdk2.inquiry.internal.network.e c(Context context, w wVar, y yVar, bp.i iVar, up.c cVar, wn.a aVar, cp.a aVar2, boolean z10) {
        return new com.withpersona.sdk2.inquiry.internal.network.e(context, wVar, yVar, iVar, cVar, aVar, aVar2, z10);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.network.e get() {
        return c(this.f16225a.get(), this.b.get(), this.f16226c.get(), this.f16227d.get(), this.f16228e.get(), this.f16229f.get(), this.f16230g.get(), this.f16231h.get().booleanValue());
    }
}

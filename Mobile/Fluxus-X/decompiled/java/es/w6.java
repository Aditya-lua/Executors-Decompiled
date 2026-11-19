package es;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w6 implements wt.d<s6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f14610a;
    public final wt.i<eq.p.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<zp.u.a> f14611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<kq.c> f14612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<o1.a> f14613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<x6.a> f14614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<ir.b> f14615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<fq.n1> f14616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wt.i<k1> f14617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wt.i<dr.c> f14618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wt.i<to.e> f14619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f14620l;

    public w6(wt.i<Context> iVar, wt.i<eq.p.a> iVar2, wt.i<zp.u.a> iVar3, wt.i<kq.c> iVar4, wt.i<o1.a> iVar5, wt.i<x6.a> iVar6, wt.i<ir.b> iVar7, wt.i<fq.n1> iVar8, wt.i<k1> iVar9, wt.i<dr.c> iVar10, wt.i<to.e> iVar11, wt.i<TrackingEventsLogger> iVar12) {
        this.f14610a = iVar;
        this.b = iVar2;
        this.f14611c = iVar3;
        this.f14612d = iVar4;
        this.f14613e = iVar5;
        this.f14614f = iVar6;
        this.f14615g = iVar7;
        this.f14616h = iVar8;
        this.f14617i = iVar9;
        this.f14618j = iVar10;
        this.f14619k = iVar11;
        this.f14620l = iVar12;
    }

    public static w6 a(wt.i<Context> iVar, wt.i<eq.p.a> iVar2, wt.i<zp.u.a> iVar3, wt.i<kq.c> iVar4, wt.i<o1.a> iVar5, wt.i<x6.a> iVar6, wt.i<ir.b> iVar7, wt.i<fq.n1> iVar8, wt.i<k1> iVar9, wt.i<dr.c> iVar10, wt.i<to.e> iVar11, wt.i<TrackingEventsLogger> iVar12) {
        return new w6(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12);
    }

    public static s6 c(Context context, eq.p.a aVar, zp.u.a aVar2, kq.c cVar, o1.a aVar3, x6.a aVar4, ir.b bVar, fq.n1 n1Var, k1 k1Var, dr.c cVar2, to.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new s6(context, aVar, aVar2, cVar, aVar3, aVar4, bVar, n1Var, k1Var, cVar2, eVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s6 get() {
        return c(this.f14610a.get(), this.b.get(), this.f14611c.get(), this.f14612d.get(), this.f14613e.get(), this.f14614f.get(), this.f14615g.get(), this.f14616h.get(), this.f14617i.get(), this.f14618j.get(), this.f14619k.get(), this.f14620l.get());
    }
}

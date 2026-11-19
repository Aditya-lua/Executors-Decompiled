package vo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements wt.d<d2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f34498a;
    public final wt.i<l6.s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<dp.f.a> f34499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<j> f34500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<ip.j> f34501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<ip.v> f34502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<yo.t0> f34503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<AutoClassifyWorker.b> f34504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wt.i<wo.o> f34505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wt.i<yn.a> f34506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wt.i<ir.b> f34507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wt.i<dr.c> f34508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f34509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wt.i<gr.b> f34510n;

    public c3(wt.i<Context> iVar, wt.i<l6.s> iVar2, wt.i<dp.f.a> iVar3, wt.i<j> iVar4, wt.i<ip.j> iVar5, wt.i<ip.v> iVar6, wt.i<yo.t0> iVar7, wt.i<AutoClassifyWorker.b> iVar8, wt.i<wo.o> iVar9, wt.i<yn.a> iVar10, wt.i<ir.b> iVar11, wt.i<dr.c> iVar12, wt.i<TrackingEventsLogger> iVar13, wt.i<gr.b> iVar14) {
        this.f34498a = iVar;
        this.b = iVar2;
        this.f34499c = iVar3;
        this.f34500d = iVar4;
        this.f34501e = iVar5;
        this.f34502f = iVar6;
        this.f34503g = iVar7;
        this.f34504h = iVar8;
        this.f34505i = iVar9;
        this.f34506j = iVar10;
        this.f34507k = iVar11;
        this.f34508l = iVar12;
        this.f34509m = iVar13;
        this.f34510n = iVar14;
    }

    public static c3 a(wt.i<Context> iVar, wt.i<l6.s> iVar2, wt.i<dp.f.a> iVar3, wt.i<j> iVar4, wt.i<ip.j> iVar5, wt.i<ip.v> iVar6, wt.i<yo.t0> iVar7, wt.i<AutoClassifyWorker.b> iVar8, wt.i<wo.o> iVar9, wt.i<yn.a> iVar10, wt.i<ir.b> iVar11, wt.i<dr.c> iVar12, wt.i<TrackingEventsLogger> iVar13, wt.i<gr.b> iVar14) {
        return new c3(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14);
    }

    public static d2 c(Context context, l6.s sVar, dp.f.a aVar, j jVar, ip.j jVar2, ip.v vVar, yo.t0 t0Var, AutoClassifyWorker.b bVar, wo.o oVar, yn.a aVar2, ir.b bVar2, dr.c cVar, TrackingEventsLogger trackingEventsLogger, gr.b bVar3) {
        return new d2(context, sVar, aVar, jVar, jVar2, vVar, t0Var, bVar, oVar, aVar2, bVar2, cVar, trackingEventsLogger, bVar3);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d2 get() {
        return c(this.f34498a.get(), this.b.get(), this.f34499c.get(), this.f34500d.get(), this.f34501e.get(), this.f34502f.get(), this.f34503g.get(), this.f34504h.get(), this.f34505i.get(), this.f34506j.get(), this.f34507k.get(), this.f34508l.get(), this.f34509m.get(), this.f34510n.get());
    }
}

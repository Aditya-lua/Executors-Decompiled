package go;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements dt.d<GovernmentIdWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f18697a;
    public final dt.i<k6.s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<no.c.a> f18698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f18699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<so.j> f18700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<so.v> f18701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<jo.t0> f18702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<AutoClassifyWorker.b> f18703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<ho.n> f18704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<jn.a> f18705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f18706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f18707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f18708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f18709n;

    public h2(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<no.c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<so.j> iVar5, dt.i<so.v> iVar6, dt.i<jo.t0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<ho.n> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        this.f18697a = iVar;
        this.b = iVar2;
        this.f18698c = iVar3;
        this.f18699d = iVar4;
        this.f18700e = iVar5;
        this.f18701f = iVar6;
        this.f18702g = iVar7;
        this.f18703h = iVar8;
        this.f18704i = iVar9;
        this.f18705j = iVar10;
        this.f18706k = iVar11;
        this.f18707l = iVar12;
        this.f18708m = iVar13;
        this.f18709n = iVar14;
    }

    public static h2 a(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<no.c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<so.j> iVar5, dt.i<so.v> iVar6, dt.i<jo.t0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<ho.n> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        return new h2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14);
    }

    public static GovernmentIdWorkflow c(Context context, k6.s sVar, no.c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, so.j jVar, so.v vVar, jo.t0 t0Var, AutoClassifyWorker.b bVar, ho.n nVar, jn.a aVar2, sq.a aVar3, nq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4) {
        return new GovernmentIdWorkflow(context, sVar, aVar, eVar, jVar, vVar, t0Var, bVar, nVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow get() {
        return c(this.f18697a.get(), this.b.get(), this.f18698c.get(), this.f18699d.get(), this.f18700e.get(), this.f18701f.get(), this.f18702g.get(), this.f18703h.get(), this.f18704i.get(), this.f18705j.get(), this.f18706k.get(), this.f18707l.get(), this.f18708m.get(), this.f18709n.get());
    }
}

package qo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ro.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f29521a;
    public final ft.i<k6.s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<po.c.a> f29522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.governmentid.e> f29523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<ro.v0> f29524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<j1> f29525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<ro.m0> f29526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<AutoClassifyWorker.b> f29527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<ro.i> f29528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<ln.a> f29529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<uq.a> f29530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<pq.c> f29531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f29532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f29533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ft.i<ku.p0> f29534o;

    public d1(ft.i<Context> iVar, ft.i<k6.s> iVar2, ft.i<po.c.a> iVar3, ft.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, ft.i<ro.v0> iVar5, ft.i<j1> iVar6, ft.i<ro.m0> iVar7, ft.i<AutoClassifyWorker.b> iVar8, ft.i<ro.i> iVar9, ft.i<ln.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, ft.i<ku.p0> iVar15) {
        this.f29521a = iVar;
        this.b = iVar2;
        this.f29522c = iVar3;
        this.f29523d = iVar4;
        this.f29524e = iVar5;
        this.f29525f = iVar6;
        this.f29526g = iVar7;
        this.f29527h = iVar8;
        this.f29528i = iVar9;
        this.f29529j = iVar10;
        this.f29530k = iVar11;
        this.f29531l = iVar12;
        this.f29532m = iVar13;
        this.f29533n = iVar14;
        this.f29534o = iVar15;
    }

    public static d1 a(ft.i<Context> iVar, ft.i<k6.s> iVar2, ft.i<po.c.a> iVar3, ft.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, ft.i<ro.v0> iVar5, ft.i<j1> iVar6, ft.i<ro.m0> iVar7, ft.i<AutoClassifyWorker.b> iVar8, ft.i<ro.i> iVar9, ft.i<ln.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, ft.i<ku.p0> iVar15) {
        return new d1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b c(GovernmentIdWorkflow.Input input, androidx.p000lifecycle.l0 l0Var, Context context, k6.s sVar, po.c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, ro.v0 v0Var, j1 j1Var, ro.m0 m0Var, AutoClassifyWorker.b bVar, ro.i iVar, ln.a aVar2, uq.a aVar3, pq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4, ku.p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b(input, l0Var, context, sVar, aVar, eVar, v0Var, j1Var, m0Var, bVar, iVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4, p0Var);
    }

    public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b b(GovernmentIdWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return c(input, l0Var, this.f29521a.get(), this.b.get(), this.f29522c.get(), this.f29523d.get(), this.f29524e.get(), this.f29525f.get(), this.f29526g.get(), this.f29527h.get(), this.f29528i.get(), this.f29529j.get(), this.f29530k.get(), this.f29531l.get(), this.f29532m.get(), this.f29533n.get(), this.f29534o.get());
    }
}

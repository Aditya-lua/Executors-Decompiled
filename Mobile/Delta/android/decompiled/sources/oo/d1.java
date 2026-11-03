package oo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import po.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28065a;
    public final dt.i<k6.s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<no.c.a> f28066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f28067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<po.v0> f28068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<j1> f28069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<po.m0> f28070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<AutoClassifyWorker.b> f28071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<po.i> f28072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<jn.a> f28073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f28074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f28075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f28077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dt.i<iu.p0> f28078o;

    public d1(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<no.c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<po.v0> iVar5, dt.i<j1> iVar6, dt.i<po.m0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<po.i> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, dt.i<iu.p0> iVar15) {
        this.f28065a = iVar;
        this.b = iVar2;
        this.f28066c = iVar3;
        this.f28067d = iVar4;
        this.f28068e = iVar5;
        this.f28069f = iVar6;
        this.f28070g = iVar7;
        this.f28071h = iVar8;
        this.f28072i = iVar9;
        this.f28073j = iVar10;
        this.f28074k = iVar11;
        this.f28075l = iVar12;
        this.f28076m = iVar13;
        this.f28077n = iVar14;
        this.f28078o = iVar15;
    }

    public static d1 a(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<no.c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<po.v0> iVar5, dt.i<j1> iVar6, dt.i<po.m0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<po.i> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, dt.i<iu.p0> iVar15) {
        return new d1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b c(GovernmentIdWorkflow.Input input, androidx.p000lifecycle.l0 l0Var, Context context, k6.s sVar, no.c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, po.v0 v0Var, j1 j1Var, po.m0 m0Var, AutoClassifyWorker.b bVar, po.i iVar, jn.a aVar2, sq.a aVar3, nq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4, iu.p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b(input, l0Var, context, sVar, aVar, eVar, v0Var, j1Var, m0Var, bVar, iVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4, p0Var);
    }

    public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b b(GovernmentIdWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return c(input, l0Var, this.f28065a.get(), this.b.get(), this.f28066c.get(), this.f28067d.get(), this.f28068e.get(), this.f28069f.get(), this.f28070g.get(), this.f28071h.get(), this.f28072i.get(), this.f28073j.get(), this.f28074k.get(), this.f28075l.get(), this.f28076m.get(), this.f28077n.get(), this.f28078o.get());
    }
}

package fp;

import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.c.a> f17618a;
    public final dt.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.k.b> f17619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.r.a> f17620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<TransitionWorker.a> f17621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.v.a> f17622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.f.a> f17623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.m.a> f17624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<GovernmentIdWorkflow> f17625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<SelfieWorkflow> f17626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<UiWorkflow> f17627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<DocumentWorkflow> f17628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<IntegrationWorkflow> f17629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dt.i<nq.e> f17630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dt.i<sq.a> f17631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dt.i<nq.c> f17632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dt.i<UiStepSavedStateHelper> f17633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.o.a> f17634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dt.i<fo.b.a> f17635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dt.i<eo.e> f17636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f17637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final dt.i<TrackingMetadataProvider> f17638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.q> f17639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dt.i<xo.f> f17640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dt.i<iu.p0> f17641y;

    public f0(dt.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a> iVar2, dt.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3, dt.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4, dt.i<TransitionWorker.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.internal.v.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7, dt.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8, dt.i<GovernmentIdWorkflow> iVar9, dt.i<SelfieWorkflow> iVar10, dt.i<UiWorkflow> iVar11, dt.i<DocumentWorkflow> iVar12, dt.i<IntegrationWorkflow> iVar13, dt.i<nq.e> iVar14, dt.i<sq.a> iVar15, dt.i<nq.c> iVar16, dt.i<UiStepSavedStateHelper> iVar17, dt.i<com.withpersona.sdk2.inquiry.internal.o.a> iVar18, dt.i<fo.b.a> iVar19, dt.i<eo.e> iVar20, dt.i<TrackingEventsLogger> iVar21, dt.i<TrackingMetadataProvider> iVar22, dt.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, dt.i<xo.f> iVar24, dt.i<iu.p0> iVar25) {
        this.f17618a = iVar;
        this.b = iVar2;
        this.f17619c = iVar3;
        this.f17620d = iVar4;
        this.f17621e = iVar5;
        this.f17622f = iVar6;
        this.f17623g = iVar7;
        this.f17624h = iVar8;
        this.f17625i = iVar9;
        this.f17626j = iVar10;
        this.f17627k = iVar11;
        this.f17628l = iVar12;
        this.f17629m = iVar13;
        this.f17630n = iVar14;
        this.f17631o = iVar15;
        this.f17632p = iVar16;
        this.f17633q = iVar17;
        this.f17634r = iVar18;
        this.f17635s = iVar19;
        this.f17636t = iVar20;
        this.f17637u = iVar21;
        this.f17638v = iVar22;
        this.f17639w = iVar23;
        this.f17640x = iVar24;
        this.f17641y = iVar25;
    }

    public static f0 a(dt.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a> iVar2, dt.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3, dt.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4, dt.i<TransitionWorker.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.internal.v.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7, dt.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8, dt.i<GovernmentIdWorkflow> iVar9, dt.i<SelfieWorkflow> iVar10, dt.i<UiWorkflow> iVar11, dt.i<DocumentWorkflow> iVar12, dt.i<IntegrationWorkflow> iVar13, dt.i<nq.e> iVar14, dt.i<sq.a> iVar15, dt.i<nq.c> iVar16, dt.i<UiStepSavedStateHelper> iVar17, dt.i<com.withpersona.sdk2.inquiry.internal.o.a> iVar18, dt.i<fo.b.a> iVar19, dt.i<eo.e> iVar20, dt.i<TrackingEventsLogger> iVar21, dt.i<TrackingMetadataProvider> iVar22, dt.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, dt.i<xo.f> iVar24, dt.i<iu.p0> iVar25) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25);
    }

    public static e0 c(InquiryWorkflow$Props inquiryWorkflow$Props, androidx.p000lifecycle.l0 l0Var, com.withpersona.sdk2.inquiry.internal.c.a aVar, com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a interfaceC0215a, com.withpersona.sdk2.inquiry.internal.k.b bVar, com.withpersona.sdk2.inquiry.internal.r.a aVar2, TransitionWorker.a aVar3, com.withpersona.sdk2.inquiry.internal.v.a aVar4, com.withpersona.sdk2.inquiry.internal.f.a aVar5, com.withpersona.sdk2.inquiry.internal.m.a aVar6, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, IntegrationWorkflow integrationWorkflow, nq.e eVar, sq.a aVar7, nq.c cVar, UiStepSavedStateHelper uiStepSavedStateHelper, com.withpersona.sdk2.inquiry.internal.o.a aVar8, fo.b.a aVar9, eo.e eVar2, TrackingEventsLogger trackingEventsLogger, TrackingMetadataProvider trackingMetadataProvider, com.withpersona.sdk2.inquiry.internal.q qVar, xo.f fVar, iu.p0 p0Var) {
        return new e0(inquiryWorkflow$Props, l0Var, aVar, interfaceC0215a, bVar, aVar2, aVar3, aVar4, aVar5, aVar6, governmentIdWorkflow, selfieWorkflow, uiWorkflow, documentWorkflow, integrationWorkflow, eVar, aVar7, cVar, uiStepSavedStateHelper, aVar8, aVar9, eVar2, trackingEventsLogger, trackingMetadataProvider, qVar, fVar, p0Var);
    }

    public e0 b(InquiryWorkflow$Props inquiryWorkflow$Props, androidx.p000lifecycle.l0 l0Var) {
        return c(inquiryWorkflow$Props, l0Var, this.f17618a.get(), this.b.get(), this.f17619c.get(), this.f17620d.get(), this.f17621e.get(), this.f17622f.get(), this.f17623g.get(), this.f17624h.get(), this.f17625i.get(), this.f17626j.get(), this.f17627k.get(), this.f17628l.get(), this.f17629m.get(), this.f17630n.get(), this.f17631o.get(), this.f17632p.get(), this.f17633q.get(), this.f17634r.get(), this.f17635s.get(), this.f17636t.get(), this.f17637u.get(), this.f17638v.get(), this.f17639w.get(), this.f17640x.get(), this.f17641y.get());
    }
}

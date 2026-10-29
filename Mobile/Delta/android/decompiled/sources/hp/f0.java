package hp;

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
    public final ft.i<com.withpersona.sdk2.inquiry.internal.c.a> f19643a;
    public final ft.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.k.b> f19644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.r.a> f19645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<TransitionWorker.a> f19646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.v.a> f19647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.f.a> f19648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.m.a> f19649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<GovernmentIdWorkflow> f19650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<SelfieWorkflow> f19651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<UiWorkflow> f19652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<DocumentWorkflow> f19653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<IntegrationWorkflow> f19654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ft.i<pq.e> f19655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ft.i<uq.a> f19656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ft.i<pq.c> f19657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ft.i<UiStepSavedStateHelper> f19658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.o.a> f19659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ft.i<ho.b.a> f19660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ft.i<go.e> f19661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f19662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ft.i<TrackingMetadataProvider> f19663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.q> f19664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ft.i<zo.f> f19665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ft.i<ku.p0> f19666y;

    public f0(ft.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar, ft.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a> iVar2, ft.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3, ft.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4, ft.i<TransitionWorker.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.internal.v.a> iVar6, ft.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7, ft.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8, ft.i<GovernmentIdWorkflow> iVar9, ft.i<SelfieWorkflow> iVar10, ft.i<UiWorkflow> iVar11, ft.i<DocumentWorkflow> iVar12, ft.i<IntegrationWorkflow> iVar13, ft.i<pq.e> iVar14, ft.i<uq.a> iVar15, ft.i<pq.c> iVar16, ft.i<UiStepSavedStateHelper> iVar17, ft.i<com.withpersona.sdk2.inquiry.internal.o.a> iVar18, ft.i<ho.b.a> iVar19, ft.i<go.e> iVar20, ft.i<TrackingEventsLogger> iVar21, ft.i<TrackingMetadataProvider> iVar22, ft.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, ft.i<zo.f> iVar24, ft.i<ku.p0> iVar25) {
        this.f19643a = iVar;
        this.b = iVar2;
        this.f19644c = iVar3;
        this.f19645d = iVar4;
        this.f19646e = iVar5;
        this.f19647f = iVar6;
        this.f19648g = iVar7;
        this.f19649h = iVar8;
        this.f19650i = iVar9;
        this.f19651j = iVar10;
        this.f19652k = iVar11;
        this.f19653l = iVar12;
        this.f19654m = iVar13;
        this.f19655n = iVar14;
        this.f19656o = iVar15;
        this.f19657p = iVar16;
        this.f19658q = iVar17;
        this.f19659r = iVar18;
        this.f19660s = iVar19;
        this.f19661t = iVar20;
        this.f19662u = iVar21;
        this.f19663v = iVar22;
        this.f19664w = iVar23;
        this.f19665x = iVar24;
        this.f19666y = iVar25;
    }

    public static f0 a(ft.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar, ft.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a> iVar2, ft.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3, ft.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4, ft.i<TransitionWorker.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.internal.v.a> iVar6, ft.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7, ft.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8, ft.i<GovernmentIdWorkflow> iVar9, ft.i<SelfieWorkflow> iVar10, ft.i<UiWorkflow> iVar11, ft.i<DocumentWorkflow> iVar12, ft.i<IntegrationWorkflow> iVar13, ft.i<pq.e> iVar14, ft.i<uq.a> iVar15, ft.i<pq.c> iVar16, ft.i<UiStepSavedStateHelper> iVar17, ft.i<com.withpersona.sdk2.inquiry.internal.o.a> iVar18, ft.i<ho.b.a> iVar19, ft.i<go.e> iVar20, ft.i<TrackingEventsLogger> iVar21, ft.i<TrackingMetadataProvider> iVar22, ft.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, ft.i<zo.f> iVar24, ft.i<ku.p0> iVar25) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25);
    }

    public static e0 c(InquiryWorkflow$Props inquiryWorkflow$Props, androidx.p000lifecycle.l0 l0Var, com.withpersona.sdk2.inquiry.internal.c.a aVar, com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a interfaceC0212a, com.withpersona.sdk2.inquiry.internal.k.b bVar, com.withpersona.sdk2.inquiry.internal.r.a aVar2, TransitionWorker.a aVar3, com.withpersona.sdk2.inquiry.internal.v.a aVar4, com.withpersona.sdk2.inquiry.internal.f.a aVar5, com.withpersona.sdk2.inquiry.internal.m.a aVar6, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, IntegrationWorkflow integrationWorkflow, pq.e eVar, uq.a aVar7, pq.c cVar, UiStepSavedStateHelper uiStepSavedStateHelper, com.withpersona.sdk2.inquiry.internal.o.a aVar8, ho.b.a aVar9, go.e eVar2, TrackingEventsLogger trackingEventsLogger, TrackingMetadataProvider trackingMetadataProvider, com.withpersona.sdk2.inquiry.internal.q qVar, zo.f fVar, ku.p0 p0Var) {
        return new e0(inquiryWorkflow$Props, l0Var, aVar, interfaceC0212a, bVar, aVar2, aVar3, aVar4, aVar5, aVar6, governmentIdWorkflow, selfieWorkflow, uiWorkflow, documentWorkflow, integrationWorkflow, eVar, aVar7, cVar, uiStepSavedStateHelper, aVar8, aVar9, eVar2, trackingEventsLogger, trackingMetadataProvider, qVar, fVar, p0Var);
    }

    public e0 b(InquiryWorkflow$Props inquiryWorkflow$Props, androidx.p000lifecycle.l0 l0Var) {
        return c(inquiryWorkflow$Props, l0Var, this.f19643a.get(), this.b.get(), this.f19644c.get(), this.f19645d.get(), this.f19646e.get(), this.f19647f.get(), this.f19648g.get(), this.f19649h.get(), this.f19650i.get(), this.f19651j.get(), this.f19652k.get(), this.f19653l.get(), this.f19654m.get(), this.f19655n.get(), this.f19656o.get(), this.f19657p.get(), this.f19658q.get(), this.f19659r.get(), this.f19660s.get(), this.f19661t.get(), this.f19662u.get(), this.f19663v.get(), this.f19664w.get(), this.f19665x.get(), this.f19666y.get());
    }
}

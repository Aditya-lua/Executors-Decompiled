package p177hp;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.C3672a;
import com.withpersona.sdk2.inquiry.internal.C3674c;
import com.withpersona.sdk2.inquiry.internal.C3677f;
import com.withpersona.sdk2.inquiry.internal.C3692k;
import com.withpersona.sdk2.inquiry.internal.C3694m;
import com.withpersona.sdk2.inquiry.internal.C3712o;
import com.withpersona.sdk2.inquiry.internal.C3714q;
import com.withpersona.sdk2.inquiry.internal.C3715r;
import com.withpersona.sdk2.inquiry.internal.C3721v;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p176ho.C6475b;
import p256ku.InterfaceC7906p0;
import p363pq.C10309c;
import p363pq.InterfaceC10311e;
import p475uq.C11930a;
import p610zo.C13958f;

/* JADX INFO: renamed from: hp.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6494f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3674c.a> f24733a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3672a.a> f24734b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3692k.b> f24735c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3715r.a> f24736d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<TransitionWorker.InterfaceC3662a> f24737e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C3721v.a> f24738f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C3677f.a> f24739g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<C3694m.a> f24740h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<GovernmentIdWorkflow> f24741i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<SelfieWorkflow> f24742j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<UiWorkflow> f24743k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<DocumentWorkflow> f24744l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<IntegrationWorkflow> f24745m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5835i<InterfaceC10311e> f24746n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC5835i<C11930a> f24747o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC5835i<C10309c> f24748p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC5835i<UiStepSavedStateHelper> f24749q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5835i<C3712o.a> f24750r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC5835i<C6475b.a> f24751s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5835i<C6159e> f24752t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC5835i<TrackingEventsLogger> f24753u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC5835i<TrackingMetadataProvider> f24754v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC5835i<C3714q> f24755w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC5835i<C13958f> f24756x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC5835i<InterfaceC7906p0> f24757y;

    public C6494f0(InterfaceC5835i<C3674c.a> interfaceC5835i, InterfaceC5835i<C3672a.a> interfaceC5835i2, InterfaceC5835i<C3692k.b> interfaceC5835i3, InterfaceC5835i<C3715r.a> interfaceC5835i4, InterfaceC5835i<TransitionWorker.InterfaceC3662a> interfaceC5835i5, InterfaceC5835i<C3721v.a> interfaceC5835i6, InterfaceC5835i<C3677f.a> interfaceC5835i7, InterfaceC5835i<C3694m.a> interfaceC5835i8, InterfaceC5835i<GovernmentIdWorkflow> interfaceC5835i9, InterfaceC5835i<SelfieWorkflow> interfaceC5835i10, InterfaceC5835i<UiWorkflow> interfaceC5835i11, InterfaceC5835i<DocumentWorkflow> interfaceC5835i12, InterfaceC5835i<IntegrationWorkflow> interfaceC5835i13, InterfaceC5835i<InterfaceC10311e> interfaceC5835i14, InterfaceC5835i<C11930a> interfaceC5835i15, InterfaceC5835i<C10309c> interfaceC5835i16, InterfaceC5835i<UiStepSavedStateHelper> interfaceC5835i17, InterfaceC5835i<C3712o.a> interfaceC5835i18, InterfaceC5835i<C6475b.a> interfaceC5835i19, InterfaceC5835i<C6159e> interfaceC5835i20, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i21, InterfaceC5835i<TrackingMetadataProvider> interfaceC5835i22, InterfaceC5835i<C3714q> interfaceC5835i23, InterfaceC5835i<C13958f> interfaceC5835i24, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i25) {
        this.f24733a = interfaceC5835i;
        this.f24734b = interfaceC5835i2;
        this.f24735c = interfaceC5835i3;
        this.f24736d = interfaceC5835i4;
        this.f24737e = interfaceC5835i5;
        this.f24738f = interfaceC5835i6;
        this.f24739g = interfaceC5835i7;
        this.f24740h = interfaceC5835i8;
        this.f24741i = interfaceC5835i9;
        this.f24742j = interfaceC5835i10;
        this.f24743k = interfaceC5835i11;
        this.f24744l = interfaceC5835i12;
        this.f24745m = interfaceC5835i13;
        this.f24746n = interfaceC5835i14;
        this.f24747o = interfaceC5835i15;
        this.f24748p = interfaceC5835i16;
        this.f24749q = interfaceC5835i17;
        this.f24750r = interfaceC5835i18;
        this.f24751s = interfaceC5835i19;
        this.f24752t = interfaceC5835i20;
        this.f24753u = interfaceC5835i21;
        this.f24754v = interfaceC5835i22;
        this.f24755w = interfaceC5835i23;
        this.f24756x = interfaceC5835i24;
        this.f24757y = interfaceC5835i25;
    }

    /* JADX INFO: renamed from: a */
    public static C6494f0 m28326a(InterfaceC5835i<C3674c.a> interfaceC5835i, InterfaceC5835i<C3672a.a> interfaceC5835i2, InterfaceC5835i<C3692k.b> interfaceC5835i3, InterfaceC5835i<C3715r.a> interfaceC5835i4, InterfaceC5835i<TransitionWorker.InterfaceC3662a> interfaceC5835i5, InterfaceC5835i<C3721v.a> interfaceC5835i6, InterfaceC5835i<C3677f.a> interfaceC5835i7, InterfaceC5835i<C3694m.a> interfaceC5835i8, InterfaceC5835i<GovernmentIdWorkflow> interfaceC5835i9, InterfaceC5835i<SelfieWorkflow> interfaceC5835i10, InterfaceC5835i<UiWorkflow> interfaceC5835i11, InterfaceC5835i<DocumentWorkflow> interfaceC5835i12, InterfaceC5835i<IntegrationWorkflow> interfaceC5835i13, InterfaceC5835i<InterfaceC10311e> interfaceC5835i14, InterfaceC5835i<C11930a> interfaceC5835i15, InterfaceC5835i<C10309c> interfaceC5835i16, InterfaceC5835i<UiStepSavedStateHelper> interfaceC5835i17, InterfaceC5835i<C3712o.a> interfaceC5835i18, InterfaceC5835i<C6475b.a> interfaceC5835i19, InterfaceC5835i<C6159e> interfaceC5835i20, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i21, InterfaceC5835i<TrackingMetadataProvider> interfaceC5835i22, InterfaceC5835i<C3714q> interfaceC5835i23, InterfaceC5835i<C13958f> interfaceC5835i24, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i25) {
        return new C6494f0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, interfaceC5835i14, interfaceC5835i15, interfaceC5835i16, interfaceC5835i17, interfaceC5835i18, interfaceC5835i19, interfaceC5835i20, interfaceC5835i21, interfaceC5835i22, interfaceC5835i23, interfaceC5835i24, interfaceC5835i25);
    }

    /* JADX INFO: renamed from: c */
    public static C6491e0 m28327c(InquiryWorkflow$Props inquiryWorkflow$Props, C0967l0 c0967l0, C3674c.a aVar, C3672a.a aVar2, C3692k.b bVar, C3715r.a aVar3, TransitionWorker.InterfaceC3662a interfaceC3662a, C3721v.a aVar4, C3677f.a aVar5, C3694m.a aVar6, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, IntegrationWorkflow integrationWorkflow, InterfaceC10311e interfaceC10311e, C11930a c11930a, C10309c c10309c, UiStepSavedStateHelper uiStepSavedStateHelper, C3712o.a aVar7, C6475b.a aVar8, C6159e c6159e, TrackingEventsLogger trackingEventsLogger, TrackingMetadataProvider trackingMetadataProvider, C3714q c3714q, C13958f c13958f, InterfaceC7906p0 interfaceC7906p0) {
        return new C6491e0(inquiryWorkflow$Props, c0967l0, aVar, aVar2, bVar, aVar3, interfaceC3662a, aVar4, aVar5, aVar6, governmentIdWorkflow, selfieWorkflow, uiWorkflow, documentWorkflow, integrationWorkflow, interfaceC10311e, c11930a, c10309c, uiStepSavedStateHelper, aVar7, aVar8, c6159e, trackingEventsLogger, trackingMetadataProvider, c3714q, c13958f, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: b */
    public C6491e0 m28328b(InquiryWorkflow$Props inquiryWorkflow$Props, C0967l0 c0967l0) {
        return m28327c(inquiryWorkflow$Props, c0967l0, this.f24733a.get(), this.f24734b.get(), this.f24735c.get(), this.f24736d.get(), this.f24737e.get(), this.f24738f.get(), this.f24739g.get(), this.f24740h.get(), this.f24741i.get(), this.f24742j.get(), this.f24743k.get(), this.f24744l.get(), this.f24745m.get(), this.f24746n.get(), this.f24747o.get(), this.f24748p.get(), this.f24749q.get(), this.f24750r.get(), this.f24751s.get(), this.f24752t.get(), this.f24753u.get(), this.f24754v.get(), this.f24755w.get(), this.f24756x.get(), this.f24757y.get());
    }
}

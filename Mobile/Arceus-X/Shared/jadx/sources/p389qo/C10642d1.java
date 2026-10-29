package p389qo;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3591b;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5835i;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p361po.C10303c;
import p363pq.C10309c;
import p475uq.C11930a;
import ro.C10960i;
import ro.C10965j1;
import ro.C10972m0;
import ro.C10990v0;

/* JADX INFO: renamed from: qo.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10642d1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f38128a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC7479s> f38129b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10303c.a> f38130c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3544e> f38131d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C10990v0> f38132e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C10965j1> f38133f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C10972m0> f38134g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<AutoClassifyWorker.C3563b> f38135h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C10960i> f38136i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<InterfaceC8169a> f38137j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<C11930a> f38138k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<C10309c> f38139l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<TrackingEventsLogger> f38140m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5835i<C4007a> f38141n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC5835i<InterfaceC7906p0> f38142o;

    public C10642d1(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7479s> interfaceC5835i2, InterfaceC5835i<C10303c.a> interfaceC5835i3, InterfaceC5835i<C3544e> interfaceC5835i4, InterfaceC5835i<C10990v0> interfaceC5835i5, InterfaceC5835i<C10965j1> interfaceC5835i6, InterfaceC5835i<C10972m0> interfaceC5835i7, InterfaceC5835i<AutoClassifyWorker.C3563b> interfaceC5835i8, InterfaceC5835i<C10960i> interfaceC5835i9, InterfaceC5835i<InterfaceC8169a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13, InterfaceC5835i<C4007a> interfaceC5835i14, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i15) {
        this.f38128a = interfaceC5835i;
        this.f38129b = interfaceC5835i2;
        this.f38130c = interfaceC5835i3;
        this.f38131d = interfaceC5835i4;
        this.f38132e = interfaceC5835i5;
        this.f38133f = interfaceC5835i6;
        this.f38134g = interfaceC5835i7;
        this.f38135h = interfaceC5835i8;
        this.f38136i = interfaceC5835i9;
        this.f38137j = interfaceC5835i10;
        this.f38138k = interfaceC5835i11;
        this.f38139l = interfaceC5835i12;
        this.f38140m = interfaceC5835i13;
        this.f38141n = interfaceC5835i14;
        this.f38142o = interfaceC5835i15;
    }

    /* JADX INFO: renamed from: a */
    public static C10642d1 m40727a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7479s> interfaceC5835i2, InterfaceC5835i<C10303c.a> interfaceC5835i3, InterfaceC5835i<C3544e> interfaceC5835i4, InterfaceC5835i<C10990v0> interfaceC5835i5, InterfaceC5835i<C10965j1> interfaceC5835i6, InterfaceC5835i<C10972m0> interfaceC5835i7, InterfaceC5835i<AutoClassifyWorker.C3563b> interfaceC5835i8, InterfaceC5835i<C10960i> interfaceC5835i9, InterfaceC5835i<InterfaceC8169a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13, InterfaceC5835i<C4007a> interfaceC5835i14, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i15) {
        return new C10642d1(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, interfaceC5835i14, interfaceC5835i15);
    }

    /* JADX INFO: renamed from: c */
    public static C3591b m40728c(GovernmentIdWorkflow.Input input, C0967l0 c0967l0, Context context, InterfaceC7479s interfaceC7479s, C10303c.a aVar, C3544e c3544e, C10990v0 c10990v0, C10965j1 c10965j1, C10972m0 c10972m0, AutoClassifyWorker.C3563b c3563b, C10960i c10960i, InterfaceC8169a interfaceC8169a, C11930a c11930a, C10309c c10309c, TrackingEventsLogger trackingEventsLogger, C4007a c4007a, InterfaceC7906p0 interfaceC7906p0) {
        return new C3591b(input, c0967l0, context, interfaceC7479s, aVar, c3544e, c10990v0, c10965j1, c10972m0, c3563b, c10960i, interfaceC8169a, c11930a, c10309c, trackingEventsLogger, c4007a, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: b */
    public C3591b m40729b(GovernmentIdWorkflow.Input input, C0967l0 c0967l0) {
        return m40728c(input, c0967l0, this.f38128a.get(), this.f38129b.get(), this.f38130c.get(), this.f38131d.get(), this.f38132e.get(), this.f38133f.get(), this.f38134g.get(), this.f38135h.get(), this.f38136i.get(), this.f38137j.get(), this.f38138k.get(), this.f38139l.get(), this.f38140m.get(), this.f38141n.get(), this.f38142o.get());
    }
}

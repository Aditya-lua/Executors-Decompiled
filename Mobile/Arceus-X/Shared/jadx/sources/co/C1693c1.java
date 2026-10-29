package co;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import bo.C1475a;
import com.withpersona.sdk2.inquiry.document.C3438a;
import com.withpersona.sdk2.inquiry.document.C3446i;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.C3451a;
import com.withpersona.sdk2.inquiry.document.network.C3453c;
import com.withpersona.sdk2.inquiry.document.network.C3455e;
import com.withpersona.sdk2.inquiry.document.network.C3457g;
import com.withpersona.sdk2.inquiry.document.step.C3473b;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5835i;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7906p0;
import p363pq.C10309c;
import p475uq.C11930a;

/* JADX INFO: renamed from: co.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1693c1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC7479s> f6482a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f6483b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3438a> f6484c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3446i.b> f6485d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C3451a.a> f6486e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C3455e.a> f6487f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C3453c.a> f6488g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<C1475a.a> f6489h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C3457g.a> f6490i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<C11930a> f6491j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<C10309c> f6492k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<TrackingEventsLogger> f6493l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<C3875e.a> f6494m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5835i<InterfaceC7906p0> f6495n;

    public C1693c1(InterfaceC5835i<InterfaceC7479s> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C3438a> interfaceC5835i3, InterfaceC5835i<C3446i.b> interfaceC5835i4, InterfaceC5835i<C3451a.a> interfaceC5835i5, InterfaceC5835i<C3455e.a> interfaceC5835i6, InterfaceC5835i<C3453c.a> interfaceC5835i7, InterfaceC5835i<C1475a.a> interfaceC5835i8, InterfaceC5835i<C3457g.a> interfaceC5835i9, InterfaceC5835i<C11930a> interfaceC5835i10, InterfaceC5835i<C10309c> interfaceC5835i11, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i12, InterfaceC5835i<C3875e.a> interfaceC5835i13, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i14) {
        this.f6482a = interfaceC5835i;
        this.f6483b = interfaceC5835i2;
        this.f6484c = interfaceC5835i3;
        this.f6485d = interfaceC5835i4;
        this.f6486e = interfaceC5835i5;
        this.f6487f = interfaceC5835i6;
        this.f6488g = interfaceC5835i7;
        this.f6489h = interfaceC5835i8;
        this.f6490i = interfaceC5835i9;
        this.f6491j = interfaceC5835i10;
        this.f6492k = interfaceC5835i11;
        this.f6493l = interfaceC5835i12;
        this.f6494m = interfaceC5835i13;
        this.f6495n = interfaceC5835i14;
    }

    /* JADX INFO: renamed from: a */
    public static C1693c1 m8404a(InterfaceC5835i<InterfaceC7479s> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C3438a> interfaceC5835i3, InterfaceC5835i<C3446i.b> interfaceC5835i4, InterfaceC5835i<C3451a.a> interfaceC5835i5, InterfaceC5835i<C3455e.a> interfaceC5835i6, InterfaceC5835i<C3453c.a> interfaceC5835i7, InterfaceC5835i<C1475a.a> interfaceC5835i8, InterfaceC5835i<C3457g.a> interfaceC5835i9, InterfaceC5835i<C11930a> interfaceC5835i10, InterfaceC5835i<C10309c> interfaceC5835i11, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i12, InterfaceC5835i<C3875e.a> interfaceC5835i13, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i14) {
        return new C1693c1(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, interfaceC5835i14);
    }

    /* JADX INFO: renamed from: c */
    public static C3473b m8405c(DocumentWorkflow.Input input, C0967l0 c0967l0, InterfaceC7479s interfaceC7479s, Context context, C3438a c3438a, C3446i.b bVar, C3451a.a aVar, C3455e.a aVar2, C3453c.a aVar3, C1475a.a aVar4, C3457g.a aVar5, C11930a c11930a, C10309c c10309c, TrackingEventsLogger trackingEventsLogger, C3875e.a aVar6, InterfaceC7906p0 interfaceC7906p0) {
        return new C3473b(input, c0967l0, interfaceC7479s, context, c3438a, bVar, aVar, aVar2, aVar3, aVar4, aVar5, c11930a, c10309c, trackingEventsLogger, aVar6, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: b */
    public C3473b m8406b(DocumentWorkflow.Input input, C0967l0 c0967l0) {
        return m8405c(input, c0967l0, this.f6482a.get(), this.f6483b.get(), this.f6484c.get(), this.f6485d.get(), this.f6486e.get(), this.f6487f.get(), this.f6488g.get(), this.f6489h.get(), this.f6490i.get(), this.f6491j.get(), this.f6492k.get(), this.f6493l.get(), this.f6494m.get(), this.f6495n.get());
    }
}

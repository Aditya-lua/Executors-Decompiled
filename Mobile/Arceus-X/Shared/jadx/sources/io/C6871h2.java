package io;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import jo.C7230n;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p239k6.InterfaceC7479s;
import p276ln.InterfaceC8169a;
import p277lo.C8211t0;
import p361po.C10303c;
import p363pq.C10309c;
import p473uo.C11903j;
import p473uo.C11915v;
import p475uq.C11930a;

/* JADX INFO: renamed from: io.h2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6871h2 implements InterfaceC5830d<GovernmentIdWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f26938a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC7479s> f26939b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10303c.a> f26940c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3544e> f26941d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C11903j> f26942e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C11915v> f26943f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C8211t0> f26944g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<AutoClassifyWorker.C3563b> f26945h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C7230n> f26946i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<InterfaceC8169a> f26947j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<C11930a> f26948k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<C10309c> f26949l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<TrackingEventsLogger> f26950m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5835i<C4007a> f26951n;

    public C6871h2(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7479s> interfaceC5835i2, InterfaceC5835i<C10303c.a> interfaceC5835i3, InterfaceC5835i<C3544e> interfaceC5835i4, InterfaceC5835i<C11903j> interfaceC5835i5, InterfaceC5835i<C11915v> interfaceC5835i6, InterfaceC5835i<C8211t0> interfaceC5835i7, InterfaceC5835i<AutoClassifyWorker.C3563b> interfaceC5835i8, InterfaceC5835i<C7230n> interfaceC5835i9, InterfaceC5835i<InterfaceC8169a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13, InterfaceC5835i<C4007a> interfaceC5835i14) {
        this.f26938a = interfaceC5835i;
        this.f26939b = interfaceC5835i2;
        this.f26940c = interfaceC5835i3;
        this.f26941d = interfaceC5835i4;
        this.f26942e = interfaceC5835i5;
        this.f26943f = interfaceC5835i6;
        this.f26944g = interfaceC5835i7;
        this.f26945h = interfaceC5835i8;
        this.f26946i = interfaceC5835i9;
        this.f26947j = interfaceC5835i10;
        this.f26948k = interfaceC5835i11;
        this.f26949l = interfaceC5835i12;
        this.f26950m = interfaceC5835i13;
        this.f26951n = interfaceC5835i14;
    }

    /* JADX INFO: renamed from: a */
    public static C6871h2 m29308a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7479s> interfaceC5835i2, InterfaceC5835i<C10303c.a> interfaceC5835i3, InterfaceC5835i<C3544e> interfaceC5835i4, InterfaceC5835i<C11903j> interfaceC5835i5, InterfaceC5835i<C11915v> interfaceC5835i6, InterfaceC5835i<C8211t0> interfaceC5835i7, InterfaceC5835i<AutoClassifyWorker.C3563b> interfaceC5835i8, InterfaceC5835i<C7230n> interfaceC5835i9, InterfaceC5835i<InterfaceC8169a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13, InterfaceC5835i<C4007a> interfaceC5835i14) {
        return new C6871h2(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, interfaceC5835i14);
    }

    /* JADX INFO: renamed from: c */
    public static GovernmentIdWorkflow m29309c(Context context, InterfaceC7479s interfaceC7479s, C10303c.a aVar, C3544e c3544e, C11903j c11903j, C11915v c11915v, C8211t0 c8211t0, AutoClassifyWorker.C3563b c3563b, C7230n c7230n, InterfaceC8169a interfaceC8169a, C11930a c11930a, C10309c c10309c, TrackingEventsLogger trackingEventsLogger, C4007a c4007a) {
        return new GovernmentIdWorkflow(context, interfaceC7479s, aVar, c3544e, c11903j, c11915v, c8211t0, c3563b, c7230n, interfaceC8169a, c11930a, c10309c, trackingEventsLogger, c4007a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow get() {
        return m29309c(this.f26938a.get(), this.f26939b.get(), this.f26940c.get(), this.f26941d.get(), this.f26942e.get(), this.f26943f.get(), this.f26944g.get(), this.f26945h.get(), this.f26946i.get(), this.f26947j.get(), this.f26948k.get(), this.f26949l.get(), this.f26950m.get(), this.f26951n.get());
    }
}

package p583yo;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.integration.C3612a;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.C3626b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;
import p475uq.C11930a;

/* JADX INFO: renamed from: yo.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13271h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46631a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C11930a> f46632b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3612a.a> f46633c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f46634d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<InterfaceC7906p0> f46635e;

    public C13271h(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C11930a> interfaceC5835i2, InterfaceC5835i<C3612a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i5) {
        this.f46631a = interfaceC5835i;
        this.f46632b = interfaceC5835i2;
        this.f46633c = interfaceC5835i3;
        this.f46634d = interfaceC5835i4;
        this.f46635e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C13271h m49028a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C11930a> interfaceC5835i2, InterfaceC5835i<C3612a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i5) {
        return new C13271h(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C3626b m49029c(IntegrationWorkflow.Input input, C0967l0 c0967l0, Context context, C11930a c11930a, C3612a.a aVar, TrackingEventsLogger trackingEventsLogger, InterfaceC7906p0 interfaceC7906p0) {
        return new C3626b(input, c0967l0, context, c11930a, aVar, trackingEventsLogger, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: b */
    public C3626b m49030b(IntegrationWorkflow.Input input, C0967l0 c0967l0) {
        return m49029c(input, c0967l0, this.f46631a.get(), this.f46632b.get(), this.f46633c.get(), this.f46634d.get(), this.f46635e.get());
    }
}

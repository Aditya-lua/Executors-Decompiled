package p584yp;

import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.selfie.C3942d;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6447i0;
import p061ct.InterfaceC4364a;
import p132fn.C5698n0;
import p136ft.C5829c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yp.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C13363n implements InterfaceC5830d<C3942d> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3402b> f46822a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C5698n0> f46823b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6447i0> f46824c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f46825d;

    public C13363n(InterfaceC5835i<C3402b> interfaceC5835i, InterfaceC5835i<C5698n0> interfaceC5835i2, InterfaceC5835i<C6447i0> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        this.f46822a = interfaceC5835i;
        this.f46823b = interfaceC5835i2;
        this.f46824c = interfaceC5835i3;
        this.f46825d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C13363n m49035a(InterfaceC5835i<C3402b> interfaceC5835i, InterfaceC5835i<C5698n0> interfaceC5835i2, InterfaceC5835i<C6447i0> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        return new C13363n(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C3942d m49036c(C3402b c3402b, InterfaceC4364a<C5698n0> interfaceC4364a, C6447i0 c6447i0, TrackingEventsLogger trackingEventsLogger) {
        return new C3942d(c3402b, interfaceC4364a, c6447i0, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3942d get() {
        return m49036c(this.f46822a.get(), C5829c.m26178b(this.f46823b), this.f46824c.get(), this.f46825d.get());
    }
}

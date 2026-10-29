package p611zp;

import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p061ct.InterfaceC4364a;
import p132fn.C5698n0;
import p136ft.C5829c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;

/* JADX INFO: renamed from: zp.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14023q0 implements InterfaceC5830d<C14021p0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3402b> f49028a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C5698n0> f49029b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<TrackingEventsLogger> f49030c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C6159e> f49031d;

    public C14023q0(InterfaceC5835i<C3402b> interfaceC5835i, InterfaceC5835i<C5698n0> interfaceC5835i2, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i3, InterfaceC5835i<C6159e> interfaceC5835i4) {
        this.f49028a = interfaceC5835i;
        this.f49029b = interfaceC5835i2;
        this.f49030c = interfaceC5835i3;
        this.f49031d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C14023q0 m50694a(InterfaceC5835i<C3402b> interfaceC5835i, InterfaceC5835i<C5698n0> interfaceC5835i2, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i3, InterfaceC5835i<C6159e> interfaceC5835i4) {
        return new C14023q0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C14021p0 m50695c(C3402b c3402b, InterfaceC4364a<C5698n0> interfaceC4364a, TrackingEventsLogger trackingEventsLogger, C6159e c6159e) {
        return new C14021p0(c3402b, interfaceC4364a, trackingEventsLogger, c6159e);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14021p0 get() {
        return m50695c(this.f49028a.get(), C5829c.m26178b(this.f49029b), this.f49030c.get(), this.f49031d.get());
    }
}

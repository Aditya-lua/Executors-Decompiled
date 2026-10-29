package p251ko;

import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p132fn.C5717x;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;

/* JADX INFO: renamed from: ko.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7642a0 implements InterfaceC5830d<C7667z> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C5717x> f29204a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3402b> f29205b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6159e> f29206c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f29207d;

    public C7642a0(InterfaceC5835i<C5717x> interfaceC5835i, InterfaceC5835i<C3402b> interfaceC5835i2, InterfaceC5835i<C6159e> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        this.f29204a = interfaceC5835i;
        this.f29205b = interfaceC5835i2;
        this.f29206c = interfaceC5835i3;
        this.f29207d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C7642a0 m31578a(InterfaceC5835i<C5717x> interfaceC5835i, InterfaceC5835i<C3402b> interfaceC5835i2, InterfaceC5835i<C6159e> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        return new C7642a0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C7667z m31579c(C5717x c5717x, C3402b c3402b, C6159e c6159e, TrackingEventsLogger trackingEventsLogger) {
        return new C7667z(c5717x, c3402b, c6159e, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7667z get() {
        return m31579c(this.f29204a.get(), this.f29205b.get(), this.f29206c.get(), this.f29207d.get());
    }
}

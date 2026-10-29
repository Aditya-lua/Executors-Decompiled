package yp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ft.d<com.withpersona.sdk2.inquiry.selfie.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.camera.b> f36164a;
    public final ft.i<fn.n0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.i0> f36165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f36166d;

    public n(ft.i<com.withpersona.sdk2.camera.b> iVar, ft.i<fn.n0> iVar2, ft.i<hn.i0> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        this.f36164a = iVar;
        this.b = iVar2;
        this.f36165c = iVar3;
        this.f36166d = iVar4;
    }

    public static n a(ft.i<com.withpersona.sdk2.camera.b> iVar, ft.i<fn.n0> iVar2, ft.i<hn.i0> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        return new n(iVar, iVar2, iVar3, iVar4);
    }

    public static com.withpersona.sdk2.inquiry.selfie.d c(com.withpersona.sdk2.camera.b bVar, ct.a<fn.n0> aVar, hn.i0 i0Var, TrackingEventsLogger trackingEventsLogger) {
        return new com.withpersona.sdk2.inquiry.selfie.d(bVar, aVar, i0Var, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.selfie.d get() {
        return c(this.f36164a.get(), ft.c.b(this.b), this.f36165c.get(), this.f36166d.get());
    }
}

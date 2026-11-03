package xp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements dt.d<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.b> f36231a;
    public final dt.i<dn.n0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f36232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<eo.e> f36233d;

    public q0(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<TrackingEventsLogger> iVar3, dt.i<eo.e> iVar4) {
        this.f36231a = iVar;
        this.b = iVar2;
        this.f36232c = iVar3;
        this.f36233d = iVar4;
    }

    public static q0 a(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<TrackingEventsLogger> iVar3, dt.i<eo.e> iVar4) {
        return new q0(iVar, iVar2, iVar3, iVar4);
    }

    public static p0 c(com.withpersona.sdk2.camera.b bVar, at.a<dn.n0> aVar, TrackingEventsLogger trackingEventsLogger, eo.e eVar) {
        return new p0(bVar, aVar, trackingEventsLogger, eVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f36231a.get(), dt.c.b(this.b), this.f36232c.get(), this.f36233d.get());
    }
}

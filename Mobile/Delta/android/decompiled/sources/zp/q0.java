package zp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements ft.d<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.camera.b> f38108a;
    public final ft.i<fn.n0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f38109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<go.e> f38110d;

    public q0(ft.i<com.withpersona.sdk2.camera.b> iVar, ft.i<fn.n0> iVar2, ft.i<TrackingEventsLogger> iVar3, ft.i<go.e> iVar4) {
        this.f38108a = iVar;
        this.b = iVar2;
        this.f38109c = iVar3;
        this.f38110d = iVar4;
    }

    public static q0 a(ft.i<com.withpersona.sdk2.camera.b> iVar, ft.i<fn.n0> iVar2, ft.i<TrackingEventsLogger> iVar3, ft.i<go.e> iVar4) {
        return new q0(iVar, iVar2, iVar3, iVar4);
    }

    public static p0 c(com.withpersona.sdk2.camera.b bVar, ct.a<fn.n0> aVar, TrackingEventsLogger trackingEventsLogger, go.e eVar) {
        return new p0(bVar, aVar, trackingEventsLogger, eVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f38108a.get(), ft.c.b(this.b), this.f38109c.get(), this.f38110d.get());
    }
}

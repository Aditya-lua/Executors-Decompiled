package ko;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements ft.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<fn.x> f22377a;
    public final ft.i<com.withpersona.sdk2.camera.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<go.e> f22378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f22379d;

    public a0(ft.i<fn.x> iVar, ft.i<com.withpersona.sdk2.camera.b> iVar2, ft.i<go.e> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        this.f22377a = iVar;
        this.b = iVar2;
        this.f22378c = iVar3;
        this.f22379d = iVar4;
    }

    public static a0 a(ft.i<fn.x> iVar, ft.i<com.withpersona.sdk2.camera.b> iVar2, ft.i<go.e> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        return new a0(iVar, iVar2, iVar3, iVar4);
    }

    public static z c(fn.x xVar, com.withpersona.sdk2.camera.b bVar, go.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new z(xVar, bVar, eVar, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f22377a.get(), this.b.get(), this.f22378c.get(), this.f22379d.get());
    }
}

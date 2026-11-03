package io;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements dt.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<dn.x> f21198a;
    public final dt.i<com.withpersona.sdk2.camera.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<eo.e> f21199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f21200d;

    public a0(dt.i<dn.x> iVar, dt.i<com.withpersona.sdk2.camera.b> iVar2, dt.i<eo.e> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        this.f21198a = iVar;
        this.b = iVar2;
        this.f21199c = iVar3;
        this.f21200d = iVar4;
    }

    public static a0 a(dt.i<dn.x> iVar, dt.i<com.withpersona.sdk2.camera.b> iVar2, dt.i<eo.e> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        return new a0(iVar, iVar2, iVar3, iVar4);
    }

    public static z c(dn.x xVar, com.withpersona.sdk2.camera.b bVar, eo.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new z(xVar, bVar, eVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f21198a.get(), this.b.get(), this.f21199c.get(), this.f21200d.get());
    }
}

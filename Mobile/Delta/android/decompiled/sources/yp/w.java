package yp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements ft.d<com.withpersona.sdk2.inquiry.selfie.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<pq.c> f36309a;
    public final ft.i<TrackingEventsLogger> b;

    public w(ft.i<pq.c> iVar, ft.i<TrackingEventsLogger> iVar2) {
        this.f36309a = iVar;
        this.b = iVar2;
    }

    public static w a(ft.i<pq.c> iVar, ft.i<TrackingEventsLogger> iVar2) {
        return new w(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.selfie.g c(pq.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new com.withpersona.sdk2.inquiry.selfie.g(cVar, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.selfie.g get() {
        return c(this.f36309a.get(), this.b.get());
    }
}

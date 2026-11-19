package mq;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements wt.d<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<dr.c> f23594a;
    public final wt.i<TrackingEventsLogger> b;

    public g0(wt.i<dr.c> iVar, wt.i<TrackingEventsLogger> iVar2) {
        this.f23594a = iVar;
        this.b = iVar2;
    }

    public static g0 a(wt.i<dr.c> iVar, wt.i<TrackingEventsLogger> iVar2) {
        return new g0(iVar, iVar2);
    }

    public static f0 c(dr.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new f0(cVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f23594a.get(), this.b.get());
    }
}

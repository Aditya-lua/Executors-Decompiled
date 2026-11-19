package mq;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements wt.d<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<sn.t> f24060a;
    public final wt.i<sn.b1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.i0> f24061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f24062d;

    public r(wt.i<sn.t> iVar, wt.i<sn.b1> iVar2, wt.i<un.i0> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        this.f24060a = iVar;
        this.b = iVar2;
        this.f24061c = iVar3;
        this.f24062d = iVar4;
    }

    public static r a(wt.i<sn.t> iVar, wt.i<sn.b1> iVar2, wt.i<un.i0> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        return new r(iVar, iVar2, iVar3, iVar4);
    }

    public static p c(sn.t tVar, tt.a<sn.b1> aVar, un.i0 i0Var, TrackingEventsLogger trackingEventsLogger) {
        return new p(tVar, aVar, i0Var, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f24060a.get(), wt.c.b(this.b), this.f24061c.get(), this.f24062d.get());
    }
}

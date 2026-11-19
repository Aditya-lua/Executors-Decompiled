package nq;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import sn.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements wt.d<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<sn.t> f26578a;
    public final wt.i<b1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f26579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<to.e> f26580d;

    public q0(wt.i<sn.t> iVar, wt.i<b1> iVar2, wt.i<TrackingEventsLogger> iVar3, wt.i<to.e> iVar4) {
        this.f26578a = iVar;
        this.b = iVar2;
        this.f26579c = iVar3;
        this.f26580d = iVar4;
    }

    public static q0 a(wt.i<sn.t> iVar, wt.i<b1> iVar2, wt.i<TrackingEventsLogger> iVar3, wt.i<to.e> iVar4) {
        return new q0(iVar, iVar2, iVar3, iVar4);
    }

    public static p0 c(sn.t tVar, tt.a<b1> aVar, TrackingEventsLogger trackingEventsLogger, to.e eVar) {
        return new p0(tVar, aVar, trackingEventsLogger, eVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f26578a.get(), wt.c.b(this.b), this.f26579c.get(), this.f26580d.get());
    }
}

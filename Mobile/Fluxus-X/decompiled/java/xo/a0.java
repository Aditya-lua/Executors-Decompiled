package xo;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import sn.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements wt.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<h0> f36836a;
    public final wt.i<sn.t> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<to.e> f36837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f36838d;

    public a0(wt.i<h0> iVar, wt.i<sn.t> iVar2, wt.i<to.e> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        this.f36836a = iVar;
        this.b = iVar2;
        this.f36837c = iVar3;
        this.f36838d = iVar4;
    }

    public static a0 a(wt.i<h0> iVar, wt.i<sn.t> iVar2, wt.i<to.e> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        return new a0(iVar, iVar2, iVar3, iVar4);
    }

    public static z c(h0 h0Var, sn.t tVar, to.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new z(h0Var, tVar, eVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f36836a.get(), this.b.get(), this.f36837c.get(), this.f36838d.get());
    }
}

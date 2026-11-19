package fp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements wt.d<j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16281a;
    public final wt.i<sn.a0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.c.a> f16282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<ir.b> f16283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f16284e;

    public k1(wt.i<Context> iVar, wt.i<sn.a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        this.f16281a = iVar;
        this.b = iVar2;
        this.f16282c = iVar3;
        this.f16283d = iVar4;
        this.f16284e = iVar5;
    }

    public static k1 a(wt.i<Context> iVar, wt.i<sn.a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        return new k1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j1 c(Context context, sn.a0.a aVar, un.c.a aVar2, ir.b bVar, TrackingEventsLogger trackingEventsLogger) {
        return new j1(context, aVar, aVar2, bVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 get() {
        return c(this.f16281a.get(), this.b.get(), this.f16282c.get(), this.f16283d.get(), this.f16284e.get());
    }
}

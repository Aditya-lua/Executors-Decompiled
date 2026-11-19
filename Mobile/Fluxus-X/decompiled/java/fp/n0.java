package fp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import cp.GovernmentIdHintWorker;
import vo.GovernmentIdAnalyzeWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements wt.d<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16311a;
    public final wt.i<GovernmentIdAnalyzeWorker.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<GovernmentIdHintWorker.b> f16312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<js.b.a> f16313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<sn.a0.a> f16314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<un.c.a> f16315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<ir.b> f16316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f16317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wt.i<hq.i.a> f16318i;

    public n0(wt.i<Context> iVar, wt.i<GovernmentIdAnalyzeWorker.a> iVar2, wt.i<GovernmentIdHintWorker.b> iVar3, wt.i<js.b.a> iVar4, wt.i<sn.a0.a> iVar5, wt.i<un.c.a> iVar6, wt.i<ir.b> iVar7, wt.i<TrackingEventsLogger> iVar8, wt.i<hq.i.a> iVar9) {
        this.f16311a = iVar;
        this.b = iVar2;
        this.f16312c = iVar3;
        this.f16313d = iVar4;
        this.f16314e = iVar5;
        this.f16315f = iVar6;
        this.f16316g = iVar7;
        this.f16317h = iVar8;
        this.f16318i = iVar9;
    }

    public static n0 a(wt.i<Context> iVar, wt.i<GovernmentIdAnalyzeWorker.a> iVar2, wt.i<GovernmentIdHintWorker.b> iVar3, wt.i<js.b.a> iVar4, wt.i<sn.a0.a> iVar5, wt.i<un.c.a> iVar6, wt.i<ir.b> iVar7, wt.i<TrackingEventsLogger> iVar8, wt.i<hq.i.a> iVar9) {
        return new n0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static m0 c(Context context, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, js.b.a aVar2, sn.a0.a aVar3, un.c.a aVar4, ir.b bVar2, TrackingEventsLogger trackingEventsLogger, hq.i.a aVar5) {
        return new m0(context, aVar, bVar, aVar2, aVar3, aVar4, bVar2, trackingEventsLogger, aVar5);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f16311a.get(), this.b.get(), this.f16312c.get(), this.f16313d.get(), this.f16314e.get(), this.f16315f.get(), this.f16316g.get(), this.f16317h.get(), this.f16318i.get());
    }
}

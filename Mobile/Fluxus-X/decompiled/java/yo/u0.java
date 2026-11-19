package yo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import cp.GovernmentIdHintWorker;
import fq.n1;
import vo.GovernmentIdAnalyzeWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements wt.d<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f38057a;
    public final wt.i<n1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<GovernmentIdAnalyzeWorker.a> f38058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<GovernmentIdHintWorker.b> f38059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<js.b.a> f38060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<sn.a0.a> f38061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<un.c.a> f38062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<ir.b> f38063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f38064i;

    public u0(wt.i<Context> iVar, wt.i<n1> iVar2, wt.i<GovernmentIdAnalyzeWorker.a> iVar3, wt.i<GovernmentIdHintWorker.b> iVar4, wt.i<js.b.a> iVar5, wt.i<sn.a0.a> iVar6, wt.i<un.c.a> iVar7, wt.i<ir.b> iVar8, wt.i<TrackingEventsLogger> iVar9) {
        this.f38057a = iVar;
        this.b = iVar2;
        this.f38058c = iVar3;
        this.f38059d = iVar4;
        this.f38060e = iVar5;
        this.f38061f = iVar6;
        this.f38062g = iVar7;
        this.f38063h = iVar8;
        this.f38064i = iVar9;
    }

    public static u0 a(wt.i<Context> iVar, wt.i<n1> iVar2, wt.i<GovernmentIdAnalyzeWorker.a> iVar3, wt.i<GovernmentIdHintWorker.b> iVar4, wt.i<js.b.a> iVar5, wt.i<sn.a0.a> iVar6, wt.i<un.c.a> iVar7, wt.i<ir.b> iVar8, wt.i<TrackingEventsLogger> iVar9) {
        return new u0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static t0 c(Context context, n1 n1Var, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, js.b.a aVar2, sn.a0.a aVar3, un.c.a aVar4, ir.b bVar2, TrackingEventsLogger trackingEventsLogger) {
        return new t0(context, n1Var, aVar, bVar, aVar2, aVar3, aVar4, bVar2, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f38057a.get(), this.b.get(), this.f38058c.get(), this.f38059d.get(), this.f38060e.get(), this.f38061f.get(), this.f38062g.get(), this.f38063h.get(), this.f38064i.get());
    }
}

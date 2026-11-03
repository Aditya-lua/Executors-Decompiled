package po;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import mo.GovernmentIdHintWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements dt.d<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28883a;
    public final dt.i<GovernmentIdAnalyzeWorker.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<GovernmentIdHintWorker.b> f28884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<rr.b.a> f28885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.e.a> f28886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<fn.c.a> f28887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<sq.a> f28888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f28890i;

    public n0(dt.i<Context> iVar, dt.i<GovernmentIdAnalyzeWorker.a> iVar2, dt.i<GovernmentIdHintWorker.b> iVar3, dt.i<rr.b.a> iVar4, dt.i<com.withpersona.sdk2.camera.e.a> iVar5, dt.i<fn.c.a> iVar6, dt.i<sq.a> iVar7, dt.i<TrackingEventsLogger> iVar8, dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar9) {
        this.f28883a = iVar;
        this.b = iVar2;
        this.f28884c = iVar3;
        this.f28885d = iVar4;
        this.f28886e = iVar5;
        this.f28887f = iVar6;
        this.f28888g = iVar7;
        this.f28889h = iVar8;
        this.f28890i = iVar9;
    }

    public static n0 a(dt.i<Context> iVar, dt.i<GovernmentIdAnalyzeWorker.a> iVar2, dt.i<GovernmentIdHintWorker.b> iVar3, dt.i<rr.b.a> iVar4, dt.i<com.withpersona.sdk2.camera.e.a> iVar5, dt.i<fn.c.a> iVar6, dt.i<sq.a> iVar7, dt.i<TrackingEventsLogger> iVar8, dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar9) {
        return new n0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static m0 c(Context context, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, rr.b.a aVar2, com.withpersona.sdk2.camera.e.a aVar3, fn.c.a aVar4, sq.a aVar5, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar6) {
        return new m0(context, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger, aVar6);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f28883a.get(), this.b.get(), this.f28884c.get(), this.f28885d.get(), this.f28886e.get(), this.f28887f.get(), this.f28888g.get(), this.f28889h.get(), this.f28890i.get());
    }
}

package jo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import mo.GovernmentIdHintWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements dt.d<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f22113a;
    public final dt.i<PermissionRequestWorkflow> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<GovernmentIdAnalyzeWorker.a> f22114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<GovernmentIdHintWorker.b> f22115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<rr.b.a> f22116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.e.a> f22117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<fn.c.a> f22118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<sq.a> f22119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f22120i;

    public u0(dt.i<Context> iVar, dt.i<PermissionRequestWorkflow> iVar2, dt.i<GovernmentIdAnalyzeWorker.a> iVar3, dt.i<GovernmentIdHintWorker.b> iVar4, dt.i<rr.b.a> iVar5, dt.i<com.withpersona.sdk2.camera.e.a> iVar6, dt.i<fn.c.a> iVar7, dt.i<sq.a> iVar8, dt.i<TrackingEventsLogger> iVar9) {
        this.f22113a = iVar;
        this.b = iVar2;
        this.f22114c = iVar3;
        this.f22115d = iVar4;
        this.f22116e = iVar5;
        this.f22117f = iVar6;
        this.f22118g = iVar7;
        this.f22119h = iVar8;
        this.f22120i = iVar9;
    }

    public static u0 a(dt.i<Context> iVar, dt.i<PermissionRequestWorkflow> iVar2, dt.i<GovernmentIdAnalyzeWorker.a> iVar3, dt.i<GovernmentIdHintWorker.b> iVar4, dt.i<rr.b.a> iVar5, dt.i<com.withpersona.sdk2.camera.e.a> iVar6, dt.i<fn.c.a> iVar7, dt.i<sq.a> iVar8, dt.i<TrackingEventsLogger> iVar9) {
        return new u0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static t0 c(Context context, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, rr.b.a aVar2, com.withpersona.sdk2.camera.e.a aVar3, fn.c.a aVar4, sq.a aVar5, TrackingEventsLogger trackingEventsLogger) {
        return new t0(context, permissionRequestWorkflow, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f22113a.get(), this.b.get(), this.f22114c.get(), this.f22115d.get(), this.f22116e.get(), this.f22117f.get(), this.f22118g.get(), this.f22119h.get(), this.f22120i.get());
    }
}

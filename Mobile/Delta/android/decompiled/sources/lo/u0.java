package lo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import oo.GovernmentIdHintWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements ft.d<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f23460a;
    public final ft.i<PermissionRequestWorkflow> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<GovernmentIdAnalyzeWorker.a> f23461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<GovernmentIdHintWorker.b> f23462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<tr.b.a> f23463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.camera.e.a> f23464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<hn.c.a> f23465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<uq.a> f23466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f23467i;

    public u0(ft.i<Context> iVar, ft.i<PermissionRequestWorkflow> iVar2, ft.i<GovernmentIdAnalyzeWorker.a> iVar3, ft.i<GovernmentIdHintWorker.b> iVar4, ft.i<tr.b.a> iVar5, ft.i<com.withpersona.sdk2.camera.e.a> iVar6, ft.i<hn.c.a> iVar7, ft.i<uq.a> iVar8, ft.i<TrackingEventsLogger> iVar9) {
        this.f23460a = iVar;
        this.b = iVar2;
        this.f23461c = iVar3;
        this.f23462d = iVar4;
        this.f23463e = iVar5;
        this.f23464f = iVar6;
        this.f23465g = iVar7;
        this.f23466h = iVar8;
        this.f23467i = iVar9;
    }

    public static u0 a(ft.i<Context> iVar, ft.i<PermissionRequestWorkflow> iVar2, ft.i<GovernmentIdAnalyzeWorker.a> iVar3, ft.i<GovernmentIdHintWorker.b> iVar4, ft.i<tr.b.a> iVar5, ft.i<com.withpersona.sdk2.camera.e.a> iVar6, ft.i<hn.c.a> iVar7, ft.i<uq.a> iVar8, ft.i<TrackingEventsLogger> iVar9) {
        return new u0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static t0 c(Context context, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, tr.b.a aVar2, com.withpersona.sdk2.camera.e.a aVar3, hn.c.a aVar4, uq.a aVar5, TrackingEventsLogger trackingEventsLogger) {
        return new t0(context, permissionRequestWorkflow, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f23460a.get(), this.b.get(), this.f23461c.get(), this.f23462d.get(), this.f23463e.get(), this.f23464f.get(), this.f23465g.get(), this.f23466h.get(), this.f23467i.get());
    }
}

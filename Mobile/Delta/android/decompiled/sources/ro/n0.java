package ro;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import oo.GovernmentIdHintWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements ft.d<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f30023a;
    public final ft.i<GovernmentIdAnalyzeWorker.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<GovernmentIdHintWorker.b> f30024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<tr.b.a> f30025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.camera.e.a> f30026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<hn.c.a> f30027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<uq.a> f30028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f30029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f30030i;

    public n0(ft.i<Context> iVar, ft.i<GovernmentIdAnalyzeWorker.a> iVar2, ft.i<GovernmentIdHintWorker.b> iVar3, ft.i<tr.b.a> iVar4, ft.i<com.withpersona.sdk2.camera.e.a> iVar5, ft.i<hn.c.a> iVar6, ft.i<uq.a> iVar7, ft.i<TrackingEventsLogger> iVar8, ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar9) {
        this.f30023a = iVar;
        this.b = iVar2;
        this.f30024c = iVar3;
        this.f30025d = iVar4;
        this.f30026e = iVar5;
        this.f30027f = iVar6;
        this.f30028g = iVar7;
        this.f30029h = iVar8;
        this.f30030i = iVar9;
    }

    public static n0 a(ft.i<Context> iVar, ft.i<GovernmentIdAnalyzeWorker.a> iVar2, ft.i<GovernmentIdHintWorker.b> iVar3, ft.i<tr.b.a> iVar4, ft.i<com.withpersona.sdk2.camera.e.a> iVar5, ft.i<hn.c.a> iVar6, ft.i<uq.a> iVar7, ft.i<TrackingEventsLogger> iVar8, ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar9) {
        return new n0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static m0 c(Context context, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, tr.b.a aVar2, com.withpersona.sdk2.camera.e.a aVar3, hn.c.a aVar4, uq.a aVar5, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar6) {
        return new m0(context, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger, aVar6);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f30023a.get(), this.b.get(), this.f30024c.get(), this.f30025d.get(), this.f30026e.get(), this.f30027f.get(), this.f30028g.get(), this.f30029h.get(), this.f30030i.get());
    }
}

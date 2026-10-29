package rr;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f30308a;
    public final ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<lp.n.a> f30309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<wp.c> f30310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.ui.d.a> f30311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.ui.k.a> f30312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<uq.a> f30313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<e0> f30314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<pq.c> f30315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<go.e> f30316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f30317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f30318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<ku.p0> f30319m;

    public h1(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, ft.i<lp.n.a> iVar3, ft.i<wp.c> iVar4, ft.i<com.withpersona.sdk2.inquiry.ui.d.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.ui.k.a> iVar6, ft.i<uq.a> iVar7, ft.i<e0> iVar8, ft.i<pq.c> iVar9, ft.i<go.e> iVar10, ft.i<TrackingEventsLogger> iVar11, ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar12, ft.i<ku.p0> iVar13) {
        this.f30308a = iVar;
        this.b = iVar2;
        this.f30309c = iVar3;
        this.f30310d = iVar4;
        this.f30311e = iVar5;
        this.f30312f = iVar6;
        this.f30313g = iVar7;
        this.f30314h = iVar8;
        this.f30315i = iVar9;
        this.f30316j = iVar10;
        this.f30317k = iVar11;
        this.f30318l = iVar12;
        this.f30319m = iVar13;
    }

    public static h1 a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, ft.i<lp.n.a> iVar3, ft.i<wp.c> iVar4, ft.i<com.withpersona.sdk2.inquiry.ui.d.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.ui.k.a> iVar6, ft.i<uq.a> iVar7, ft.i<e0> iVar8, ft.i<pq.c> iVar9, ft.i<go.e> iVar10, ft.i<TrackingEventsLogger> iVar11, ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar12, ft.i<ku.p0> iVar13) {
        return new h1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13);
    }

    public static g1 c(UiWorkflow.Input input, androidx.p000lifecycle.l0 l0Var, Context context, com.withpersona.sdk2.inquiry.nfc.b.a aVar, lp.n.a aVar2, wp.c cVar, com.withpersona.sdk2.inquiry.ui.d.a aVar3, com.withpersona.sdk2.inquiry.ui.k.a aVar4, uq.a aVar5, e0 e0Var, pq.c cVar2, go.e eVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar6, ku.p0 p0Var) {
        return new g1(input, l0Var, context, aVar, aVar2, cVar, aVar3, aVar4, aVar5, e0Var, cVar2, eVar, trackingEventsLogger, aVar6, p0Var);
    }

    public g1 b(UiWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return c(input, l0Var, this.f30308a.get(), this.b.get(), this.f30309c.get(), this.f30310d.get(), this.f30311e.get(), this.f30312f.get(), this.f30313g.get(), this.f30314h.get(), this.f30315i.get(), this.f30316j.get(), this.f30317k.get(), this.f30318l.get(), this.f30319m.get());
    }
}

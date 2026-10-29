package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import lp.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<UiWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f13895a;
    public final ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<n.a> f13896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<wp.c> f13897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<d.a> f13898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<k.a> f13899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<uq.a> f13900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<PermissionRequestWorkflow> f13901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<a> f13902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<pq.c> f13903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<go.e> f13904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f13905l;

    public j(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, ft.i<n.a> iVar3, ft.i<wp.c> iVar4, ft.i<d.a> iVar5, ft.i<k.a> iVar6, ft.i<uq.a> iVar7, ft.i<PermissionRequestWorkflow> iVar8, ft.i<a> iVar9, ft.i<pq.c> iVar10, ft.i<go.e> iVar11, ft.i<TrackingEventsLogger> iVar12) {
        this.f13895a = iVar;
        this.b = iVar2;
        this.f13896c = iVar3;
        this.f13897d = iVar4;
        this.f13898e = iVar5;
        this.f13899f = iVar6;
        this.f13900g = iVar7;
        this.f13901h = iVar8;
        this.f13902i = iVar9;
        this.f13903j = iVar10;
        this.f13904k = iVar11;
        this.f13905l = iVar12;
    }

    public static j a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, ft.i<n.a> iVar3, ft.i<wp.c> iVar4, ft.i<d.a> iVar5, ft.i<k.a> iVar6, ft.i<uq.a> iVar7, ft.i<PermissionRequestWorkflow> iVar8, ft.i<a> iVar9, ft.i<pq.c> iVar10, ft.i<go.e> iVar11, ft.i<TrackingEventsLogger> iVar12) {
        return new j(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12);
    }

    public static UiWorkflow c(Context context, com.withpersona.sdk2.inquiry.nfc.b.a aVar, n.a aVar2, wp.c cVar, d.a aVar3, k.a aVar4, uq.a aVar5, PermissionRequestWorkflow permissionRequestWorkflow, a aVar6, pq.c cVar2, go.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new UiWorkflow(context, aVar, aVar2, cVar, aVar3, aVar4, aVar5, permissionRequestWorkflow, aVar6, cVar2, eVar, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiWorkflow get() {
        return c(this.f13895a.get(), this.b.get(), this.f13896c.get(), this.f13897d.get(), this.f13898e.get(), this.f13899f.get(), this.f13900g.get(), this.f13901h.get(), this.f13902i.get(), this.f13903j.get(), this.f13904k.get(), this.f13905l.get());
    }
}

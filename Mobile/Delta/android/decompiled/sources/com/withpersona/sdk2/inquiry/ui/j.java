package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import jp.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<UiWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13976a;
    public final dt.i<com.withpersona.sdk2.inquiry.nfc.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<n.a> f13977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<up.c> f13978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<d.a> f13979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<k.a> f13980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<sq.a> f13981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f13982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<a> f13983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<nq.c> f13984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<eo.e> f13985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f13986l;

    public j(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<PermissionRequestWorkflow> iVar8, dt.i<a> iVar9, dt.i<nq.c> iVar10, dt.i<eo.e> iVar11, dt.i<TrackingEventsLogger> iVar12) {
        this.f13976a = iVar;
        this.b = iVar2;
        this.f13977c = iVar3;
        this.f13978d = iVar4;
        this.f13979e = iVar5;
        this.f13980f = iVar6;
        this.f13981g = iVar7;
        this.f13982h = iVar8;
        this.f13983i = iVar9;
        this.f13984j = iVar10;
        this.f13985k = iVar11;
        this.f13986l = iVar12;
    }

    public static j a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.nfc.b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<PermissionRequestWorkflow> iVar8, dt.i<a> iVar9, dt.i<nq.c> iVar10, dt.i<eo.e> iVar11, dt.i<TrackingEventsLogger> iVar12) {
        return new j(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12);
    }

    public static UiWorkflow c(Context context, com.withpersona.sdk2.inquiry.nfc.b.a aVar, n.a aVar2, up.c cVar, d.a aVar3, k.a aVar4, sq.a aVar5, PermissionRequestWorkflow permissionRequestWorkflow, a aVar6, nq.c cVar2, eo.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new UiWorkflow(context, aVar, aVar2, cVar, aVar3, aVar4, aVar5, permissionRequestWorkflow, aVar6, cVar2, eVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiWorkflow get() {
        return c(this.f13976a.get(), this.b.get(), this.f13977c.get(), this.f13978d.get(), this.f13979e.get(), this.f13980f.get(), this.f13981g.get(), this.f13982h.get(), this.f13983i.get(), this.f13984j.get(), this.f13985k.get(), this.f13986l.get());
    }
}

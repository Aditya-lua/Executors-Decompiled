package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import k6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ft.d<DocumentWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<s> f10197a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<PermissionRequestWorkflow> f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<a> f10199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<i.b> f10200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.document.network.a.C0179a> f10201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.document.network.e.a> f10202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.document.network.c.a> f10203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<bo.a.C0086a> f10204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.document.network.g.a> f10205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<uq.a> f10206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<pq.c> f10207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f10208m;

    public h(ft.i<s> iVar, ft.i<Context> iVar2, ft.i<PermissionRequestWorkflow> iVar3, ft.i<a> iVar4, ft.i<i.b> iVar5, ft.i<com.withpersona.sdk2.inquiry.document.network.a.C0179a> iVar6, ft.i<com.withpersona.sdk2.inquiry.document.network.e.a> iVar7, ft.i<com.withpersona.sdk2.inquiry.document.network.c.a> iVar8, ft.i<bo.a.C0086a> iVar9, ft.i<com.withpersona.sdk2.inquiry.document.network.g.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13) {
        this.f10197a = iVar;
        this.b = iVar2;
        this.f10198c = iVar3;
        this.f10199d = iVar4;
        this.f10200e = iVar5;
        this.f10201f = iVar6;
        this.f10202g = iVar7;
        this.f10203h = iVar8;
        this.f10204i = iVar9;
        this.f10205j = iVar10;
        this.f10206k = iVar11;
        this.f10207l = iVar12;
        this.f10208m = iVar13;
    }

    public static h a(ft.i<s> iVar, ft.i<Context> iVar2, ft.i<PermissionRequestWorkflow> iVar3, ft.i<a> iVar4, ft.i<i.b> iVar5, ft.i<com.withpersona.sdk2.inquiry.document.network.a.C0179a> iVar6, ft.i<com.withpersona.sdk2.inquiry.document.network.e.a> iVar7, ft.i<com.withpersona.sdk2.inquiry.document.network.c.a> iVar8, ft.i<bo.a.C0086a> iVar9, ft.i<com.withpersona.sdk2.inquiry.document.network.g.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13);
    }

    public static DocumentWorkflow c(s sVar, Context context, PermissionRequestWorkflow permissionRequestWorkflow, a aVar, i.b bVar, com.withpersona.sdk2.inquiry.document.network.a.C0179a c0179a, com.withpersona.sdk2.inquiry.document.network.e.a aVar2, com.withpersona.sdk2.inquiry.document.network.c.a aVar3, bo.a.C0086a c0086a, com.withpersona.sdk2.inquiry.document.network.g.a aVar4, uq.a aVar5, pq.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new DocumentWorkflow(sVar, context, permissionRequestWorkflow, aVar, bVar, c0179a, aVar2, aVar3, c0086a, aVar4, aVar5, cVar, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentWorkflow get() {
        return c(this.f10197a.get(), this.b.get(), this.f10198c.get(), this.f10199d.get(), this.f10200e.get(), this.f10201f.get(), this.f10202g.get(), this.f10203h.get(), this.f10204i.get(), this.f10205j.get(), this.f10206k.get(), this.f10207l.get(), this.f10208m.get());
    }
}

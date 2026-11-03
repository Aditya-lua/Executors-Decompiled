package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import k6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<DocumentWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<s> f10278a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f10279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<a> f10280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<i.b> f10281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.document.network.a.C0182a> f10282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.document.network.e.a> f10283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.document.network.c.a> f10284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<zn.a.C0693a> f10285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.document.network.g.a> f10286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f10287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f10288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f10289m;

    public h(dt.i<s> iVar, dt.i<Context> iVar2, dt.i<PermissionRequestWorkflow> iVar3, dt.i<a> iVar4, dt.i<i.b> iVar5, dt.i<com.withpersona.sdk2.inquiry.document.network.a.C0182a> iVar6, dt.i<com.withpersona.sdk2.inquiry.document.network.e.a> iVar7, dt.i<com.withpersona.sdk2.inquiry.document.network.c.a> iVar8, dt.i<zn.a.C0693a> iVar9, dt.i<com.withpersona.sdk2.inquiry.document.network.g.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13) {
        this.f10278a = iVar;
        this.b = iVar2;
        this.f10279c = iVar3;
        this.f10280d = iVar4;
        this.f10281e = iVar5;
        this.f10282f = iVar6;
        this.f10283g = iVar7;
        this.f10284h = iVar8;
        this.f10285i = iVar9;
        this.f10286j = iVar10;
        this.f10287k = iVar11;
        this.f10288l = iVar12;
        this.f10289m = iVar13;
    }

    public static h a(dt.i<s> iVar, dt.i<Context> iVar2, dt.i<PermissionRequestWorkflow> iVar3, dt.i<a> iVar4, dt.i<i.b> iVar5, dt.i<com.withpersona.sdk2.inquiry.document.network.a.C0182a> iVar6, dt.i<com.withpersona.sdk2.inquiry.document.network.e.a> iVar7, dt.i<com.withpersona.sdk2.inquiry.document.network.c.a> iVar8, dt.i<zn.a.C0693a> iVar9, dt.i<com.withpersona.sdk2.inquiry.document.network.g.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13);
    }

    public static DocumentWorkflow c(s sVar, Context context, PermissionRequestWorkflow permissionRequestWorkflow, a aVar, i.b bVar, com.withpersona.sdk2.inquiry.document.network.a.C0182a c0182a, com.withpersona.sdk2.inquiry.document.network.e.a aVar2, com.withpersona.sdk2.inquiry.document.network.c.a aVar3, zn.a.C0693a c0693a, com.withpersona.sdk2.inquiry.document.network.g.a aVar4, sq.a aVar5, nq.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new DocumentWorkflow(sVar, context, permissionRequestWorkflow, aVar, bVar, c0182a, aVar2, aVar3, c0693a, aVar4, aVar5, cVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentWorkflow get() {
        return c(this.f10278a.get(), this.b.get(), this.f10279c.get(), this.f10280d.get(), this.f10281e.get(), this.f10282f.get(), this.f10283g.get(), this.f10284h.get(), this.f10285i.get(), this.f10286j.get(), this.f10287k.get(), this.f10288l.get(), this.f10289m.get());
    }
}

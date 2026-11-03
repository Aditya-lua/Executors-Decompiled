package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements dt.d<SelfieWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13100a;
    public final dt.i<aq.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<rr.b.a> f13101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<e.b> f13102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f13103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<fq.j> f13104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.e.a> f13105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<fn.c.a> f13106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<jn.a> f13107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<sq.a> f13108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<DirectFileUploader> f13109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<bq.a.b> f13110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f13111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dt.i<g> f13112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dt.i<oq.c> f13113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dt.i<eo.e> f13114p;

    public q(dt.i<Context> iVar, dt.i<aq.b.a> iVar2, dt.i<rr.b.a> iVar3, dt.i<e.b> iVar4, dt.i<PermissionRequestWorkflow> iVar5, dt.i<fq.j> iVar6, dt.i<com.withpersona.sdk2.camera.e.a> iVar7, dt.i<fn.c.a> iVar8, dt.i<jn.a> iVar9, dt.i<sq.a> iVar10, dt.i<DirectFileUploader> iVar11, dt.i<bq.a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, dt.i<g> iVar14, dt.i<oq.c> iVar15, dt.i<eo.e> iVar16) {
        this.f13100a = iVar;
        this.b = iVar2;
        this.f13101c = iVar3;
        this.f13102d = iVar4;
        this.f13103e = iVar5;
        this.f13104f = iVar6;
        this.f13105g = iVar7;
        this.f13106h = iVar8;
        this.f13107i = iVar9;
        this.f13108j = iVar10;
        this.f13109k = iVar11;
        this.f13110l = iVar12;
        this.f13111m = iVar13;
        this.f13112n = iVar14;
        this.f13113o = iVar15;
        this.f13114p = iVar16;
    }

    public static q a(dt.i<Context> iVar, dt.i<aq.b.a> iVar2, dt.i<rr.b.a> iVar3, dt.i<e.b> iVar4, dt.i<PermissionRequestWorkflow> iVar5, dt.i<fq.j> iVar6, dt.i<com.withpersona.sdk2.camera.e.a> iVar7, dt.i<fn.c.a> iVar8, dt.i<jn.a> iVar9, dt.i<sq.a> iVar10, dt.i<DirectFileUploader> iVar11, dt.i<bq.a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, dt.i<g> iVar14, dt.i<oq.c> iVar15, dt.i<eo.e> iVar16) {
        return new q(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16);
    }

    public static SelfieWorkflow c(Context context, aq.b.a aVar, rr.b.a aVar2, e.b bVar, PermissionRequestWorkflow permissionRequestWorkflow, fq.j jVar, com.withpersona.sdk2.camera.e.a aVar3, fn.c.a aVar4, jn.a aVar5, sq.a aVar6, DirectFileUploader directFileUploader, bq.a.b bVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar7, g gVar, oq.c cVar, eo.e eVar) {
        return new SelfieWorkflow(context, aVar, aVar2, bVar, permissionRequestWorkflow, jVar, aVar3, aVar4, aVar5, aVar6, directFileUploader, bVar2, aVar7, gVar, cVar, eVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SelfieWorkflow get() {
        return c(this.f13100a.get(), this.b.get(), this.f13101c.get(), this.f13102d.get(), this.f13103e.get(), this.f13104f.get(), this.f13105g.get(), this.f13106h.get(), this.f13107i.get(), this.f13108j.get(), this.f13109k.get(), this.f13110l.get(), this.f13111m.get(), this.f13112n.get(), this.f13113o.get(), this.f13114p.get());
    }
}

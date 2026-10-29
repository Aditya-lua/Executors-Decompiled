package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<SelfieWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f13019a;
    public final ft.i<cq.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<tr.b.a> f13020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<e.b> f13021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<PermissionRequestWorkflow> f13022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<hq.j> f13023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.camera.e.a> f13024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<hn.c.a> f13025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<ln.a> f13026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<uq.a> f13027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<DirectFileUploader> f13028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<dq.a.b> f13029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f13030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ft.i<g> f13031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ft.i<qq.c> f13032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ft.i<go.e> f13033p;

    public q(ft.i<Context> iVar, ft.i<cq.b.a> iVar2, ft.i<tr.b.a> iVar3, ft.i<e.b> iVar4, ft.i<PermissionRequestWorkflow> iVar5, ft.i<hq.j> iVar6, ft.i<com.withpersona.sdk2.camera.e.a> iVar7, ft.i<hn.c.a> iVar8, ft.i<ln.a> iVar9, ft.i<uq.a> iVar10, ft.i<DirectFileUploader> iVar11, ft.i<dq.a.b> iVar12, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, ft.i<g> iVar14, ft.i<qq.c> iVar15, ft.i<go.e> iVar16) {
        this.f13019a = iVar;
        this.b = iVar2;
        this.f13020c = iVar3;
        this.f13021d = iVar4;
        this.f13022e = iVar5;
        this.f13023f = iVar6;
        this.f13024g = iVar7;
        this.f13025h = iVar8;
        this.f13026i = iVar9;
        this.f13027j = iVar10;
        this.f13028k = iVar11;
        this.f13029l = iVar12;
        this.f13030m = iVar13;
        this.f13031n = iVar14;
        this.f13032o = iVar15;
        this.f13033p = iVar16;
    }

    public static q a(ft.i<Context> iVar, ft.i<cq.b.a> iVar2, ft.i<tr.b.a> iVar3, ft.i<e.b> iVar4, ft.i<PermissionRequestWorkflow> iVar5, ft.i<hq.j> iVar6, ft.i<com.withpersona.sdk2.camera.e.a> iVar7, ft.i<hn.c.a> iVar8, ft.i<ln.a> iVar9, ft.i<uq.a> iVar10, ft.i<DirectFileUploader> iVar11, ft.i<dq.a.b> iVar12, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, ft.i<g> iVar14, ft.i<qq.c> iVar15, ft.i<go.e> iVar16) {
        return new q(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16);
    }

    public static SelfieWorkflow c(Context context, cq.b.a aVar, tr.b.a aVar2, e.b bVar, PermissionRequestWorkflow permissionRequestWorkflow, hq.j jVar, com.withpersona.sdk2.camera.e.a aVar3, hn.c.a aVar4, ln.a aVar5, uq.a aVar6, DirectFileUploader directFileUploader, dq.a.b bVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar7, g gVar, qq.c cVar, go.e eVar) {
        return new SelfieWorkflow(context, aVar, aVar2, bVar, permissionRequestWorkflow, jVar, aVar3, aVar4, aVar5, aVar6, directFileUploader, bVar2, aVar7, gVar, cVar, eVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SelfieWorkflow get() {
        return c(this.f13019a.get(), this.b.get(), this.f13020c.get(), this.f13021d.get(), this.f13022e.get(), this.f13023f.get(), this.f13024g.get(), this.f13025h.get(), this.f13026i.get(), this.f13027j.get(), this.f13028k.get(), this.f13029l.get(), this.f13030m.get(), this.f13031n.get(), this.f13032o.get(), this.f13033p.get());
    }
}

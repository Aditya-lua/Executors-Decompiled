package dq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f15353a;
    public final dt.i<aq.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<rr.b.a> f15354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.selfie.e.b> f15355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f15356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.e.a> f15357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<fn.c.a> f15358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dt.i<jn.a> f15359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dt.i<sq.a> f15360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dt.i<DirectFileUploader> f15361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt.i<iu.p0> f15362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dt.i<bq.a.b> f15363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.selfie.g> f15364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dt.i<eo.e> f15365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dt.i<oq.c> f15366o;

    public m2(dt.i<Context> iVar, dt.i<aq.b.a> iVar2, dt.i<rr.b.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.selfie.e.b> iVar4, dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar5, dt.i<com.withpersona.sdk2.camera.e.a> iVar6, dt.i<fn.c.a> iVar7, dt.i<jn.a> iVar8, dt.i<sq.a> iVar9, dt.i<DirectFileUploader> iVar10, dt.i<iu.p0> iVar11, dt.i<bq.a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.selfie.g> iVar13, dt.i<eo.e> iVar14, dt.i<oq.c> iVar15) {
        this.f15353a = iVar;
        this.b = iVar2;
        this.f15354c = iVar3;
        this.f15355d = iVar4;
        this.f15356e = iVar5;
        this.f15357f = iVar6;
        this.f15358g = iVar7;
        this.f15359h = iVar8;
        this.f15360i = iVar9;
        this.f15361j = iVar10;
        this.f15362k = iVar11;
        this.f15363l = iVar12;
        this.f15364m = iVar13;
        this.f15365n = iVar14;
        this.f15366o = iVar15;
    }

    public static m2 a(dt.i<Context> iVar, dt.i<aq.b.a> iVar2, dt.i<rr.b.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.selfie.e.b> iVar4, dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVar5, dt.i<com.withpersona.sdk2.camera.e.a> iVar6, dt.i<fn.c.a> iVar7, dt.i<jn.a> iVar8, dt.i<sq.a> iVar9, dt.i<DirectFileUploader> iVar10, dt.i<iu.p0> iVar11, dt.i<bq.a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.selfie.g> iVar13, dt.i<eo.e> iVar14, dt.i<oq.c> iVar15) {
        return new m2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15);
    }

    public static k2 c(SelfieWorkflow.Input input, androidx.p000lifecycle.l0 l0Var, Context context, aq.b.a aVar, rr.b.a aVar2, com.withpersona.sdk2.inquiry.selfie.e.b bVar, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar3, com.withpersona.sdk2.camera.e.a aVar4, fn.c.a aVar5, jn.a aVar6, sq.a aVar7, DirectFileUploader directFileUploader, iu.p0 p0Var, bq.a.b bVar2, com.withpersona.sdk2.inquiry.selfie.g gVar, eo.e eVar, oq.c cVar) {
        return new k2(input, l0Var, context, aVar, aVar2, bVar, aVar3, aVar4, aVar5, aVar6, aVar7, directFileUploader, p0Var, bVar2, gVar, eVar, cVar);
    }

    public k2 b(SelfieWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return c(input, l0Var, this.f15353a.get(), this.b.get(), this.f15354c.get(), this.f15355d.get(), this.f15356e.get(), this.f15357f.get(), this.f15358g.get(), this.f15359h.get(), this.f15360i.get(), this.f15361j.get(), this.f15362k.get(), this.f15363l.get(), this.f15364m.get(), this.f15365n.get(), this.f15366o.get());
    }
}

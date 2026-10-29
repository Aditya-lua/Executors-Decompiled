package io;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements ft.d<GovernmentIdWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f20640a;
    public final ft.i<k6.s> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<po.c.a> f20641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.governmentid.e> f20642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<uo.j> f20643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<uo.v> f20644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<lo.t0> f20645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<AutoClassifyWorker.b> f20646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.i<jo.n> f20647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ft.i<ln.a> f20648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ft.i<uq.a> f20649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ft.i<pq.c> f20650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f20651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f20652n;

    public h2(ft.i<Context> iVar, ft.i<k6.s> iVar2, ft.i<po.c.a> iVar3, ft.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, ft.i<uo.j> iVar5, ft.i<uo.v> iVar6, ft.i<lo.t0> iVar7, ft.i<AutoClassifyWorker.b> iVar8, ft.i<jo.n> iVar9, ft.i<ln.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        this.f20640a = iVar;
        this.b = iVar2;
        this.f20641c = iVar3;
        this.f20642d = iVar4;
        this.f20643e = iVar5;
        this.f20644f = iVar6;
        this.f20645g = iVar7;
        this.f20646h = iVar8;
        this.f20647i = iVar9;
        this.f20648j = iVar10;
        this.f20649k = iVar11;
        this.f20650l = iVar12;
        this.f20651m = iVar13;
        this.f20652n = iVar14;
    }

    public static h2 a(ft.i<Context> iVar, ft.i<k6.s> iVar2, ft.i<po.c.a> iVar3, ft.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, ft.i<uo.j> iVar5, ft.i<uo.v> iVar6, ft.i<lo.t0> iVar7, ft.i<AutoClassifyWorker.b> iVar8, ft.i<jo.n> iVar9, ft.i<ln.a> iVar10, ft.i<uq.a> iVar11, ft.i<pq.c> iVar12, ft.i<TrackingEventsLogger> iVar13, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        return new h2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14);
    }

    public static GovernmentIdWorkflow c(Context context, k6.s sVar, po.c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, uo.j jVar, uo.v vVar, lo.t0 t0Var, AutoClassifyWorker.b bVar, jo.n nVar, ln.a aVar2, uq.a aVar3, pq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4) {
        return new GovernmentIdWorkflow(context, sVar, aVar, eVar, jVar, vVar, t0Var, bVar, nVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow get() {
        return c(this.f20640a.get(), this.b.get(), this.f20641c.get(), this.f20642d.get(), this.f20643e.get(), this.f20644f.get(), this.f20645g.get(), this.f20646h.get(), this.f20647i.get(), this.f20648j.get(), this.f20649k.get(), this.f20650l.get(), this.f20651m.get(), this.f20652n.get());
    }
}

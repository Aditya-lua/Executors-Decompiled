package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import bo.C1475a;
import com.withpersona.sdk2.inquiry.document.network.C3451a;
import com.withpersona.sdk2.inquiry.document.network.C3453c;
import com.withpersona.sdk2.inquiry.document.network.C3455e;
import com.withpersona.sdk2.inquiry.document.network.C3457g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p239k6.InterfaceC7479s;
import p363pq.C10309c;
import p475uq.C11930a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3445h implements InterfaceC5830d<DocumentWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC7479s> f13224a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f13225b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<PermissionRequestWorkflow> f13226c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3438a> f13227d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C3446i.b> f13228e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C3451a.a> f13229f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C3455e.a> f13230g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<C3453c.a> f13231h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C1475a.a> f13232i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<C3457g.a> f13233j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<C11930a> f13234k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<C10309c> f13235l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<TrackingEventsLogger> f13236m;

    public C3445h(InterfaceC5835i<InterfaceC7479s> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i3, InterfaceC5835i<C3438a> interfaceC5835i4, InterfaceC5835i<C3446i.b> interfaceC5835i5, InterfaceC5835i<C3451a.a> interfaceC5835i6, InterfaceC5835i<C3455e.a> interfaceC5835i7, InterfaceC5835i<C3453c.a> interfaceC5835i8, InterfaceC5835i<C1475a.a> interfaceC5835i9, InterfaceC5835i<C3457g.a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13) {
        this.f13224a = interfaceC5835i;
        this.f13225b = interfaceC5835i2;
        this.f13226c = interfaceC5835i3;
        this.f13227d = interfaceC5835i4;
        this.f13228e = interfaceC5835i5;
        this.f13229f = interfaceC5835i6;
        this.f13230g = interfaceC5835i7;
        this.f13231h = interfaceC5835i8;
        this.f13232i = interfaceC5835i9;
        this.f13233j = interfaceC5835i10;
        this.f13234k = interfaceC5835i11;
        this.f13235l = interfaceC5835i12;
        this.f13236m = interfaceC5835i13;
    }

    /* JADX INFO: renamed from: a */
    public static C3445h m16626a(InterfaceC5835i<InterfaceC7479s> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i3, InterfaceC5835i<C3438a> interfaceC5835i4, InterfaceC5835i<C3446i.b> interfaceC5835i5, InterfaceC5835i<C3451a.a> interfaceC5835i6, InterfaceC5835i<C3455e.a> interfaceC5835i7, InterfaceC5835i<C3453c.a> interfaceC5835i8, InterfaceC5835i<C1475a.a> interfaceC5835i9, InterfaceC5835i<C3457g.a> interfaceC5835i10, InterfaceC5835i<C11930a> interfaceC5835i11, InterfaceC5835i<C10309c> interfaceC5835i12, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i13) {
        return new C3445h(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13);
    }

    /* JADX INFO: renamed from: c */
    public static DocumentWorkflow m16627c(InterfaceC7479s interfaceC7479s, Context context, PermissionRequestWorkflow permissionRequestWorkflow, C3438a c3438a, C3446i.b bVar, C3451a.a aVar, C3455e.a aVar2, C3453c.a aVar3, C1475a.a aVar4, C3457g.a aVar5, C11930a c11930a, C10309c c10309c, TrackingEventsLogger trackingEventsLogger) {
        return new DocumentWorkflow(interfaceC7479s, context, permissionRequestWorkflow, c3438a, bVar, aVar, aVar2, aVar3, aVar4, aVar5, c11930a, c10309c, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentWorkflow get() {
        return m16627c(this.f13224a.get(), this.f13225b.get(), this.f13226c.get(), this.f13227d.get(), this.f13228e.get(), this.f13229f.get(), this.f13230g.get(), this.f13231h.get(), this.f13232i.get(), this.f13233j.get(), this.f13234k.get(), this.f13235l.get(), this.f13236m.get());
    }
}

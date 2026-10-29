package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.nfc.C3828b;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p278lp.C8232n;
import p363pq.C10309c;
import p475uq.C11930a;
import p525wp.C12504c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4157j implements InterfaceC5830d<UiWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f17735a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3828b.a> f17736b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C8232n.a> f17737c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C12504c> f17738d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C4151d.a> f17739e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C4158k.a> f17740f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C11930a> f17741g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<PermissionRequestWorkflow> f17742h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C4148a> f17743i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<C10309c> f17744j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<C6159e> f17745k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<TrackingEventsLogger> f17746l;

    public C4157j(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3828b.a> interfaceC5835i2, InterfaceC5835i<C8232n.a> interfaceC5835i3, InterfaceC5835i<C12504c> interfaceC5835i4, InterfaceC5835i<C4151d.a> interfaceC5835i5, InterfaceC5835i<C4158k.a> interfaceC5835i6, InterfaceC5835i<C11930a> interfaceC5835i7, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i8, InterfaceC5835i<C4148a> interfaceC5835i9, InterfaceC5835i<C10309c> interfaceC5835i10, InterfaceC5835i<C6159e> interfaceC5835i11, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i12) {
        this.f17735a = interfaceC5835i;
        this.f17736b = interfaceC5835i2;
        this.f17737c = interfaceC5835i3;
        this.f17738d = interfaceC5835i4;
        this.f17739e = interfaceC5835i5;
        this.f17740f = interfaceC5835i6;
        this.f17741g = interfaceC5835i7;
        this.f17742h = interfaceC5835i8;
        this.f17743i = interfaceC5835i9;
        this.f17744j = interfaceC5835i10;
        this.f17745k = interfaceC5835i11;
        this.f17746l = interfaceC5835i12;
    }

    /* JADX INFO: renamed from: a */
    public static C4157j m21511a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3828b.a> interfaceC5835i2, InterfaceC5835i<C8232n.a> interfaceC5835i3, InterfaceC5835i<C12504c> interfaceC5835i4, InterfaceC5835i<C4151d.a> interfaceC5835i5, InterfaceC5835i<C4158k.a> interfaceC5835i6, InterfaceC5835i<C11930a> interfaceC5835i7, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i8, InterfaceC5835i<C4148a> interfaceC5835i9, InterfaceC5835i<C10309c> interfaceC5835i10, InterfaceC5835i<C6159e> interfaceC5835i11, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i12) {
        return new C4157j(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12);
    }

    /* JADX INFO: renamed from: c */
    public static UiWorkflow m21512c(Context context, C3828b.a aVar, C8232n.a aVar2, C12504c c12504c, C4151d.a aVar3, C4158k.a aVar4, C11930a c11930a, PermissionRequestWorkflow permissionRequestWorkflow, C4148a c4148a, C10309c c10309c, C6159e c6159e, TrackingEventsLogger trackingEventsLogger) {
        return new UiWorkflow(context, aVar, aVar2, c12504c, aVar3, aVar4, c11930a, permissionRequestWorkflow, c4148a, c10309c, c6159e, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiWorkflow get() {
        return m21512c(this.f17735a.get(), this.f17736b.get(), this.f17737c.get(), this.f17738d.get(), this.f17739e.get(), this.f17740f.get(), this.f17741g.get(), this.f17742h.get(), this.f17743i.get(), this.f17744j.get(), this.f17745k.get(), this.f17746l.get());
    }
}

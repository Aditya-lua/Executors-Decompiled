package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<IntegrationWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f11149a;
    public final i<uq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<a.InterfaceC0204a> f11150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f11151d;

    public c(i<Context> iVar, i<uq.a> iVar2, i<a.InterfaceC0204a> iVar3, i<TrackingEventsLogger> iVar4) {
        this.f11149a = iVar;
        this.b = iVar2;
        this.f11150c = iVar3;
        this.f11151d = iVar4;
    }

    public static c a(i<Context> iVar, i<uq.a> iVar2, i<a.InterfaceC0204a> iVar3, i<TrackingEventsLogger> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static IntegrationWorkflow c(Context context, uq.a aVar, a.InterfaceC0204a interfaceC0204a, TrackingEventsLogger trackingEventsLogger) {
        return new IntegrationWorkflow(context, aVar, interfaceC0204a, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntegrationWorkflow get() {
        return c(this.f11149a.get(), this.b.get(), this.f11150c.get(), this.f11151d.get());
    }
}

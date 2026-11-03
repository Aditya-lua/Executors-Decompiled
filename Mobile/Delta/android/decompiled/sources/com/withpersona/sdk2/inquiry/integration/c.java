package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.d;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<IntegrationWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f11230a;
    public final i<sq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<a.InterfaceC0207a> f11231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f11232d;

    public c(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0207a> iVar3, i<TrackingEventsLogger> iVar4) {
        this.f11230a = iVar;
        this.b = iVar2;
        this.f11231c = iVar3;
        this.f11232d = iVar4;
    }

    public static c a(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0207a> iVar3, i<TrackingEventsLogger> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static IntegrationWorkflow c(Context context, sq.a aVar, a.InterfaceC0207a interfaceC0207a, TrackingEventsLogger trackingEventsLogger) {
        return new IntegrationWorkflow(context, aVar, interfaceC0207a, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntegrationWorkflow get() {
        return c(this.f11230a.get(), this.b.get(), this.f11231c.get(), this.f11232d.get());
    }
}

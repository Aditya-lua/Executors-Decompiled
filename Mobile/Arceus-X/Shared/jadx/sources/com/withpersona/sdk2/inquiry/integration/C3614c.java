package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3614c implements InterfaceC5830d<IntegrationWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f14369a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C11930a> f14370b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3612a.a> f14371c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f14372d;

    public C3614c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C11930a> interfaceC5835i2, InterfaceC5835i<C3612a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        this.f14369a = interfaceC5835i;
        this.f14370b = interfaceC5835i2;
        this.f14371c = interfaceC5835i3;
        this.f14372d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C3614c m18009a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C11930a> interfaceC5835i2, InterfaceC5835i<C3612a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        return new C3614c(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static IntegrationWorkflow m18010c(Context context, C11930a c11930a, C3612a.a aVar, TrackingEventsLogger trackingEventsLogger) {
        return new IntegrationWorkflow(context, c11930a, aVar, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntegrationWorkflow get() {
        return m18010c(this.f14369a.get(), this.f14370b.get(), this.f14371c.get(), this.f14372d.get());
    }
}

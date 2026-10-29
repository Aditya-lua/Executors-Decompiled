package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3857f implements InterfaceC5830d<PermissionRequestWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f15851a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3855d.a> f15852b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<DeviceFeatureRequestWorkflow> f15853c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f15854d;

    public C3857f(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3855d.a> interfaceC5835i2, InterfaceC5835i<DeviceFeatureRequestWorkflow> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        this.f15851a = interfaceC5835i;
        this.f15852b = interfaceC5835i2;
        this.f15853c = interfaceC5835i3;
        this.f15854d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C3857f m19160a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3855d.a> interfaceC5835i2, InterfaceC5835i<DeviceFeatureRequestWorkflow> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        return new C3857f(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static PermissionRequestWorkflow m19161c(Context context, C3855d.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, TrackingEventsLogger trackingEventsLogger) {
        return new PermissionRequestWorkflow(context, aVar, deviceFeatureRequestWorkflow, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PermissionRequestWorkflow get() {
        return m19161c(this.f15851a.get(), this.f15852b.get(), this.f15853c.get(), this.f15854d.get());
    }
}

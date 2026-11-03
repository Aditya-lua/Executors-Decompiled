package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<PermissionRequestWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f12405a;
    public final i<d.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<DeviceFeatureRequestWorkflow> f12406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f12407d;

    public f(i<Context> iVar, i<d.a> iVar2, i<DeviceFeatureRequestWorkflow> iVar3, i<TrackingEventsLogger> iVar4) {
        this.f12405a = iVar;
        this.b = iVar2;
        this.f12406c = iVar3;
        this.f12407d = iVar4;
    }

    public static f a(i<Context> iVar, i<d.a> iVar2, i<DeviceFeatureRequestWorkflow> iVar3, i<TrackingEventsLogger> iVar4) {
        return new f(iVar, iVar2, iVar3, iVar4);
    }

    public static PermissionRequestWorkflow c(Context context, d.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, TrackingEventsLogger trackingEventsLogger) {
        return new PermissionRequestWorkflow(context, aVar, deviceFeatureRequestWorkflow, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PermissionRequestWorkflow get() {
        return c(this.f12405a.get(), this.b.get(), this.f12406c.get(), this.f12407d.get());
    }
}

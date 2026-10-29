package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ft.d<DeviceFeatureRequestWorkflow> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f12309a;
    public final i<a.InterfaceC0225a> b;

    public c(i<Context> iVar, i<a.InterfaceC0225a> iVar2) {
        this.f12309a = iVar;
        this.b = iVar2;
    }

    public static c a(i<Context> iVar, i<a.InterfaceC0225a> iVar2) {
        return new c(iVar, iVar2);
    }

    public static DeviceFeatureRequestWorkflow c(Context context, a.InterfaceC0225a interfaceC0225a) {
        return new DeviceFeatureRequestWorkflow(context, interfaceC0225a);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DeviceFeatureRequestWorkflow get() {
        return c(this.f12309a.get(), this.b.get());
    }
}

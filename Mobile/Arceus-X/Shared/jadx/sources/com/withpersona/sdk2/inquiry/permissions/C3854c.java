package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3854c implements InterfaceC5830d<DeviceFeatureRequestWorkflow> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f15832a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3852a.a> f15833b;

    public C3854c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3852a.a> interfaceC5835i2) {
        this.f15832a = interfaceC5835i;
        this.f15833b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C3854c m19147a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3852a.a> interfaceC5835i2) {
        return new C3854c(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static DeviceFeatureRequestWorkflow m19148c(Context context, C3852a.a aVar) {
        return new DeviceFeatureRequestWorkflow(context, aVar);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DeviceFeatureRequestWorkflow get() {
        return m19148c(this.f15832a.get(), this.f15833b.get());
    }
}

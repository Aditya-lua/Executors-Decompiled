package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3856e implements InterfaceC5830d<C3855d.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f15848a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<AbstractC5854c<String>> f15849b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<TrackingEventsLogger> f15850c;

    public C3856e(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<AbstractC5854c<String>> interfaceC5835i2, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i3) {
        this.f15848a = interfaceC5835i;
        this.f15849b = interfaceC5835i2;
        this.f15850c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3856e m19157a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<AbstractC5854c<String>> interfaceC5835i2, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i3) {
        return new C3856e(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3855d.a m19158c(Context context, AbstractC5854c<String> abstractC5854c, TrackingEventsLogger trackingEventsLogger) {
        return new C3855d.a(context, abstractC5854c, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3855d.a get() {
        return m19158c(this.f15848a.get(), this.f15849b.get(), this.f15850c.get());
    }
}

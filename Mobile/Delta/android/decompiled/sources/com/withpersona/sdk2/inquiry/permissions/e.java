package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ft.d<d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f12322a;
    public final i<g.c<String>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<TrackingEventsLogger> f12323c;

    public e(i<Context> iVar, i<g.c<String>> iVar2, i<TrackingEventsLogger> iVar3) {
        this.f12322a = iVar;
        this.b = iVar2;
        this.f12323c = iVar3;
    }

    public static e a(i<Context> iVar, i<g.c<String>> iVar2, i<TrackingEventsLogger> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d.a c(Context context, g.c<String> cVar, TrackingEventsLogger trackingEventsLogger) {
        return new d.a(context, cVar, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d.a get() {
        return c(this.f12322a.get(), this.b.get(), this.f12323c.get());
    }
}

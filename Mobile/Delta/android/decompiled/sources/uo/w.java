package uo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements ft.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f32550a;
    public final ft.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.c.a> f32551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<uq.a> f32552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f32553e;

    public w(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        this.f32550a = iVar;
        this.b = iVar2;
        this.f32551c = iVar3;
        this.f32552d = iVar4;
        this.f32553e = iVar5;
    }

    public static w a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        return new w(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v c(Context context, com.withpersona.sdk2.camera.e.a aVar, hn.c.a aVar2, uq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f32550a.get(), this.b.get(), this.f32551c.get(), this.f32552d.get(), this.f32553e.get());
    }
}

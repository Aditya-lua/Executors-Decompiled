package po;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements dt.d<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28928a;
    public final dt.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<fn.c.a> f28929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f28930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28931e;

    public w0(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f28928a = iVar;
        this.b = iVar2;
        this.f28929c = iVar3;
        this.f28930d = iVar4;
        this.f28931e = iVar5;
    }

    public static w0 a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new w0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v0 c(Context context, com.withpersona.sdk2.camera.e.a aVar, fn.c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v0(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f28928a.get(), this.b.get(), this.f28929c.get(), this.f28930d.get(), this.f28931e.get());
    }
}

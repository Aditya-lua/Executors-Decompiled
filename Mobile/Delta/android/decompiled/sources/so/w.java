package so;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements dt.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31740a;
    public final dt.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<fn.c.a> f31741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f31742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f31743e;

    public w(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f31740a = iVar;
        this.b = iVar2;
        this.f31741c = iVar3;
        this.f31742d = iVar4;
        this.f31743e = iVar5;
    }

    public static w a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new w(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v c(Context context, com.withpersona.sdk2.camera.e.a aVar, fn.c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f31740a.get(), this.b.get(), this.f31741c.get(), this.f31742d.get(), this.f31743e.get());
    }
}

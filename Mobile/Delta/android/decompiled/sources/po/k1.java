package po;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements dt.d<j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28853a;
    public final dt.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<fn.c.a> f28854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f28855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28856e;

    public k1(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f28853a = iVar;
        this.b = iVar2;
        this.f28854c = iVar3;
        this.f28855d = iVar4;
        this.f28856e = iVar5;
    }

    public static k1 a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new k1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j1 c(Context context, com.withpersona.sdk2.camera.e.a aVar, fn.c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new j1(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 get() {
        return c(this.f28853a.get(), this.b.get(), this.f28854c.get(), this.f28855d.get(), this.f28856e.get());
    }
}

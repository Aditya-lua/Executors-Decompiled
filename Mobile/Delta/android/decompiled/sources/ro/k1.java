package ro;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements ft.d<j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f29993a;
    public final ft.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.c.a> f29994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<uq.a> f29995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f29996e;

    public k1(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        this.f29993a = iVar;
        this.b = iVar2;
        this.f29994c = iVar3;
        this.f29995d = iVar4;
        this.f29996e = iVar5;
    }

    public static k1 a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        return new k1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j1 c(Context context, com.withpersona.sdk2.camera.e.a aVar, hn.c.a aVar2, uq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new j1(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 get() {
        return c(this.f29993a.get(), this.b.get(), this.f29994c.get(), this.f29995d.get(), this.f29996e.get());
    }
}

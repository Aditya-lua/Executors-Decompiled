package ro;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements ft.d<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f30068a;
    public final ft.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.c.a> f30069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<uq.a> f30070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f30071e;

    public w0(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        this.f30068a = iVar;
        this.b = iVar2;
        this.f30069c = iVar3;
        this.f30070d = iVar4;
        this.f30071e = iVar5;
    }

    public static w0 a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<TrackingEventsLogger> iVar5) {
        return new w0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v0 c(Context context, com.withpersona.sdk2.camera.e.a aVar, hn.c.a aVar2, uq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v0(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f30068a.get(), this.b.get(), this.f30069c.get(), this.f30070d.get(), this.f30071e.get());
    }
}

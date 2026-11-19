package fp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements wt.d<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16356a;
    public final wt.i<sn.a0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.c.a> f16357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<ir.b> f16358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f16359e;

    public w0(wt.i<Context> iVar, wt.i<sn.a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        this.f16356a = iVar;
        this.b = iVar2;
        this.f16357c = iVar3;
        this.f16358d = iVar4;
        this.f16359e = iVar5;
    }

    public static w0 a(wt.i<Context> iVar, wt.i<sn.a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        return new w0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v0 c(Context context, sn.a0.a aVar, un.c.a aVar2, ir.b bVar, TrackingEventsLogger trackingEventsLogger) {
        return new v0(context, aVar, aVar2, bVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f16356a.get(), this.b.get(), this.f16357c.get(), this.f16358d.get(), this.f16359e.get());
    }
}

package ip;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import sn.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements wt.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f19683a;
    public final wt.i<a0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.c.a> f19684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<ir.b> f19685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f19686e;

    public w(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        this.f19683a = iVar;
        this.b = iVar2;
        this.f19684c = iVar3;
        this.f19685d = iVar4;
        this.f19686e = iVar5;
    }

    public static w a(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<TrackingEventsLogger> iVar5) {
        return new w(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v c(Context context, a0.a aVar, un.c.a aVar2, ir.b bVar, TrackingEventsLogger trackingEventsLogger) {
        return new v(context, aVar, aVar2, bVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f19683a.get(), this.b.get(), this.f19684c.get(), this.f19685d.get(), this.f19686e.get());
    }
}

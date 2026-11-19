package lp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements wt.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f22453a;
    public final wt.i<ir.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<c.a> f22454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f22455d;

    public w(wt.i<Context> iVar, wt.i<ir.b> iVar2, wt.i<c.a> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        this.f22453a = iVar;
        this.b = iVar2;
        this.f22454c = iVar3;
        this.f22455d = iVar4;
    }

    public static w a(wt.i<Context> iVar, wt.i<ir.b> iVar2, wt.i<c.a> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        return new w(iVar, iVar2, iVar3, iVar4);
    }

    public static v c(Context context, ir.b bVar, c.a aVar, TrackingEventsLogger trackingEventsLogger) {
        return new v(context, bVar, aVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f22453a.get(), this.b.get(), this.f22454c.get(), this.f22455d.get());
    }
}

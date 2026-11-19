package fq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements wt.d<o0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16507a;
    public final wt.i<g.d<String>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f16508c;

    public p0(wt.i<Context> iVar, wt.i<g.d<String>> iVar2, wt.i<TrackingEventsLogger> iVar3) {
        this.f16507a = iVar;
        this.b = iVar2;
        this.f16508c = iVar3;
    }

    public static p0 a(wt.i<Context> iVar, wt.i<g.d<String>> iVar2, wt.i<TrackingEventsLogger> iVar3) {
        return new p0(iVar, iVar2, iVar3);
    }

    public static o0.a c(Context context, g.d<String> dVar, TrackingEventsLogger trackingEventsLogger) {
        return new o0.a(context, dVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0.a get() {
        return c(this.f16507a.get(), this.b.get(), this.f16508c.get());
    }
}

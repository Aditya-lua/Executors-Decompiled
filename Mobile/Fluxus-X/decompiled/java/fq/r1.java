package fq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements wt.d<n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f16514a;
    public final wt.i<o0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<u> f16515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f16516d;

    public r1(wt.i<Context> iVar, wt.i<o0.a> iVar2, wt.i<u> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        this.f16514a = iVar;
        this.b = iVar2;
        this.f16515c = iVar3;
        this.f16516d = iVar4;
    }

    public static r1 a(wt.i<Context> iVar, wt.i<o0.a> iVar2, wt.i<u> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        return new r1(iVar, iVar2, iVar3, iVar4);
    }

    public static n1 c(Context context, o0.a aVar, u uVar, TrackingEventsLogger trackingEventsLogger) {
        return new n1(context, aVar, uVar, trackingEventsLogger);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n1 get() {
        return c(this.f16514a.get(), this.b.get(), this.f16515c.get(), this.f16516d.get());
    }
}

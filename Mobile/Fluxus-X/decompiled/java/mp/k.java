package mp;

import android.content.Context;
import androidx.p000lifecycle.l0;
import av.p0;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import lp.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23475a;
    public final wt.i<ir.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<lp.c.a> f23476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f23477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<p0> f23478e;

    public k(wt.i<Context> iVar, wt.i<ir.b> iVar2, wt.i<lp.c.a> iVar3, wt.i<TrackingEventsLogger> iVar4, wt.i<p0> iVar5) {
        this.f23475a = iVar;
        this.b = iVar2;
        this.f23476c = iVar3;
        this.f23477d = iVar4;
        this.f23478e = iVar5;
    }

    public static k a(wt.i<Context> iVar, wt.i<ir.b> iVar2, wt.i<lp.c.a> iVar3, wt.i<TrackingEventsLogger> iVar4, wt.i<p0> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j c(v.Input input, l0 l0Var, Context context, ir.b bVar, lp.c.a aVar, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new j(input, l0Var, context, bVar, aVar, trackingEventsLogger, p0Var);
    }

    public j b(v.Input input, l0 l0Var) {
        return c(input, l0Var, this.f23475a.get(), this.b.get(), this.f23476c.get(), this.f23477d.get(), this.f23478e.get());
    }
}

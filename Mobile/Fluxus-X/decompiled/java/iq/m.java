package iq;

import android.content.Context;
import androidx.p000lifecycle.l0;
import av.p0;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fq.n1;
import fq.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f19735a;
    public final wt.i<o0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<fq.j.a> f19736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f19737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<p0> f19738e;

    public m(wt.i<Context> iVar, wt.i<o0.a> iVar2, wt.i<fq.j.a> iVar3, wt.i<TrackingEventsLogger> iVar4, wt.i<p0> iVar5) {
        this.f19735a = iVar;
        this.b = iVar2;
        this.f19736c = iVar3;
        this.f19737d = iVar4;
        this.f19738e = iVar5;
    }

    public static m a(wt.i<Context> iVar, wt.i<o0.a> iVar2, wt.i<fq.j.a> iVar3, wt.i<TrackingEventsLogger> iVar4, wt.i<p0> iVar5) {
        return new m(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static l c(n1.Props props, l0 l0Var, Context context, o0.a aVar, fq.j.a aVar2, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new l(props, l0Var, context, aVar, aVar2, trackingEventsLogger, p0Var);
    }

    public l b(n1.Props props, l0 l0Var) {
        return c(props, l0Var, this.f19735a.get(), this.b.get(), this.f19736c.get(), this.f19737d.get(), this.f19738e.get());
    }
}

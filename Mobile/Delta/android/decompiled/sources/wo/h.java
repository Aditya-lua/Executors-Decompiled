package wo;

import android.content.Context;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;
import iu.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f34659a;
    public final i<sq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> f34660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f34661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<p0> f34662e;

    public h(i<Context> iVar, i<sq.a> iVar2, i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        this.f34659a = iVar;
        this.b = iVar2;
        this.f34660c = iVar3;
        this.f34661d = iVar4;
        this.f34662e = iVar5;
    }

    public static h a(i<Context> iVar, i<sq.a> iVar2, i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static com.withpersona.sdk2.inquiry.integration.fragment.b c(IntegrationWorkflow.Input input, l0 l0Var, Context context, sq.a aVar, com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a interfaceC0207a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.integration.fragment.b(input, l0Var, context, aVar, interfaceC0207a, trackingEventsLogger, p0Var);
    }

    public com.withpersona.sdk2.inquiry.integration.fragment.b b(IntegrationWorkflow.Input input, l0 l0Var) {
        return c(input, l0Var, this.f34659a.get(), this.b.get(), this.f34660c.get(), this.f34661d.get(), this.f34662e.get());
    }
}

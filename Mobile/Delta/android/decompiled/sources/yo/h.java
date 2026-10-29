package yo;

import android.content.Context;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ft.i;
import ku.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f36030a;
    public final i<uq.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> f36031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f36032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<p0> f36033e;

    public h(i<Context> iVar, i<uq.a> iVar2, i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        this.f36030a = iVar;
        this.b = iVar2;
        this.f36031c = iVar3;
        this.f36032d = iVar4;
        this.f36033e = iVar5;
    }

    public static h a(i<Context> iVar, i<uq.a> iVar2, i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> iVar3, i<TrackingEventsLogger> iVar4, i<p0> iVar5) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static com.withpersona.sdk2.inquiry.integration.fragment.b c(IntegrationWorkflow.Input input, l0 l0Var, Context context, uq.a aVar, com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a interfaceC0204a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.integration.fragment.b(input, l0Var, context, aVar, interfaceC0204a, trackingEventsLogger, p0Var);
    }

    public com.withpersona.sdk2.inquiry.integration.fragment.b b(IntegrationWorkflow.Input input, l0 l0Var) {
        return c(input, l0Var, this.f36030a.get(), this.b.get(), this.f36031c.get(), this.f36032d.get(), this.f36033e.get());
    }
}

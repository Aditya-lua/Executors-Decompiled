package sp;

import android.content.Context;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import iu.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31759a;
    public final dt.i<com.withpersona.sdk2.inquiry.permissions.d.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> f31760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f31761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<p0> f31762e;

    public l(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.permissions.d.a> iVar2, dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> iVar3, dt.i<TrackingEventsLogger> iVar4, dt.i<p0> iVar5) {
        this.f31759a = iVar;
        this.b = iVar2;
        this.f31760c = iVar3;
        this.f31761d = iVar4;
        this.f31762e = iVar5;
    }

    public static l a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.inquiry.permissions.d.a> iVar2, dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> iVar3, dt.i<TrackingEventsLogger> iVar4, dt.i<p0> iVar5) {
        return new l(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static PermissionRequestStateManager c(PermissionRequestWorkflow.Props props, l0 l0Var, Context context, com.withpersona.sdk2.inquiry.permissions.d.a aVar, com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a interfaceC0228a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new PermissionRequestStateManager(props, l0Var, context, aVar, interfaceC0228a, trackingEventsLogger, p0Var);
    }

    public PermissionRequestStateManager b(PermissionRequestWorkflow.Props props, l0 l0Var) {
        return c(props, l0Var, this.f31759a.get(), this.b.get(), this.f31760c.get(), this.f31761d.get(), this.f31762e.get());
    }
}

package up;

import android.content.Context;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import ku.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f32569a;
    public final ft.i<com.withpersona.sdk2.inquiry.permissions.d.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> f32570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f32571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<p0> f32572e;

    public l(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.permissions.d.a> iVar2, ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> iVar3, ft.i<TrackingEventsLogger> iVar4, ft.i<p0> iVar5) {
        this.f32569a = iVar;
        this.b = iVar2;
        this.f32570c = iVar3;
        this.f32571d = iVar4;
        this.f32572e = iVar5;
    }

    public static l a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.permissions.d.a> iVar2, ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> iVar3, ft.i<TrackingEventsLogger> iVar4, ft.i<p0> iVar5) {
        return new l(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static PermissionRequestStateManager c(PermissionRequestWorkflow.Props props, l0 l0Var, Context context, com.withpersona.sdk2.inquiry.permissions.d.a aVar, com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a interfaceC0225a, TrackingEventsLogger trackingEventsLogger, p0 p0Var) {
        return new PermissionRequestStateManager(props, l0Var, context, aVar, interfaceC0225a, trackingEventsLogger, p0Var);
    }

    public PermissionRequestStateManager b(PermissionRequestWorkflow.Props props, l0 l0Var) {
        return c(props, l0Var, this.f32569a.get(), this.b.get(), this.f32570c.get(), this.f32571d.get(), this.f32572e.get());
    }
}

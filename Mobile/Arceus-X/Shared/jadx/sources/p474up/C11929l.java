package p474up;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.permissions.C3852a;
import com.withpersona.sdk2.inquiry.permissions.C3855d;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: up.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11929l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f42323a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3855d.a> f42324b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3852a.a> f42325c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f42326d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<InterfaceC7906p0> f42327e;

    public C11929l(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3855d.a> interfaceC5835i2, InterfaceC5835i<C3852a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i5) {
        this.f42323a = interfaceC5835i;
        this.f42324b = interfaceC5835i2;
        this.f42325c = interfaceC5835i3;
        this.f42326d = interfaceC5835i4;
        this.f42327e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C11929l m44523a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3855d.a> interfaceC5835i2, InterfaceC5835i<C3852a.a> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i5) {
        return new C11929l(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static PermissionRequestStateManager m44524c(PermissionRequestWorkflow.Props props, C0967l0 c0967l0, Context context, C3855d.a aVar, C3852a.a aVar2, TrackingEventsLogger trackingEventsLogger, InterfaceC7906p0 interfaceC7906p0) {
        return new PermissionRequestStateManager(props, c0967l0, context, aVar, aVar2, trackingEventsLogger, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: b */
    public PermissionRequestStateManager m44525b(PermissionRequestWorkflow.Props props, C0967l0 c0967l0) {
        return m44524c(props, c0967l0, this.f42323a.get(), this.f42324b.get(), this.f42325c.get(), this.f42326d.get(), this.f42327e.get());
    }
}

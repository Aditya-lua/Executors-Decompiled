package p277lo;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p339oo.GovernmentIdHintWorker;
import p475uq.C11930a;
import tr.C11742b;

/* JADX INFO: renamed from: lo.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8213u0 implements InterfaceC5830d<C8211t0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f30454a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<PermissionRequestWorkflow> f30455b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<GovernmentIdAnalyzeWorker.a> f30456c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<GovernmentIdHintWorker.b> f30457d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C11742b.a> f30458e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C3405e.a> f30459f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C6434c.a> f30460g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<C11930a> f30461h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<TrackingEventsLogger> f30462i;

    public C8213u0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i2, InterfaceC5835i<GovernmentIdAnalyzeWorker.a> interfaceC5835i3, InterfaceC5835i<GovernmentIdHintWorker.b> interfaceC5835i4, InterfaceC5835i<C11742b.a> interfaceC5835i5, InterfaceC5835i<C3405e.a> interfaceC5835i6, InterfaceC5835i<C6434c.a> interfaceC5835i7, InterfaceC5835i<C11930a> interfaceC5835i8, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i9) {
        this.f30454a = interfaceC5835i;
        this.f30455b = interfaceC5835i2;
        this.f30456c = interfaceC5835i3;
        this.f30457d = interfaceC5835i4;
        this.f30458e = interfaceC5835i5;
        this.f30459f = interfaceC5835i6;
        this.f30460g = interfaceC5835i7;
        this.f30461h = interfaceC5835i8;
        this.f30462i = interfaceC5835i9;
    }

    /* JADX INFO: renamed from: a */
    public static C8213u0 m33549a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<PermissionRequestWorkflow> interfaceC5835i2, InterfaceC5835i<GovernmentIdAnalyzeWorker.a> interfaceC5835i3, InterfaceC5835i<GovernmentIdHintWorker.b> interfaceC5835i4, InterfaceC5835i<C11742b.a> interfaceC5835i5, InterfaceC5835i<C3405e.a> interfaceC5835i6, InterfaceC5835i<C6434c.a> interfaceC5835i7, InterfaceC5835i<C11930a> interfaceC5835i8, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i9) {
        return new C8213u0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9);
    }

    /* JADX INFO: renamed from: c */
    public static C8211t0 m33550c(Context context, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, C11742b.a aVar2, C3405e.a aVar3, C6434c.a aVar4, C11930a c11930a, TrackingEventsLogger trackingEventsLogger) {
        return new C8211t0(context, permissionRequestWorkflow, aVar, bVar, aVar2, aVar3, aVar4, c11930a, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8211t0 get() {
        return m33550c(this.f30454a.get(), this.f30455b.get(), this.f30456c.get(), this.f30457d.get(), this.f30458e.get(), this.f30459f.get(), this.f30460g.get(), this.f30461h.get(), this.f30462i.get());
    }
}

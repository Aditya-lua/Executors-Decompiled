package ro;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p339oo.GovernmentIdHintWorker;
import p475uq.C11930a;
import tr.C11742b;

/* JADX INFO: renamed from: ro.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10974n0 implements InterfaceC5830d<C10972m0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f38838a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<GovernmentIdAnalyzeWorker.a> f38839b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<GovernmentIdHintWorker.b> f38840c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11742b.a> f38841d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C3405e.a> f38842e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C6434c.a> f38843f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C11930a> f38844g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<TrackingEventsLogger> f38845h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C3875e.a> f38846i;

    public C10974n0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<GovernmentIdAnalyzeWorker.a> interfaceC5835i2, InterfaceC5835i<GovernmentIdHintWorker.b> interfaceC5835i3, InterfaceC5835i<C11742b.a> interfaceC5835i4, InterfaceC5835i<C3405e.a> interfaceC5835i5, InterfaceC5835i<C6434c.a> interfaceC5835i6, InterfaceC5835i<C11930a> interfaceC5835i7, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i8, InterfaceC5835i<C3875e.a> interfaceC5835i9) {
        this.f38838a = interfaceC5835i;
        this.f38839b = interfaceC5835i2;
        this.f38840c = interfaceC5835i3;
        this.f38841d = interfaceC5835i4;
        this.f38842e = interfaceC5835i5;
        this.f38843f = interfaceC5835i6;
        this.f38844g = interfaceC5835i7;
        this.f38845h = interfaceC5835i8;
        this.f38846i = interfaceC5835i9;
    }

    /* JADX INFO: renamed from: a */
    public static C10974n0 m41653a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<GovernmentIdAnalyzeWorker.a> interfaceC5835i2, InterfaceC5835i<GovernmentIdHintWorker.b> interfaceC5835i3, InterfaceC5835i<C11742b.a> interfaceC5835i4, InterfaceC5835i<C3405e.a> interfaceC5835i5, InterfaceC5835i<C6434c.a> interfaceC5835i6, InterfaceC5835i<C11930a> interfaceC5835i7, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i8, InterfaceC5835i<C3875e.a> interfaceC5835i9) {
        return new C10974n0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9);
    }

    /* JADX INFO: renamed from: c */
    public static C10972m0 m41654c(Context context, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, C11742b.a aVar2, C3405e.a aVar3, C6434c.a aVar4, C11930a c11930a, TrackingEventsLogger trackingEventsLogger, C3875e.a aVar5) {
        return new C10972m0(context, aVar, bVar, aVar2, aVar3, aVar4, c11930a, trackingEventsLogger, aVar5);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10972m0 get() {
        return m41654c(this.f38838a.get(), this.f38839b.get(), this.f38840c.get(), this.f38841d.get(), this.f38842e.get(), this.f38843f.get(), this.f38844g.get(), this.f38845h.get(), this.f38846i.get());
    }
}

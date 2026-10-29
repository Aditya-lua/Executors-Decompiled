package p584yp;

import com.withpersona.sdk2.inquiry.selfie.C3955g;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p363pq.C10309c;

/* JADX INFO: renamed from: yp.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C13418w implements InterfaceC5830d<C3955g> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C10309c> f47037a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<TrackingEventsLogger> f47038b;

    public C13418w(InterfaceC5835i<C10309c> interfaceC5835i, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i2) {
        this.f47037a = interfaceC5835i;
        this.f47038b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13418w m49041a(InterfaceC5835i<C10309c> interfaceC5835i, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i2) {
        return new C13418w(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3955g m49042c(C10309c c10309c, TrackingEventsLogger trackingEventsLogger) {
        return new C3955g(c10309c, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3955g get() {
        return m49042c(this.f47037a.get(), this.f47038b.get());
    }
}

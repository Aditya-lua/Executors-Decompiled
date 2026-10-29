package ro;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: ro.k1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10968k1 implements InterfaceC5830d<C10965j1> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f38804a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3405e.a> f38805b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6434c.a> f38806c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11930a> f38807d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<TrackingEventsLogger> f38808e;

    public C10968k1(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i5) {
        this.f38804a = interfaceC5835i;
        this.f38805b = interfaceC5835i2;
        this.f38806c = interfaceC5835i3;
        this.f38807d = interfaceC5835i4;
        this.f38808e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C10968k1 m41588a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i5) {
        return new C10968k1(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C10965j1 m41589c(Context context, C3405e.a aVar, C6434c.a aVar2, C11930a c11930a, TrackingEventsLogger trackingEventsLogger) {
        return new C10965j1(context, aVar, aVar2, c11930a, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10965j1 get() {
        return m41589c(this.f38804a.get(), this.f38805b.get(), this.f38806c.get(), this.f38807d.get(), this.f38808e.get());
    }
}

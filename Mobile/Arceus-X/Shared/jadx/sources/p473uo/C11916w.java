package p473uo;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: uo.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C11916w implements InterfaceC5830d<C11915v> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f42294a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3405e.a> f42295b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6434c.a> f42296c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11930a> f42297d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<TrackingEventsLogger> f42298e;

    public C11916w(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i5) {
        this.f42294a = interfaceC5835i;
        this.f42295b = interfaceC5835i2;
        this.f42296c = interfaceC5835i3;
        this.f42297d = interfaceC5835i4;
        this.f42298e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C11916w m44519a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i5) {
        return new C11916w(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C11915v m44520c(Context context, C3405e.a aVar, C6434c.a aVar2, C11930a c11930a, TrackingEventsLogger trackingEventsLogger) {
        return new C11915v(context, aVar, aVar2, c11930a, trackingEventsLogger);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11915v get() {
        return m44520c(this.f42294a.get(), this.f42295b.get(), this.f42296c.get(), this.f42297d.get(), this.f42298e.get());
    }
}

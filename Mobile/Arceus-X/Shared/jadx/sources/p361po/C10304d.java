package p361po;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.InterfaceC3570b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fo.InterfaceC5720a;
import mq.InterfaceC8644a;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p276ln.InterfaceC8169a;
import p420rq.InterfaceC11067a;

/* JADX INFO: renamed from: po.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10304d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f37094a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC3570b> f37095b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC8644a> f37096c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<InterfaceC5720a> f37097d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<InterfaceC11067a> f37098e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<InterfaceC8169a> f37099f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<TrackingEventsLogger> f37100g;

    public C10304d(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC3570b> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3, InterfaceC5835i<InterfaceC5720a> interfaceC5835i4, InterfaceC5835i<InterfaceC11067a> interfaceC5835i5, InterfaceC5835i<InterfaceC8169a> interfaceC5835i6, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i7) {
        this.f37094a = interfaceC5835i;
        this.f37095b = interfaceC5835i2;
        this.f37096c = interfaceC5835i3;
        this.f37097d = interfaceC5835i4;
        this.f37098e = interfaceC5835i5;
        this.f37099f = interfaceC5835i6;
        this.f37100g = interfaceC5835i7;
    }

    /* JADX INFO: renamed from: a */
    public static C10304d m39599a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC3570b> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3, InterfaceC5835i<InterfaceC5720a> interfaceC5835i4, InterfaceC5835i<InterfaceC11067a> interfaceC5835i5, InterfaceC5835i<InterfaceC8169a> interfaceC5835i6, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i7) {
        return new C10304d(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7);
    }

    /* JADX INFO: renamed from: c */
    public static C10303c m39600c(Context context, String str, String str2, String str3, String str4, InterfaceC3570b interfaceC3570b, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, InterfaceC8644a interfaceC8644a, InterfaceC5720a interfaceC5720a, InterfaceC11067a interfaceC11067a, @Nullable String str5, CameraProperties cameraProperties, InterfaceC8169a interfaceC8169a, TrackingEventsLogger trackingEventsLogger) {
        return new C10303c(context, str, str2, str3, str4, interfaceC3570b, governmentIdRequestArguments, interfaceC8644a, interfaceC5720a, interfaceC11067a, str5, cameraProperties, interfaceC8169a, trackingEventsLogger);
    }

    /* JADX INFO: renamed from: b */
    public C10303c m39601b(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return m39600c(this.f37094a.get(), str, str2, str3, str4, this.f37095b.get(), governmentIdRequestArguments, this.f37096c.get(), this.f37097d.get(), this.f37098e.get(), str5, cameraProperties, this.f37099f.get(), this.f37100g.get());
    }
}

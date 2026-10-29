package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import mn.EnumC8598a;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: hn.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6438e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C6433b0.a> f24426a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C6447i0> f24427b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC7906p0> f24428c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<TrackingEventsLogger> f24429d;

    public C6438e(InterfaceC5835i<C6433b0.a> interfaceC5835i, InterfaceC5835i<C6447i0> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        this.f24426a = interfaceC5835i;
        this.f24427b = interfaceC5835i2;
        this.f24428c = interfaceC5835i3;
        this.f24429d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C6438e m28072a(InterfaceC5835i<C6433b0.a> interfaceC5835i, InterfaceC5835i<C6447i0> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i4) {
        return new C6438e(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C6434c m28073c(C6433b0.a aVar, C6447i0 c6447i0, InterfaceC7906p0 interfaceC7906p0, TrackingEventsLogger trackingEventsLogger, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return new C6434c(aVar, c6447i0, interfaceC7906p0, trackingEventsLogger, cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }

    /* JADX INFO: renamed from: b */
    public C6434c m28074b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return m28073c(this.f24426a.get(), this.f24427b.get(), this.f24428c.get(), this.f24429d.get(), cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }
}

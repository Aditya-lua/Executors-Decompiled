package hn;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import mn.EnumC8598a;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p276ln.InterfaceC8169a;
import p279lq.C8235a;
import p363pq.C10309c;
import p391qq.C10700c;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: hn.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6435c0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f24416a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC8169a> f24417b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10700c> f24418c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C6447i0> f24419d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C8235a> f24420e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<TrackingEventsLogger> f24421f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C10309c> f24422g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<C6159e> f24423h;

    public C6435c0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC8169a> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3, InterfaceC5835i<C6447i0> interfaceC5835i4, InterfaceC5835i<C8235a> interfaceC5835i5, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i6, InterfaceC5835i<C10309c> interfaceC5835i7, InterfaceC5835i<C6159e> interfaceC5835i8) {
        this.f24416a = interfaceC5835i;
        this.f24417b = interfaceC5835i2;
        this.f24418c = interfaceC5835i3;
        this.f24419d = interfaceC5835i4;
        this.f24420e = interfaceC5835i5;
        this.f24421f = interfaceC5835i6;
        this.f24422g = interfaceC5835i7;
        this.f24423h = interfaceC5835i8;
    }

    /* JADX INFO: renamed from: a */
    public static C6435c0 m28068a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC8169a> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3, InterfaceC5835i<C6447i0> interfaceC5835i4, InterfaceC5835i<C8235a> interfaceC5835i5, InterfaceC5835i<TrackingEventsLogger> interfaceC5835i6, InterfaceC5835i<C10309c> interfaceC5835i7, InterfaceC5835i<C6159e> interfaceC5835i8) {
        return new C6435c0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8);
    }

    /* JADX INFO: renamed from: c */
    public static C6433b0 m28069c(Context context, InterfaceC8169a interfaceC8169a, C10700c c10700c, C6447i0 c6447i0, C8235a c8235a, TrackingEventsLogger trackingEventsLogger, C10309c c10309c, C6159e c6159e, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return new C6433b0(context, interfaceC8169a, c10700c, c6447i0, c8235a, trackingEventsLogger, c10309c, c6159e, cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }

    /* JADX INFO: renamed from: b */
    public C6433b0 m28070b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return m28069c(this.f24416a.get(), this.f24417b.get(), this.f24418c.get(), this.f24419d.get(), this.f24420e.get(), this.f24421f.get(), this.f24422g.get(), this.f24423h.get(), cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }
}

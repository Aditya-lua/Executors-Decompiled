package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<b0.a> f19396a;
    public final ft.i<i0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<ku.p0> f19397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f19398d;

    public e(ft.i<b0.a> iVar, ft.i<i0> iVar2, ft.i<ku.p0> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        this.f19396a = iVar;
        this.b = iVar2;
        this.f19397c = iVar3;
        this.f19398d = iVar4;
    }

    public static e a(ft.i<b0.a> iVar, ft.i<i0> iVar2, ft.i<ku.p0> iVar3, ft.i<TrackingEventsLogger> iVar4) {
        return new e(iVar, iVar2, iVar3, iVar4);
    }

    public static c c(b0.a aVar, i0 i0Var, ku.p0 p0Var, TrackingEventsLogger trackingEventsLogger, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar2, @Nullable ur.a aVar3, boolean z10) {
        return new c(aVar, i0Var, p0Var, trackingEventsLogger, cameraChoices, camera2PreviewView, gVar, aVar2, aVar3, z10);
    }

    public c b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar, @Nullable ur.a aVar2, boolean z10) {
        return c(this.f19396a.get(), this.b.get(), this.f19397c.get(), this.f19398d.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}

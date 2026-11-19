package un;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<b0.a> f33611a;
    public final wt.i<i0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<av.p0> f33612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f33613d;

    public e(wt.i<b0.a> iVar, wt.i<i0> iVar2, wt.i<av.p0> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        this.f33611a = iVar;
        this.b = iVar2;
        this.f33612c = iVar3;
        this.f33613d = iVar4;
    }

    public static e a(wt.i<b0.a> iVar, wt.i<i0> iVar2, wt.i<av.p0> iVar3, wt.i<TrackingEventsLogger> iVar4) {
        return new e(iVar, iVar2, iVar3, iVar4);
    }

    public static c c(b0.a aVar, i0 i0Var, av.p0 p0Var, TrackingEventsLogger trackingEventsLogger, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, zn.a aVar2, @Nullable ks.a aVar3, boolean z10) {
        return new c(aVar, i0Var, p0Var, trackingEventsLogger, cameraChoices, camera2PreviewView, gVar, aVar2, aVar3, z10);
    }

    public c b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, zn.a aVar, @Nullable ks.a aVar2, boolean z10) {
        return c(this.f33611a.get(), this.b.get(), this.f33612c.get(), this.f33613d.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}

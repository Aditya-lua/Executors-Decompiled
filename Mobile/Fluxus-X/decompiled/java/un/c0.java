package un;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f33602a;
    public final wt.i<yn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<er.c> f33603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<i0> f33604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<zq.a> f33605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<TrackingEventsLogger> f33606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<dr.c> f33607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<to.e> f33608h;

    public c0(wt.i<Context> iVar, wt.i<yn.a> iVar2, wt.i<er.c> iVar3, wt.i<i0> iVar4, wt.i<zq.a> iVar5, wt.i<TrackingEventsLogger> iVar6, wt.i<dr.c> iVar7, wt.i<to.e> iVar8) {
        this.f33602a = iVar;
        this.b = iVar2;
        this.f33603c = iVar3;
        this.f33604d = iVar4;
        this.f33605e = iVar5;
        this.f33606f = iVar6;
        this.f33607g = iVar7;
        this.f33608h = iVar8;
    }

    public static c0 a(wt.i<Context> iVar, wt.i<yn.a> iVar2, wt.i<er.c> iVar3, wt.i<i0> iVar4, wt.i<zq.a> iVar5, wt.i<TrackingEventsLogger> iVar6, wt.i<dr.c> iVar7, wt.i<to.e> iVar8) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static b0 c(Context context, yn.a aVar, er.c cVar, i0 i0Var, zq.a aVar2, TrackingEventsLogger trackingEventsLogger, dr.c cVar2, to.e eVar, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, zn.a aVar3, @Nullable ks.a aVar4, boolean z10) {
        return new b0(context, aVar, cVar, i0Var, aVar2, trackingEventsLogger, cVar2, eVar, cameraChoices, camera2PreviewView, gVar, aVar3, aVar4, z10);
    }

    public b0 b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, zn.a aVar, @Nullable ks.a aVar2, boolean z10) {
        return c(this.f33602a.get(), this.b.get(), this.f33603c.get(), this.f33604d.get(), this.f33605e.get(), this.f33606f.get(), this.f33607g.get(), this.f33608h.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}

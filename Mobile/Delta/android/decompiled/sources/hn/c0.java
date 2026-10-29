package hn;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f19387a;
    public final ft.i<ln.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qq.c> f19388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<i0> f19389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<lq.a> f19390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<TrackingEventsLogger> f19391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<pq.c> f19392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.i<go.e> f19393h;

    public c0(ft.i<Context> iVar, ft.i<ln.a> iVar2, ft.i<qq.c> iVar3, ft.i<i0> iVar4, ft.i<lq.a> iVar5, ft.i<TrackingEventsLogger> iVar6, ft.i<pq.c> iVar7, ft.i<go.e> iVar8) {
        this.f19387a = iVar;
        this.b = iVar2;
        this.f19388c = iVar3;
        this.f19389d = iVar4;
        this.f19390e = iVar5;
        this.f19391f = iVar6;
        this.f19392g = iVar7;
        this.f19393h = iVar8;
    }

    public static c0 a(ft.i<Context> iVar, ft.i<ln.a> iVar2, ft.i<qq.c> iVar3, ft.i<i0> iVar4, ft.i<lq.a> iVar5, ft.i<TrackingEventsLogger> iVar6, ft.i<pq.c> iVar7, ft.i<go.e> iVar8) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static b0 c(Context context, ln.a aVar, qq.c cVar, i0 i0Var, lq.a aVar2, TrackingEventsLogger trackingEventsLogger, pq.c cVar2, go.e eVar, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar3, @Nullable ur.a aVar4, boolean z10) {
        return new b0(context, aVar, cVar, i0Var, aVar2, trackingEventsLogger, cVar2, eVar, cameraChoices, camera2PreviewView, gVar, aVar3, aVar4, z10);
    }

    public b0 b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar, @Nullable ur.a aVar2, boolean z10) {
        return c(this.f19387a.get(), this.b.get(), this.f19388c.get(), this.f19389d.get(), this.f19390e.get(), this.f19391f.get(), this.f19392g.get(), this.f19393h.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}

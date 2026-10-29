package p589z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import p001a0.C0008c0;
import p020b0.C1176b;
import p140g0.InterfaceC5909m;
import p296n0.InterfaceC8795n1;
import p533x2.C12637g;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13491c implements C13530g6.b {

    /* JADX INFO: renamed from: a */
    public final C0008c0 f47219a;

    /* JADX INFO: renamed from: b */
    public final Range<Float> f47220b;

    /* JADX INFO: renamed from: d */
    public C12997c.a<Void> f47222d;

    /* JADX INFO: renamed from: f */
    public boolean f47224f;

    /* JADX INFO: renamed from: c */
    public float f47221c = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f47223e = 1.0f;

    public C13491c(C0008c0 c0008c0) {
        this.f47224f = false;
        this.f47219a = c0008c0;
        this.f47220b = (Range) c0008c0.m9a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f47224f = c0008c0.m17i();
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: a */
    public void mo49181a(TotalCaptureResult totalCaptureResult) {
        if (this.f47222d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f47223e == f10.floatValue()) {
                this.f47222d.m48314c(null);
                this.f47222d = null;
            }
        }
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: b */
    public float mo49182b() {
        return ((Float) this.f47220b.getLower()).floatValue();
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: c */
    public void mo49183c() {
        this.f47221c = 1.0f;
        C12997c.a<Void> aVar = this.f47222d;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            this.f47222d = null;
        }
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: d */
    public float mo49184d() {
        return ((Float) this.f47220b.getUpper()).floatValue();
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: e */
    public void mo49185e(float f10, C12997c.a<Void> aVar) {
        this.f47221c = f10;
        C12997c.a<Void> aVar2 = this.f47222d;
        if (aVar2 != null) {
            aVar2.m48317f(new InterfaceC5909m.a("There is a new zoomRatio being set"));
        }
        this.f47223e = this.f47221c;
        this.f47222d = aVar;
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: f */
    public Rect mo49186f() {
        return (Rect) C12637g.m47075g((Rect) this.f47219a.m9a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: g */
    public void mo49187g(C12964a.a aVar) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f47221c);
        InterfaceC8795n1.c cVar = InterfaceC8795n1.c.REQUIRED;
        aVar.m48222g(key, fValueOf, cVar);
        if (this.f47224f) {
            C1176b.m6538a(aVar, cVar);
        }
    }
}

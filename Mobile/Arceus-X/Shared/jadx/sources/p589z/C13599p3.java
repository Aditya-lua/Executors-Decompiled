package p589z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p001a0.C0008c0;
import p140g0.InterfaceC5909m;
import p296n0.InterfaceC8795n1;
import p533x2.C12637g;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.p3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13599p3 implements C13530g6.b {

    /* JADX INFO: renamed from: a */
    public final C0008c0 f47593a;

    /* JADX INFO: renamed from: c */
    public C12997c.a<Void> f47595c;

    /* JADX INFO: renamed from: b */
    public Rect f47594b = null;

    /* JADX INFO: renamed from: d */
    public Rect f47596d = null;

    public C13599p3(C0008c0 c0008c0) {
        this.f47593a = c0008c0;
    }

    /* JADX INFO: renamed from: h */
    public static Rect m49566h(Rect rect, float f10) {
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: a */
    public void mo49181a(TotalCaptureResult totalCaptureResult) {
        if (this.f47595c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f47596d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f47595c.m48314c(null);
            this.f47595c = null;
            this.f47596d = null;
        }
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: b */
    public float mo49182b() {
        return 1.0f;
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: c */
    public void mo49183c() {
        this.f47596d = null;
        this.f47594b = null;
        C12997c.a<Void> aVar = this.f47595c;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            this.f47595c = null;
        }
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: d */
    public float mo49184d() {
        Float f10 = (Float) this.f47593a.m9a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < mo49182b() ? mo49182b() : f10.floatValue();
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: e */
    public void mo49185e(float f10, C12997c.a<Void> aVar) {
        this.f47594b = m49566h(m49567i(), f10);
        C12997c.a<Void> aVar2 = this.f47595c;
        if (aVar2 != null) {
            aVar2.m48317f(new InterfaceC5909m.a("There is a new zoomRatio being set"));
        }
        this.f47596d = this.f47594b;
        this.f47595c = aVar;
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: f */
    public Rect mo49186f() {
        Rect rect = this.f47594b;
        return rect != null ? rect : m49567i();
    }

    @Override // p589z.C13530g6.b
    /* JADX INFO: renamed from: g */
    public void mo49187g(C12964a.a aVar) {
        Rect rect = this.f47594b;
        if (rect != null) {
            aVar.m48222g(CaptureRequest.SCALER_CROP_REGION, rect, InterfaceC8795n1.c.REQUIRED);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Rect m49567i() {
        return (Rect) C12637g.m47075g((Rect) this.f47593a.m9a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}

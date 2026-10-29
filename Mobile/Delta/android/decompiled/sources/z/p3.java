package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements g6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.c0 f36748a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1.c.a<Void> f36749c;
    public Rect b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f36750d = null;

    public p3(a0.c0 c0Var) {
        this.f36748a = c0Var;
    }

    public static Rect h(Rect rect, float f10) {
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    @Override // z.g6.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f36749c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f36750d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f36749c.c(null);
            this.f36749c = null;
            this.f36750d = null;
        }
    }

    @Override // z.g6.b
    public float b() {
        return 1.0f;
    }

    @Override // z.g6.b
    public void c() {
        this.f36750d = null;
        this.b = null;
        y1.c.a<Void> aVar = this.f36749c;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f36749c = null;
        }
    }

    @Override // z.g6.b
    public float d() {
        Float f10 = (Float) this.f36748a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < b() ? b() : f10.floatValue();
    }

    @Override // z.g6.b
    public void e(float f10, y1.c.a<Void> aVar) {
        this.b = h(i(), f10);
        y1.c.a<Void> aVar2 = this.f36749c;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("There is a new zoomRatio being set"));
        }
        this.f36750d = this.b;
        this.f36749c = aVar;
    }

    @Override // z.g6.b
    public Rect f() {
        Rect rect = this.b;
        return rect != null ? rect : i();
    }

    @Override // z.g6.b
    public void g(y.a.C0647a c0647a) {
        Rect rect = this.b;
        if (rect != null) {
            c0647a.g(CaptureRequest.SCALER_CROP_REGION, rect, n0.n1.c.REQUIRED);
        }
    }

    public final Rect i() {
        return (Rect) x2.g.g((Rect) this.f36748a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}

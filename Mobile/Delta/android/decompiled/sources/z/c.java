package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.c0 f37142a;
    public final Range<Float> b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.c.a<Void> f37144d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37146f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f37143c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f37145e = 1.0f;

    public c(a0.c0 c0Var) {
        this.f37146f = false;
        this.f37142a = c0Var;
        this.b = (Range) c0Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f37146f = c0Var.i();
    }

    @Override // z.g6.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f37144d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f37145e == f10.floatValue()) {
                this.f37144d.c(null);
                this.f37144d = null;
            }
        }
    }

    @Override // z.g6.b
    public float b() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // z.g6.b
    public void c() {
        this.f37143c = 1.0f;
        y1.c.a<Void> aVar = this.f37144d;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f37144d = null;
        }
    }

    @Override // z.g6.b
    public float d() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // z.g6.b
    public void e(float f10, y1.c.a<Void> aVar) {
        this.f37143c = f10;
        y1.c.a<Void> aVar2 = this.f37144d;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("There is a new zoomRatio being set"));
        }
        this.f37145e = this.f37143c;
        this.f37144d = aVar;
    }

    @Override // z.g6.b
    public Rect f() {
        return (Rect) x2.g.g((Rect) this.f37142a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // z.g6.b
    public void g(y.a.C0662a c0662a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f37143c);
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0662a.g(key, fValueOf, cVar);
        if (this.f37146f) {
            b0.b.a(c0662a, cVar);
        }
    }
}

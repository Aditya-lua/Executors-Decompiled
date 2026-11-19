package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.c0 f38247a;
    public final Range<Float> b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.c.a<Void> f38249d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38251f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38248c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f38250e = 1.0f;

    public c(a0.c0 c0Var) {
        this.f38251f = false;
        this.f38247a = c0Var;
        this.b = (Range) c0Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f38251f = c0Var.i();
    }

    @Override // z.g6.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f38249d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f38250e == f10.floatValue()) {
                this.f38249d.c(null);
                this.f38249d = null;
            }
        }
    }

    @Override // z.g6.b
    public float b() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // z.g6.b
    public void c() {
        this.f38248c = 1.0f;
        y1.c.a<Void> aVar = this.f38249d;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f38249d = null;
        }
    }

    @Override // z.g6.b
    public float d() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // z.g6.b
    public void e(float f10, y1.c.a<Void> aVar) {
        this.f38248c = f10;
        y1.c.a<Void> aVar2 = this.f38249d;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("There is a new zoomRatio being set"));
        }
        this.f38250e = this.f38248c;
        this.f38249d = aVar;
    }

    @Override // z.g6.b
    public Rect f() {
        return (Rect) x2.g.g((Rect) this.f38247a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // z.g6.b
    public void g(y.a.C0758a c0758a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f38248c);
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0758a.g(key, fValueOf, cVar);
        if (this.f38251f) {
            b0.b.a(c0758a, cVar);
        }
    }
}

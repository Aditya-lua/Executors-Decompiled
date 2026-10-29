package z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f36772a;
    public final androidx.p000lifecycle.d0<Integer> b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36774d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f36777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y1.c.a<Void> f36779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y.c f36781k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f36773c = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f36775e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36776f = false;

    public q4(y yVar, a0.c0 c0Var, Executor executor) {
        this.f36772a = yVar;
        this.f36777g = executor;
        boolean zB = b(c0Var);
        this.f36774d = zB;
        this.b = new androidx.p000lifecycle.d0<>(-1);
        y.c cVar = new y.c() { // from class: z.p4
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return q4.a(this.f36751a, totalCaptureResult);
            }
        };
        this.f36781k = cVar;
        if (zB) {
            yVar.B(cVar);
        }
    }

    public static /* synthetic */ boolean a(q4 q4Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (q4Var.f36779i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == q4Var.f36780j) {
                    q4Var.f36779i.c(null);
                    q4Var.f36779i = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        q4Var.e(q4Var.b, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && q4Var.f36780j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            q4Var.e(q4Var.b, num.intValue());
        }
        return false;
    }

    public static boolean b(a0.c0 c0Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) c0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.p000lifecycle.a0<Integer> c() {
        return this.b;
    }

    public void d(boolean z10) {
        if (this.f36778h == z10) {
            return;
        }
        this.f36778h = z10;
        if (z10) {
            return;
        }
        if (this.f36780j) {
            this.f36780j = false;
            this.f36772a.E(false);
            e(this.b, -1);
        }
        y1.c.a<Void> aVar = this.f36779i;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f36779i = null;
        }
    }

    public final void e(androidx.p000lifecycle.d0<Integer> d0Var, int i10) {
        if (this.f36773c.getAndSet(i10) != i10) {
            if (p0.z.d()) {
                d0Var.o(Integer.valueOf(i10));
            } else {
                d0Var.m(Integer.valueOf(i10));
            }
        }
    }

    public void f(boolean z10) {
        synchronized (this.f36775e) {
            try {
                this.f36776f = z10;
                if (z10) {
                    if (this.f36780j) {
                        this.f36780j = false;
                        this.f36772a.E(false);
                        e(this.b, -1);
                        y1.c.a<Void> aVar = this.f36779i;
                        if (aVar != null) {
                            aVar.f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f36779i = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

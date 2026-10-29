package p589z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0008c0;
import p140g0.InterfaceC5909m;
import p347p0.C10110z;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C13607q4 {

    /* JADX INFO: renamed from: a */
    public final C13658y f47621a;

    /* JADX INFO: renamed from: b */
    public final C0949d0<Integer> f47622b;

    /* JADX INFO: renamed from: d */
    public final boolean f47624d;

    /* JADX INFO: renamed from: g */
    public final Executor f47627g;

    /* JADX INFO: renamed from: h */
    public boolean f47628h;

    /* JADX INFO: renamed from: i */
    public C12997c.a<Void> f47629i;

    /* JADX INFO: renamed from: j */
    public boolean f47630j;

    /* JADX INFO: renamed from: k */
    public final C13658y.c f47631k;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f47623c = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e */
    public final Object f47625e = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f47626f = false;

    public C13607q4(C13658y c13658y, C0008c0 c0008c0, Executor executor) {
        this.f47621a = c13658y;
        this.f47627g = executor;
        boolean zM49582b = m49582b(c0008c0);
        this.f47624d = zM49582b;
        this.f47622b = new C0949d0<>(-1);
        C13658y.c cVar = new C13658y.c() { // from class: z.p4
            @Override // p589z.C13658y.c
            /* JADX INFO: renamed from: a */
            public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                return C13607q4.m49581a(this.f47597a, totalCaptureResult);
            }
        };
        this.f47631k = cVar;
        if (zM49582b) {
            c13658y.m49762B(cVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49581a(C13607q4 c13607q4, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (c13607q4.f47629i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == c13607q4.f47630j) {
                    c13607q4.f47629i.m48314c(null);
                    c13607q4.f47629i = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        c13607q4.m49585e(c13607q4.f47622b, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && c13607q4.f47630j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            c13607q4.m49585e(c13607q4.f47622b, num.intValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m49582b(C0008c0 c0008c0) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) c0008c0.m9a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0940a0<Integer> m49583c() {
        return this.f47622b;
    }

    /* JADX INFO: renamed from: d */
    public void m49584d(boolean z10) {
        if (this.f47628h == z10) {
            return;
        }
        this.f47628h = z10;
        if (z10) {
            return;
        }
        if (this.f47630j) {
            this.f47630j = false;
            this.f47621a.m49765E(false);
            m49585e(this.f47622b, -1);
        }
        C12997c.a<Void> aVar = this.f47629i;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            this.f47629i = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m49585e(C0949d0<Integer> c0949d0, int i10) {
        if (this.f47623c.getAndSet(i10) != i10) {
            if (C10110z.m39010d()) {
                c0949d0.mo4863o(Integer.valueOf(i10));
            } else {
                c0949d0.mo4861m(Integer.valueOf(i10));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m49586f(boolean z10) {
        synchronized (this.f47625e) {
            try {
                this.f47626f = z10;
                if (z10) {
                    if (this.f47630j) {
                        this.f47630j = false;
                        this.f47621a.m49765E(false);
                        m49585e(this.f47622b, -1);
                        C12997c.a<Void> aVar = this.f47629i;
                        if (aVar != null) {
                            aVar.m48317f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f47629i = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

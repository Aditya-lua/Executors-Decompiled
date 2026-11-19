package z;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f38721a;
    public final androidx.p000lifecycle.d0<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.p000lifecycle.d0<Integer> f38722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f38724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1.c.a<Void> f38729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.c.a<Void> f38730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38731l;

    public x5(y yVar, a0.c0 c0Var, Executor executor) {
        this.f38721a = yVar;
        this.f38724e = executor;
        Objects.requireNonNull(c0Var);
        boolean zA = d0.g.a(new d1(c0Var));
        this.f38723d = zA;
        boolean zH = c0Var.h();
        this.f38726g = zH;
        int iC = (zA && zH) ? c0Var.c() : 0;
        this.f38727h = iC;
        this.f38728i = iC;
        this.b = new androidx.p000lifecycle.d0<>(0);
        this.f38722c = new androidx.p000lifecycle.d0<>(Integer.valueOf(this.f38727h));
        yVar.B(new y.c() { // from class: z.w5
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return x5.b(this.f38712a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean b(x5 x5Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (x5Var.f38730k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == x5Var.f38731l) {
                x5Var.f38730k.c(null);
                x5Var.f38730k = null;
            }
        }
        if (x5Var.f38726g && Build.VERSION.SDK_INT >= 35 && x5Var.f38729j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == x5Var.f38728i) {
            x5Var.f38729j.c(null);
            x5Var.f38729j = null;
        }
        return false;
    }

    public static /* synthetic */ Object c(final x5 x5Var, final int i10, boolean z10, final y1.c.a aVar) {
        x5Var.f38724e.execute(new Runnable() { // from class: z.u5
            @Override // java.lang.Runnable
            public final void run() {
                this.f38693a.e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    public pe.x<Void> d(final boolean z10) {
        if (!this.f38723d) {
            g0.r1.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return r0.n.n(new IllegalStateException("No flash unit"));
        }
        k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.v5
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return x5.c(this.f38702a, i10, z10, aVar);
            }
        });
    }

    public void e(y1.c.a<Void> aVar, int i10) {
        if (!this.f38723d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f38725f) {
            k(0);
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f38721a.b0()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f38731l = i10 != 0;
        this.f38721a.F(i10);
        k(i10);
        y1.c.a<Void> aVar2 = this.f38730k;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("There is a new enableTorch being set"));
        }
        this.f38730k = aVar;
    }

    public void f() {
        if (this.f38731l) {
            this.f38731l = false;
            k(0);
        }
    }

    public androidx.p000lifecycle.a0<Integer> g() {
        return this.b;
    }

    public androidx.p000lifecycle.a0<Integer> h() {
        return this.f38722c;
    }

    public void i(boolean z10) {
        if (this.f38725f == z10) {
            return;
        }
        this.f38725f = z10;
        if (z10) {
            return;
        }
        if (this.f38731l) {
            this.f38731l = false;
            this.f38728i = this.f38727h;
            this.f38721a.F(0);
            k(0);
            j(this.f38722c, Integer.valueOf(this.f38727h));
        }
        y1.c.a<Void> aVar = this.f38730k;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f38730k = null;
        }
        y1.c.a<Void> aVar2 = this.f38729j;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("Camera is not active."));
            this.f38729j = null;
        }
    }

    public final <T> void j(androidx.p000lifecycle.d0<T> d0Var, T t8) {
        if (p0.z.d()) {
            d0Var.o(t8);
        } else {
            d0Var.m(t8);
        }
    }

    public final void k(int i10) {
        j(this.b, Integer.valueOf(i10 != 1 ? 0 : 1));
    }
}

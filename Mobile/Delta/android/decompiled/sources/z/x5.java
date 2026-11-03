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
    public final y f37616a;
    public final androidx.p000lifecycle.d0<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.p000lifecycle.d0<Integer> f37617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f37619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1.c.a<Void> f37624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.c.a<Void> f37625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37626l;

    public x5(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37616a = yVar;
        this.f37619e = executor;
        Objects.requireNonNull(c0Var);
        boolean zA = d0.g.a(new d1(c0Var));
        this.f37618d = zA;
        boolean zH = c0Var.h();
        this.f37621g = zH;
        int iC = (zA && zH) ? c0Var.c() : 0;
        this.f37622h = iC;
        this.f37623i = iC;
        this.b = new androidx.p000lifecycle.d0<>(0);
        this.f37617c = new androidx.p000lifecycle.d0<>(Integer.valueOf(this.f37622h));
        yVar.B(new y.c() { // from class: z.w5
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return x5.b(this.f37607a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean b(x5 x5Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (x5Var.f37625k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == x5Var.f37626l) {
                x5Var.f37625k.c(null);
                x5Var.f37625k = null;
            }
        }
        if (x5Var.f37621g && Build.VERSION.SDK_INT >= 35 && x5Var.f37624j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == x5Var.f37623i) {
            x5Var.f37624j.c(null);
            x5Var.f37624j = null;
        }
        return false;
    }

    public static /* synthetic */ Object c(final x5 x5Var, final int i10, boolean z10, final y1.c.a aVar) {
        x5Var.f37619e.execute(new Runnable() { // from class: z.u5
            @Override // java.lang.Runnable
            public final void run() {
                this.f37588a.e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    public ne.x<Void> d(final boolean z10) {
        if (!this.f37618d) {
            g0.r1.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return r0.n.n(new IllegalStateException("No flash unit"));
        }
        k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.v5
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return x5.c(this.f37597a, i10, z10, aVar);
            }
        });
    }

    public void e(y1.c.a<Void> aVar, int i10) {
        if (!this.f37618d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f37620f) {
            k(0);
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f37616a.b0()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f37626l = i10 != 0;
        this.f37616a.F(i10);
        k(i10);
        y1.c.a<Void> aVar2 = this.f37625k;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("There is a new enableTorch being set"));
        }
        this.f37625k = aVar;
    }

    public void f() {
        if (this.f37626l) {
            this.f37626l = false;
            k(0);
        }
    }

    public androidx.p000lifecycle.a0<Integer> g() {
        return this.b;
    }

    public androidx.p000lifecycle.a0<Integer> h() {
        return this.f37617c;
    }

    public void i(boolean z10) {
        if (this.f37620f == z10) {
            return;
        }
        this.f37620f = z10;
        if (z10) {
            return;
        }
        if (this.f37626l) {
            this.f37626l = false;
            this.f37623i = this.f37622h;
            this.f37616a.F(0);
            k(0);
            j(this.f37617c, Integer.valueOf(this.f37622h));
        }
        y1.c.a<Void> aVar = this.f37625k;
        if (aVar != null) {
            aVar.f(new g0.m.a("Camera is not active."));
            this.f37625k = null;
        }
        y1.c.a<Void> aVar2 = this.f37624j;
        if (aVar2 != null) {
            aVar2.f(new g0.m.a("Camera is not active."));
            this.f37624j = null;
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

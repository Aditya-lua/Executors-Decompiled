package p589z;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.Objects;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p001a0.C0008c0;
import p063d0.C4376g;
import p140g0.C5931r1;
import p140g0.InterfaceC5909m;
import p347p0.C10110z;
import p397r0.C10773n;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C13657x5 {

    /* JADX INFO: renamed from: a */
    public final C13658y f47823a;

    /* JADX INFO: renamed from: b */
    public final C0949d0<Integer> f47824b;

    /* JADX INFO: renamed from: c */
    public final C0949d0<Integer> f47825c;

    /* JADX INFO: renamed from: d */
    public final boolean f47826d;

    /* JADX INFO: renamed from: e */
    public final Executor f47827e;

    /* JADX INFO: renamed from: f */
    public boolean f47828f;

    /* JADX INFO: renamed from: g */
    public boolean f47829g;

    /* JADX INFO: renamed from: h */
    public int f47830h;

    /* JADX INFO: renamed from: i */
    public int f47831i;

    /* JADX INFO: renamed from: j */
    public C12997c.a<Void> f47832j;

    /* JADX INFO: renamed from: k */
    public C12997c.a<Void> f47833k;

    /* JADX INFO: renamed from: l */
    public boolean f47834l;

    public C13657x5(C13658y c13658y, C0008c0 c0008c0, Executor executor) {
        this.f47823a = c13658y;
        this.f47827e = executor;
        Objects.requireNonNull(c0008c0);
        boolean zM22031a = C4376g.m22031a(new C13501d1(c0008c0));
        this.f47826d = zM22031a;
        boolean zM16h = c0008c0.m16h();
        this.f47829g = zM16h;
        int iM11c = (zM22031a && zM16h) ? c0008c0.m11c() : 0;
        this.f47830h = iM11c;
        this.f47831i = iM11c;
        this.f47824b = new C0949d0<>(0);
        this.f47825c = new C0949d0<>(Integer.valueOf(this.f47830h));
        c13658y.m49762B(new C13658y.c() { // from class: z.w5
            @Override // p589z.C13658y.c
            /* JADX INFO: renamed from: a */
            public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                return C13657x5.m49737b(this.f47811a, totalCaptureResult);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m49737b(C13657x5 c13657x5, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (c13657x5.f47833k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == c13657x5.f47834l) {
                c13657x5.f47833k.m48314c(null);
                c13657x5.f47833k = null;
            }
        }
        if (c13657x5.f47829g && Build.VERSION.SDK_INT >= 35 && c13657x5.f47832j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == c13657x5.f47831i) {
            c13657x5.f47832j.m48314c(null);
            c13657x5.f47832j = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m49738c(final C13657x5 c13657x5, final int i10, boolean z10, final C12997c.a aVar) {
        c13657x5.f47827e.execute(new Runnable() { // from class: z.u5
            @Override // java.lang.Runnable
            public final void run() {
                this.f47786a.m49740e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceFutureC9440x<Void> m49739d(final boolean z10) {
        if (!this.f47826d) {
            C5931r1.m26561a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return C10773n.m40991n(new IllegalStateException("No flash unit"));
        }
        m49746k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return C12997c.m48311a(new C12997c.c() { // from class: z.v5
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13657x5.m49738c(this.f47798a, i10, z10, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m49740e(C12997c.a<Void> aVar, int i10) {
        if (!this.f47826d) {
            if (aVar != null) {
                aVar.m48317f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f47828f) {
            m49746k(0);
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f47823a.m49787b0()) {
            if (aVar != null) {
                aVar.m48317f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f47834l = i10 != 0;
        this.f47823a.m49766F(i10);
        m49746k(i10);
        C12997c.a<Void> aVar2 = this.f47833k;
        if (aVar2 != null) {
            aVar2.m48317f(new InterfaceC5909m.a("There is a new enableTorch being set"));
        }
        this.f47833k = aVar;
    }

    /* JADX INFO: renamed from: f */
    public void m49741f() {
        if (this.f47834l) {
            this.f47834l = false;
            m49746k(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public AbstractC0940a0<Integer> m49742g() {
        return this.f47824b;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC0940a0<Integer> m49743h() {
        return this.f47825c;
    }

    /* JADX INFO: renamed from: i */
    public void m49744i(boolean z10) {
        if (this.f47828f == z10) {
            return;
        }
        this.f47828f = z10;
        if (z10) {
            return;
        }
        if (this.f47834l) {
            this.f47834l = false;
            this.f47831i = this.f47830h;
            this.f47823a.m49766F(0);
            m49746k(0);
            m49745j(this.f47825c, Integer.valueOf(this.f47830h));
        }
        C12997c.a<Void> aVar = this.f47833k;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            this.f47833k = null;
        }
        C12997c.a<Void> aVar2 = this.f47832j;
        if (aVar2 != null) {
            aVar2.m48317f(new InterfaceC5909m.a("Camera is not active."));
            this.f47832j = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final <T> void m49745j(C0949d0<T> c0949d0, T t8) {
        if (C10110z.m39010d()) {
            c0949d0.mo4863o(t8);
        } else {
            c0949d0.mo4861m(t8);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m49746k(int i10) {
        m49745j(this.f47824b, Integer.valueOf(i10 != 1 ? 0 : 1));
    }
}
